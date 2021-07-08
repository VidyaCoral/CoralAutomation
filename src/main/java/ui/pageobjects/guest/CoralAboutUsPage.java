package ui.pageobjects.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ui.core.BasePage;

public class CoralAboutUsPage extends BasePage{

    public CoralAboutUsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy (xpath=".//*[text()='Hello!']")
    WebElement HelloMessage;

    @FindBy (xpath=".//*[text()='Who We Are']")
    WebElement WhoMessage;

    @FindBy (xpath=".//*[text()='Vision']")
    WebElement VissionMessage;

    @FindBy (xpath=".//*[text()='See what we do here at Coral']")
    WebElement CoralMessage;

}
