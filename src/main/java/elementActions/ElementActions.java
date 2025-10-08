package elementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions {
    protected WebDriver driver;
    public static int duration = 30 ;
    public ElementActions(WebDriver webdriver){
        this.driver=webdriver;
        PageFactory.initElements(driver,this);
    }
    public void waitForElementVisibility(By element){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)) ;
    }
    public void clickOnElement (By element){
        waitForElementVisibility(element);
        driver.findElement(element).click();
    }
    public void fillTextField(By element , String text){
        waitForElementVisibility(element);
        driver.findElement(element).sendKeys(text);
    }
    public String getText(By element){
        waitForElementVisibility(element);
        return driver.findElement(element).getText();
    }

}
