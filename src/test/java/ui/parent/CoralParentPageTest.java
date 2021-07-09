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
        coralHomepage.JoinWebElement().click();
        coralLoginPage.ParentFirstName().sendKeys("test");
        coralLoginPage.ParentLastName().sendKeys("test");
        coralLoginPage.SetEmailId();
        coralLoginPage.SetPassword();
        coralLoginPage.Terms().click();
        coralLoginPage.SignIn();
        coralLoginPage.Logout();
    }

    @Test
    public void VerifyPageLinks() throws InterruptedException {
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        CoralParentPage coralParentPage = new CoralParentPage(getDriver());
        coralHomepage.AboutUsWebElement(0);
        coralHomepage.FindClassesWebElement().click();
        coralHomepage.FAQWebElement(0);
        coralHomepage.Logo().click();
        coralParentPage.WishListWebElement().click();
    }
}
