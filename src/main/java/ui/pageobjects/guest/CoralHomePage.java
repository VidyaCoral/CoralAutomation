package ui.pageobjects.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.core.BasePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CoralHomePage extends BasePage {

    public CoralHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText = "Blog") WebElement blog;
    @FindBy(xpath = ".//*[text()='Find Classes']") WebElement FindClasses;
    @FindBy(xpath=".//*[contains(@href,'faq')]") List<WebElement> faq;
    @FindBy(xpath = ".//*[text()='Login']") WebElement Login;
    @FindBy(xpath=".//*[text()='About Us']") List<WebElement> aboutUs;
    @FindBy(css = "span.anticon.anticon-close.ant-modal-close-icon") WebElement loginclose;
    @FindBy(linkText = "Contact Us") WebElement contactUs;
    @FindBy(linkText = "Teach")WebElement teach;
    @FindBy(linkText = "Privacy Policy") WebElement privacyPolicy;
    @FindBy(linkText = "Terms & Conditions") WebElement terms_condition;
    @FindBy(css = "img.pd-guest-header-logo") WebElement logo;
    @FindBy(xpath = ".//*[text()='Join']") WebElement Join;

    @FindBy(xpath = ".//*[text()='Welcome to Coral']")
    WebElement Welcome_message;

    @FindBy(xpath = ".//*[text()='See How We Are in Action']")
    WebElement Action_message;

    @FindBy(xpath = ".//*[text()='Our Teaching Team']")
    WebElement Teaching_message;

    @FindBy(xpath = ".//*[text()='Blog']")
    WebElement Blog_message;

    @FindBy(xpath = ".//*[text()='Our Classes']")
    WebElement Classes_message;

    @FindBy(xpath=".//*[text()='Send us a message']")
    WebElement questions_message;

    @FindBy(xpath = ".//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[3]/div")
    WebElement class_right_arrow;

    @FindBy(xpath = ".//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div[1]/div")
    WebElement team_left_arrow;

    @FindBy(xpath = ".//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div[3]/div")
    WebElement team_right_arrow;

    @FindBy(xpath = ".//*[@id=\"root\"]/div/div[4]/div/div/div/div/div[1]/div")
    WebElement blog_left_arrow;

    @FindBy(xpath = ".//*[@id=\"root\"]/div/div[4]/div/div/div/div/div[3]/div")
    WebElement blog_right_arrow;

    @FindBy(xpath = ".//*[text()='Send us a message']")
    WebElement send_message;

    @FindBy(xpath = ".//*[text()='Find More Classes']")
    WebElement final_section;

    @FindBy(css = "button.ant-btn.ant-btn-primary.pd-button-guest.pd-button-guest-none.pd-button-guest-font-medium.pd-button-guest-color-blue")
    WebElement last_message;

    @FindBy(xpath=".//*[contains(@class,'pd-swiper-button-prev-unique')]")
    WebElement class_left_disbaled;

    @FindBy(xpath=".//*[contains(@class,'pd-swiper-button-next-unique')]")
    WebElement class_right_disbaled;

    @FindBy(xpath = ".//*[text()='Find Classes']")
    WebElement final_classes;

    @FindBy(css="button.ant-btn.ant-btn-primary.pd-button-guest.pd-button-guest-medium.pd-button-guest-font-medium.pd-button-guest-color-orange")
    WebElement registerFree;

    public WebElement Blog() { return blog; }
    public WebElement ContactUs() { return contactUs; }
    public void AboutUsWebElement(int i) {
        aboutUs.get(i).click();

    }

    public WebElement FindClassesWebElement() {
        return FindClasses;
    }

    public void FAQWebElement(int i) {
        faq.get(i).click();
    }

    public WebElement LoginWebElement() {
        return Login;
    }

    public WebElement LoginReturn() {return loginclose;}

    public WebElement JoinWebElement() {
        return Join;
    }

    public WebElement ClassRightArrowWebElement() {
        return class_right_arrow;
    }

    public WebElement TeamLeftArrowWebElement() {
        return team_left_arrow;
    }

    public WebElement TeamRightArrowWebElement() {
        return team_right_arrow;
    }
    public WebElement SendMessage() { return questions_message;}
    public WebElement LastSection() { return final_section; }
    public WebElement LastClickSection() {
        return last_message;
    }
    public WebElement LeftArrowDisabled() {
        return class_left_disbaled;
    }
    public WebElement RegisterFree() { return registerFree;}
    public WebElement RightArrowDisabled() {
        return class_right_disbaled;
    }
    public void FindClasses(){
        waitForElementToAppear((By) final_classes);
    }

    public WebElement Teach() { return teach; }

    public WebElement PrivacyPolicy() { return privacyPolicy;}

    public WebElement T_C() {

        return terms_condition;
    }

    public WebElement Logo() {

        return logo;
    }
}