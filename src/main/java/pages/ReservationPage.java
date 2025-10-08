package pages;

import elementActions.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservationPage extends ElementActions {
    public ReservationPage(WebDriver webdriver) {
        super(webdriver);
    }
    By hotelName = By.xpath("//h1[@class=\"e7addce19e\"]");
    By firstName = By.xpath("//input[@data-testid=\"user-details-firstname\"]");
    public String getHotelName(){
        waitForElementVisibility(hotelName);
        return getText(hotelName);
    }
}
