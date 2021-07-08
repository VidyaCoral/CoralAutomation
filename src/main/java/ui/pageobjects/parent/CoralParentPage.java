package ui.pageobjects.parent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.core.BasePage;

import java.util.List;

public class CoralParentPage extends BasePage {
    public CoralParentPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath=".//*[text()='Wishlist']") WebElement wishList;
    @FindBy (xpath=".//*[text()='Please input your email!']") WebElement emailAlert;
    @FindBy (xpath=".//*[text()='Please input your message!']") WebElement messageAlert;

    public WebElement WishListWebElement() { return wishList;}
    public WebElement verifyEmail() {
        return emailAlert;
    }
    public WebElement verifyMessage() {
        return messageAlert;
    }
}
