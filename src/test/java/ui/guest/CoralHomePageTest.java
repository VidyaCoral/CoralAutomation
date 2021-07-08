package ui.guest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.core.BaseTest;
import ui.pageobjects.guest.CoralHomePage;

public class CoralHomePageTest extends BaseTest{


    @Test
    public void homepageTests() {

        CoralHomePage coralHomepage = new CoralHomePage(getDriver());

        WebElement team_left_arrow = coralHomepage.TeamLeftArrowWebElement();
        WebElement team_right_arrow = coralHomepage.TeamRightArrowWebElement();
        Assert.assertEquals(team_left_arrow.isEnabled(), true);
        WebElement final_section = coralHomepage.LastSection();



        //Below section verifies if more classes are clicable or not


    }
    @Test
    public void VerifyPageLinks() throws InterruptedException {
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.AboutUsWebElement(0);
        coralHomepage.FindClassesWebElement().click();
        coralHomepage.FAQWebElement(0);
        coralHomepage.JoinWebElement().click();

        coralHomepage.LoginReturn().click();
        coralHomepage.LoginWebElement().click();

        coralHomepage.LoginReturn().click();

    }

    @Test
    public void VerifyPageSections()
    {
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.Logo().click();
        WebElement team_left_arrow = coralHomepage.TeamLeftArrowWebElement();
        WebElement team_right_arrow = coralHomepage.TeamRightArrowWebElement();
        if(coralHomepage.LeftArrowDisabled().isEnabled() != false) {
            while (coralHomepage.RightArrowDisabled().isEnabled() != false) {
                team_right_arrow.click();
                if(coralHomepage.RightArrowDisabled().getAttribute("class").contains("unique-disabled"))
                    break;
            }
        }

        if(coralHomepage.RightArrowDisabled().isEnabled()!=false) {
            while (coralHomepage.LeftArrowDisabled().isEnabled() != false) {
                team_left_arrow.click();
                if(coralHomepage.LeftArrowDisabled().getAttribute("class").contains("unique-disabled"))
                    break;
            }
        }
        while(true) {

            team_right_arrow.click();
            System.out.println(coralHomepage.LastSection().isDisplayed());
            if(coralHomepage.LastSection().isDisplayed() != false) {
                coralHomepage.LastClickSection().click();
                waitForPage();
                //  coralHomepage.FindClasses();
                break;

            }
        }
    }

    @Test
    public void VerifyRegisterFree() {
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.Logo().click();
        coralHomepage.RegisterFree().click();
        coralHomepage.LoginReturn();
    }

    @Test
    public void VerifySendMessage()  {
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.Logo().click();
        coralHomepage.SendMessage().click();
        returnPreviousPage();
    }

    @Test
    public void VerifyFooterSection() throws InterruptedException{
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.AboutUsWebElement(1);
        //coralHomepage.Blog().click();
        coralHomepage.FAQWebElement(1);
        coralHomepage.Teach().click();
        Thread.sleep(1000);
        coralHomepage.LoginReturn().click();
        coralHomepage.PrivacyPolicy().click();
        coralHomepage.T_C().click();

    }
}
