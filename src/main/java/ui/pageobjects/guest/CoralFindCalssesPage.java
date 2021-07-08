package ui.pageobjects.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.core.BasePage;

import java.util.List;

public class CoralFindCalssesPage extends BasePage {

    public CoralFindCalssesPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
    //LogManager.get

    @FindBy (xpath =".//*[@class='ant-input']")
    WebElement topicTextbox;

    @FindBy (xpath=".//*[text()='Topic']")
    WebElement topic;

    @FindBy(id="pd-dropdown-content-topic")
    WebElement topicDropDown;

    @FindBy(xpath=".//*[@class='ant-checkbox-input']")
    WebElement CheckBox;

    @FindBy(id="Topic 1")
    WebElement topicsList;

    @FindBy(xpath=".//*[@type='submit']")
    WebElement applyButton;

    @FindBy(xpath=".//*[@type='reset']")
    WebElement resetButton;

    @FindBy(xpath=".//*[text()='Age']")
    WebElement age;

//	@FindBy(xpath=".//*[text()='Date']")
//	WebElement date;

    @FindBy(xpath=".//*[text()='Selected dates only']")
    WebElement SelectdateOnly;

    @FindBy(id="8")
    WebElement ageList;

    @FindBy(xpath=".//*[@form='age-form']")
    WebElement submitButton;

    @FindBy(css="div[class='ant-col ant-col-lg-3']")
    WebElement date1;

    @FindBy(xpath=".//*[text()='Date']")
    WebElement date;

    @FindBy(xpath="//*[text()='Selected dates only']")
    WebElement dateOnly;

    @FindBy(xpath="//*[text()='Selected dates and later']")
    WebElement dateLater;

    @FindBy(css="div.ant-picker-input")
    WebElement dateCalendar;

    @FindBy(css="button.ant-picker-month-btn")
    WebElement monthPicker;

    @FindBy(css="button.ant-picker-year-btn")
    WebElement yearPicker;

    @FindBy(css="td[title='2020']")
    WebElement yearSelection;

    @FindBy(css="div.ant-picker-cell-inner")
    WebElement datePicker;

    @FindBy(css="button.ant-picker-header-prev-btn")
    WebElement previousMonth;

    @FindBy(css="button.ant-picker-header-next-btn")
    WebElement nextMonth;

    @FindBy(css="button.ant-picker-header-super-prev-btn")
    WebElement previousYear;

    @FindBy(css="button.ant-picker-header-super-next-btn")
    WebElement nextYear;

    @FindBy(css="input#dateRange")
    WebElement starteDate;

    @FindBy(css="input[placeholder='End date']")
    WebElement endDate;

    @FindBy(css="button.ant-picker-month-btn")
    WebElement monthPick;

    @FindBy(css="button.ant-picker-year-btn")
    WebElement yearPick;

    @FindBy(css="div.ant-picker-cell-inner")
    List<WebElement> monthSelection;

    @FindBy(css="div.ant-picker-cell-inner")
    List<WebElement> yearSelections;

    public WebElement TopicTextBox() {
        return topicTextbox;
    }
    public WebElement Topic(){
        return topic;
    }
    public WebElement TopicDropDownSelect() {
        return topicsList;
    }
    public WebElement SubmitDropDown() {
        return applyButton;
    }
    public WebElement ResetDropDown() {
        return resetButton;
    }
    public WebElement Age(){
        return age;
    }
    public WebElement AgeDropDownSelect() {
        return ageList;
    }
    public WebElement ApplyButton() {
        return submitButton;
    }
    public WebElement Date() {
        return date;
    }
    public WebElement DateOnly() {
        return dateOnly;
    }
    public WebElement DateLater() {
        return dateLater;
    }
    public WebElement DateCalendar() {
        return dateCalendar;
    }
    public WebElement MonthPicker() {
        return monthPicker;
    }
    public void YearPicker(String year) {
        yearPicker.click();
        yearSelection.click();
        //return yearPicker;
    }
    public WebElement DatePicker() {
        return datePicker;
    }
    public WebElement PreviousMonth() {
        return previousMonth;
    }
    public WebElement NextMonth() {
        return nextMonth;
    }
    public WebElement PreviousYear() {
        return previousYear;
    }
    public WebElement NextYear() {
        return nextYear;
    }
    public WebElement StartDate() {
        return starteDate;
    }
    public WebElement EndDate() {

        //System.out.println(endDate.getAttribute("placeholder"));
        return endDate;
    }
    public WebElement MonthSelection() {
        return monthPick;
    }
    public WebElement YearSelection() {
        return yearPick;
    }
    public void PickMonth(String user_month)
    {
        for (WebElement e : monthSelection ) {
            String month = e.getText();
            System.out.println(month);
//			if(month.equals(user_month))
//				e.findElement(By.xpath("./..")).click();
            //e.click();

        }

    }
    public void PickYear(String user_year)
    {
        for (WebElement e : monthSelection ) {
            System.out.println(e.getText());
            if(e.getText() == user_year)
                e.click();
        }

    }

}