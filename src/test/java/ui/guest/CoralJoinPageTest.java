package ui.guest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.core.BaseTest;
import ui.pageobjects.guest.CoralFAQPage;
import ui.pageobjects.guest.CoralHomePage;
import ui.pageobjects.guest.CoralJoinPage;
import ui.pageobjects.guest.CoralLoginPage;

public class CoralJoinPageTest extends BaseTest {

    @Test
    public void JoinFree()  {
        CoralJoinPage joinPage = new CoralJoinPage((getDriver()));
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
    public void Verify_MessageFields() {
        CoralFAQPage faqPage = new CoralFAQPage((getDriver()));
        CoralHomePage coralHomepage = new CoralHomePage(getDriver());
        coralHomepage.FAQWebElement(0);
        faqPage.setName().sendKeys("test");
        faqPage.setName().sendKeys(Keys.CONTROL + "a");
        faqPage.setName().sendKeys(Keys.DELETE);
        Assert.assertEquals(true, faqPage.verifyName().isDisplayed());
        faqPage.setEmail().sendKeys("test@gmail.com");
        faqPage.setEmail().sendKeys(Keys.CONTROL + "a");
        faqPage.setEmail().sendKeys(Keys.DELETE);
        Assert.assertEquals(true, faqPage.verifyEmail().isDisplayed());
        faqPage.setMessage().sendKeys("How long is the class and can the student attend with siblings!@#$%^&*()_+|}{:?><,./;'[]=-`~'");
        faqPage.setMessage().sendKeys(Keys.CONTROL + "a");
        faqPage.setMessage().sendKeys(Keys.DELETE);
        Assert.assertEquals(true, faqPage.verifyMessage().isDisplayed());

    }
}
