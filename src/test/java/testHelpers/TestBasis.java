package testHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBasis {
    protected WebDriver driver;
    @BeforeTest
    public void setUpDriver()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @AfterTest
    public void tearDownDriver()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.quit();
    }
}
