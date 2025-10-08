package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import elementActions.ElementActions;

import java.time.Duration;

public class HomePage extends ElementActions {
    public HomePage(WebDriver webdriver) {
        super(webdriver);
    }
    By citySearchBox = By.className("b915b8dc0b");
    By dateOne = By.cssSelector("span[data-date='2025-10-15']");
    By dateTwo = By.cssSelector("span[data-date='2025-10-20']");
    By searchButton = By.cssSelector("button[type='submit']");
    By availabilityButton = By.xpath("//a[@data-testid=\"availability-cta-btn\" and contains(@href, \"royal-tulip-alexandria\")]");
    public void setSelectedCity(String city) {
        waitForElementVisibility(citySearchBox);
        clickOnElement(citySearchBox);
        fillTextField(citySearchBox, city);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(citySearchBox).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(citySearchBox).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(citySearchBox).sendKeys(Keys.ENTER);
    }
    public void setSelectedDate(){
        clickOnElement(dateOne);
        clickOnElement(dateTwo);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void pressSearchButton() {
        clickOnElement(searchButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void seeHotelAvailability(){
        clickOnElement(availabilityButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
}
