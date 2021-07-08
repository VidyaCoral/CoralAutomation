package api.parent;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ParentGetDetails {
    @Test
    public static void test_retrieve(String parent_fname, String bearer_id)
    {

        RestAssured.baseURI = "http://staging-api.mycoralacademy.com";
        String res = given().log().all().header("Authorization", "Bearer " + bearer_id,
                "Content-Type","application/json").when().get("/v1/parents/profile").then().assertThat().statusCode(200).extract().response().asString();;
        String response = res.toString();
        System.out.println("The response is: " + response);
        JsonPath js = new JsonPath (response);
        Assert.assertEquals(parent_fname, js.getString("data.User.first_name"));

    }

}
