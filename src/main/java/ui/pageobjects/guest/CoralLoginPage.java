package ui.pageobjects.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.core.BasePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CoralLoginPage extends BasePage {

    public CoralLoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (id="email")
    List<WebElement> email_id;
    @FindBy (xpath=".//*[@type='password']") WebElement password;
    @FindBy (xpath=".//*[@type='text']") WebElement passwordText;
    @FindBy (css="span.ant-input-suffix") WebElement eyeIcon;
    @FindBy (xpath=".//*[@type='submit']") List <WebElement> signinButton;
    @FindBy (css="a.pd-parent-header-link") WebElement logout;
    @FindBy(css="button.ant-btn.ant-btn-primary.pd-button-guest.pd-button-guest-none.pd-button-guest-font-small.pd-button-guest-color-blue") WebElement googleButton;
    @FindBy (xpath=".//*[@type='email']") WebElement gmailAccount;
    @FindBy (xpath=".//*[@type='password']") WebElement gmailPassword;
    @FindBy (xpath=".//*[text()='Next']") WebElement next;
    @FindBy (xpath =".//*[text()='Please input your email!']") WebElement verifyEmail;
    @FindBy (xpath =".//*[text()='Please input your password!']") WebElement verifyPassword;
    @FindBy (xpath =".//*[text()='Please input your parent first name!']") WebElement verifyFirstName;
    @FindBy (xpath =".//*[text()='Please input your parent last name!']") WebElement verifyLastName;
    @FindBy (xpath =".//*[text()='Please agree to continue']") WebElement verifyTerms;
    @FindBy(linkText = "Register here") WebElement registerLink;
    @FindBy(linkText = "Sign in here") WebElement alreadyAccount;
    @FindBy(xpath=".//*[text()='Terms of Service']") WebElement termsOfService;
    @FindBy(xpath=".//*[text()='Privacy Policy']") List <WebElement> privacyPolicy;
    @FindBy (id="first_name") WebElement parentFirstName;
    @FindBy (id="last_name") WebElement parentLastName;
    @FindBy (id="terms") WebElement terms;

    @FindBy (xpath=".//span[contains(@class,'ant-input-password')]")
    WebElement viewPassword;

    @FindBy (xpath=".//*[text()='Sign up with Gmail']")
    WebElement signUpGoogle;

    @FindBy (id="ssIFrame_google")
    WebElement framePage;

    @FindBy (linkText="Forgot your password?")
    WebElement forgotPassword;


    public void SetEmailId ()  {
           email_id.get(1).sendKeys("vn.vidya@gmail.com");
    }
    public void SetPassword() {
        password.sendKeys("Welcome123?");
    }
    public WebElement EyeIcon(){
        return eyeIcon;
    }
    public WebElement ViewPasswordText() {
        return passwordText;
    }
    public void SignIn() {
        signinButton.get(1).click();
    }
    public void Logout() {
        logout.click();
    }
    public WebElement VerifyEmail(){ return verifyEmail;}
    public WebElement VerifyPassword(){ return verifyPassword;}
    public WebElement AlreadyAccount() { return alreadyAccount; }
    public WebElement RegisterLink() { return registerLink; }
    public WebElement GoogleSign() {
        return googleButton;
    }
    public WebElement ParentFirstName () { return parentFirstName;}
    public WebElement ParentLastName() {
        return parentLastName;
    }
    public WebElement Terms() {
        return terms;
    }

    public WebElement ViewPassword() {
        return viewPassword;
    }
    public WebElement SignUpGoogle() {
        return signUpGoogle;
    }

    public void SwitchLoginFrame(){

        //System.out.println(driver.findElements(By.tagName("iframe")).size());
        String window = driver.getWindowHandle();
        //driver.switchTo().activeElement();
        //driver.switchTo().frame("ssIFrame_google");

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }
    public void SwitchTab() {

        ArrayList<String> tabs =new ArrayList<String> (driver.getWindowHandles());
        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);
            String title = driver.getCurrentUrl();
            System.out.println(title);
        }
        //driver.switchTo().window(tabs.get(2));
        //driver.switchTo().window(tabs.get(0));
    }
    public WebElement GoogleAccount(){
        return gmailAccount;
    }
    public WebElement GooglePassword(){
        return gmailPassword;
    }
    public WebElement NextButton(){
        return next;
    }
    public WebElement VerifyFirstName() { return verifyFirstName; }
    public WebElement VerifyLastName() { return verifyLastName; }
    public WebElement VerifyTerms() { return verifyTerms; }
    public WebElement TermsOfService() { return termsOfService; }
    public WebElement PrivacyPolicy() {
            return privacyPolicy.get(2); }
}