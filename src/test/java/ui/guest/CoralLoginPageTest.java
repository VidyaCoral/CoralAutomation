package ui.guest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.core.BaseTest;
import ui.pageobjects.guest.CoralHomePage;
import ui.pageobjects.guest.CoralLoginPage;

public class CoralLoginPageTest extends BaseTest {

    @Test
    public void LoginWithEmail() {
        CoralLoginPage coralLoginPage = new CoralLoginPage(getDriver());
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.LoginWebElement().click();
        coralLoginPage.SetEmailId();
        coralLoginPage.SetPassword();
        coralLoginPage.SignIn();
        coralLoginPage.Logout();

    }
    @Test
    public void LoginWithGmail() throws InterruptedException {
        CoralLoginPage coralLoginPage = new CoralLoginPage(getDriver());
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.LoginWebElement().click();
        Thread.sleep(1000);
        coralLoginPage.GoogleSign().click();
        coralLoginPage.SwitchLoginFrame();
        coralLoginPage.GoogleAccount().sendKeys("vidya.coralac");
        Thread.sleep(1000);
        coralLoginPage.NextButton().click();
        Thread.sleep(1000);
        coralLoginPage.GooglePassword().sendKeys("Welcome123?");
        Thread.sleep(1000);
        coralLoginPage.NextButton().click();
        Thread.sleep(1000);
        coralLoginPage.Logout();
    }

    @Test
    public void LoginValidateFields() throws InterruptedException {
        CoralLoginPage coralLoginPage = new CoralLoginPage(getDriver());
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.LoginWebElement().click();
        coralLoginPage.SignIn();
        Assert.assertEquals(true,coralLoginPage.VerifyEmail().isDisplayed());
        Assert.assertEquals(true,coralLoginPage.VerifyPassword().isDisplayed());
        coralLoginPage.SetEmailId();
        System.out.println("Entered email");
        //Thread.sleep(1000);
        //Assert.assertEquals(false,coralLoginPage.VerifyEmail().isDisplayed());
        System.out.println("Entered email");
        //Assert.assertEquals(true,coralLoginPage.VerifyPassword().isDisplayed());
        coralLoginPage.SetPassword();
        coralLoginPage.EyeIcon().click();
        coralLoginPage.EyeIcon().click();
        String password = coralLoginPage.ViewPasswordText().getAttribute("type");
        System.out.println(password);
        //Assert.assertEquals(false,coralLoginPage.VerifyPassword().isDisplayed());
    }
    @Test
    public void RegisterEmail(){
        CoralLoginPage coralLoginPage = new CoralLoginPage(getDriver());
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.LoginWebElement().click();
        coralLoginPage.RegisterLink().click();
        coralLoginPage.AlreadyAccount().click();
        coralLoginPage.RegisterLink().click();
        coralLoginPage.ParentFirstName().sendKeys("test");
        coralLoginPage.ParentLastName().sendKeys("test");
        coralLoginPage.SetEmailId();
        coralLoginPage.SetPassword();
        coralLoginPage.Terms().click();
        coralLoginPage.SignIn();
        coralLoginPage.Logout();

    }
    @Test
    public void RegisterValidateFields() throws InterruptedException {
        CoralLoginPage coralLoginPage = new CoralLoginPage(getDriver());
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.LoginWebElement().click();
        coralLoginPage.RegisterLink().click();
        coralLoginPage.SignIn();
        Assert.assertEquals(true,coralLoginPage.VerifyFirstName().isDisplayed());
        Assert.assertEquals(true,coralLoginPage.VerifyLastName().isDisplayed());
        Assert.assertEquals(true,coralLoginPage.VerifyTerms().isDisplayed());
        Assert.assertEquals(true,coralLoginPage.VerifyPassword().isDisplayed());
        Assert.assertEquals(true,coralLoginPage.VerifyEmail().isDisplayed());
        Assert.assertEquals(true,coralLoginPage.VerifyPassword().isDisplayed());
        String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
        //coralLoginPage.TermsOfService().sendKeys(clicklnk);
        coralLoginPage.PrivacyPolicy().sendKeys(clicklnk);
        Thread.sleep(1000);
        coralLoginPage.SwitchTab();
        Thread.sleep(1000);
        coralLoginPage.PrivacyPolicy().sendKeys(clicklnk);
        Thread.sleep(1000);
        coralLoginPage.SwitchTab();
    }
}
