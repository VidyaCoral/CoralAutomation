package ui.parent;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.core.BaseTest;
import ui.pageobjects.guest.CoralFAQPage;
import ui.pageobjects.guest.CoralHomePage;
import ui.pageobjects.guest.CoralJoinPage;
import ui.pageobjects.guest.CoralLoginPage;
import ui.pageobjects.parent.CoralParentPage;

public class CoralParentPageTest extends BaseTest {

    @Test
    public void Login()  {
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        CoralLoginPage coralLoginPage = new CoralLoginPage(getDriver());
        coralHomepage.LoginWebElement().click();
        coralLoginPage.SetEmailId();
        coralLoginPage.SetPassword();
        coralLoginPage.SignIn();
       // coralLoginPage.Logout();
    }

    public void Logout() {
        CoralLoginPage coralLoginPage = new CoralLoginPage(getDriver());
        coralLoginPage.Logout();
    }

    @Test (enabled = false)
    public void VerifyPageLinks() throws InterruptedException {
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        CoralParentPage coralParentPage = new CoralParentPage(getDriver());
        coralHomepage.AboutUsWebElement(0);
        coralHomepage.FindClassesWebElement().click();
        coralHomepage.FAQWebElement(0);
        coralHomepage.Logo().click();
        coralParentPage.WishListWebElement().click();
    }

    @Test
    public void VerifyPageTabs() {
        Login();
        CoralParentPage coralParentPage = new CoralParentPage(getDriver());
        coralParentPage.VerifyClassTab().click();
        coralParentPage.VerifyProfileTab().click();
        coralParentPage.VerifyScheduleTab().click();
        coralParentPage.VerifyHomeTab().click();
        Logout();
    }
    @Test
    public void VerifyUpcomingScheduleTab() {
        Login();
        CoralParentPage coralParentPage = new CoralParentPage(getDriver());
        coralParentPage.UpComingScheduleTab().isDisplayed();
        coralParentPage.VerifyUpComingSchedule();
        Logout();
    }
}
