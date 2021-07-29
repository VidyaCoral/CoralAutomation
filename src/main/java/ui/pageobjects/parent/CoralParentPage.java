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
    @FindBy (id="rc-tabs-0-tab-1") WebElement homeTab;
    @FindBy (id="rc-tabs-0-tab-2") WebElement scheduleTab;
    @FindBy (id="rc-tabs-0-tab-3") WebElement classTab;
    @FindBy (id="rc-tabs-0-tab-4") WebElement profileTab;
    @FindBy (css = "div.pd-parent-home-schedule") WebElement upComingSchedule;
    //@FindBy (xpath = ".//*[@class='pd-parent-home-schedule']/child::node()") List<WebElement> scheduleList;
    @FindBy (xpath = ".//*[@class='ant-typography pd-title pd-title-color-black']") List<WebElement> scheduleList;

    public WebElement WishListWebElement() { return wishList;}
    public WebElement VerifyHomeTab() { return homeTab;}
    public WebElement VerifyScheduleTab() { return scheduleTab;}
    public WebElement VerifyClassTab() { return classTab;}
    public WebElement VerifyProfileTab() { return profileTab;}
    public WebElement UpComingScheduleTab() { return upComingSchedule; }
    public void VerifyUpComingSchedule() {
        int count = 0;
        if (upComingSchedule.isDisplayed()){
            for(WebElement i : scheduleList) {
                System.out.println(i.getText());
                count++;
            }
        }
        System.out.println(count);

    }
}
