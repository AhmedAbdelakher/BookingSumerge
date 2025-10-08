package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import elementActions.ElementActions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HotelPage extends ElementActions {
    public HotelPage(WebDriver webdriver) {
        super(webdriver);
    }
    By hotelTitle = By.xpath("//div[@id='hp_hotel_name']//h2[contains(@class,'pp-header__title')]");
    By startDate = By.xpath("//span[@data-testid='date-display-field-start']");
    By endDate = By.xpath("//span[@data-testid=\"date-display-field-end\"]");
    By queenBed = By.xpath("//input[@type='radio' and @name='bedPreference_78883120' and @value='2']");
    By selectAmountDropdown = By.xpath("//select[contains(@class,'hprt-nos-select')]");
    By reserveButton = By.xpath("//span[@class=\"bui-button__text js-reservation-button__text\"]");
    public String getHotelTitle(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        waitForElementVisibility(hotelTitle);
        return getText(hotelTitle);
    }
    public String getStartDate(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        waitForElementVisibility(startDate);
        return getText(startDate);
    }
    public String getEndDate(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        waitForElementVisibility(endDate);
        return getText(endDate);

    }
    public void selectBedType() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        waitForElementVisibility(queenBed);
        clickOnElement(queenBed);
    }
    public void selectReservationAmount(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        waitForElementVisibility(selectAmountDropdown);
        clickOnElement(selectAmountDropdown);
        Select select = new Select(driver.findElement(selectAmountDropdown));
        select.selectByIndex(1);
    }
    public void pressReserveButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        waitForElementVisibility(reserveButton);
        clickOnElement(reserveButton);
    }
}
