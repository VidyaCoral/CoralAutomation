package ui.pageobjects.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.core.BasePage;

import java.util.List;

public class CoralFAQPage extends BasePage {
    public CoralFAQPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css="div.ant-collapse-item") List <WebElement> all_questions;
    @FindBy (id="name") WebElement name;
    @FindBy (id="email") WebElement email;
    @FindBy (id="phone") WebElement phone;
    @FindBy (id="message") WebElement message;
    @FindBy (css="button[type='submit']") WebElement submit;
    @FindBy (xpath=".//*[text()='Please input your name!']") WebElement nameAlert;
    @FindBy (xpath=".//*[text()='Please input your email!']") WebElement emailAlert;
    @FindBy (xpath=".//*[text()='Please input your message!']") WebElement messageAlert;

    public void getAll_questions() {

        for (WebElement i : all_questions) {
            int index = all_questions.indexOf(i);
            all_questions.get(index).click();

        }
        for (WebElement i : all_questions) {
            int index = all_questions.indexOf(i);
            all_questions.get(index).click();


        }
    }

    public WebElement setName() { return name; }

    public WebElement setEmail() {
        return email;
    }
    public WebElement setPhone() {
        return phone;
    }
    public WebElement setMessage() {
        return message;
    }
    public WebElement submitButton() {
        return submit;
    }
    public WebElement verifyName() {
        return nameAlert;
    }
    public WebElement verifyEmail() {
        return emailAlert;
    }
    public WebElement verifyMessage() {
        return messageAlert;
    }
}
