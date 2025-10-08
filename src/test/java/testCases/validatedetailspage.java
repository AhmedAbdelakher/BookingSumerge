package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HotelPage;
import testHelpers.TestBasis;


public class validatedetailspage extends TestBasis {
    @Test
    public void validateUserCanSeeHotelAvailability()
    {
        HomePage homePage = new HomePage(driver);
        homePage.setSelectedCity("Alexandria");
        homePage.setSelectedDate();
        homePage.pressSearchButton();
        homePage.seeHotelAvailability();
    }
    @Test
    public void ValidateThatTheHotelIsSelectedCorrectly() //to be checked
    {
        String expectedHotelTitle = "Tolip Hotel Alexandria";
        HomePage homePage = new HomePage(driver);
        homePage.setSelectedCity("Alexandria");
        homePage.setSelectedDate();
        homePage.pressSearchButton();
        homePage.seeHotelAvailability();
        HotelPage hotelPage = new HotelPage(driver);
        String actualHotelTitle = hotelPage.getHotelTitle();
        System.out.println("Hotel Title: " + actualHotelTitle);
        Assert.assertEquals(actualHotelTitle , expectedHotelTitle);
    }
    @Test
    public void validateThatTheDatesAreCorrectly()
    {
        String expectedStartDate = "Wed, Oct 15";
        String expectedEndDate = "Mon, Oct 20";
        HomePage homePage = new HomePage(driver);
        homePage.setSelectedCity("Alexandria");
        homePage.setSelectedDate();
        homePage.pressSearchButton();
        homePage.seeHotelAvailability();
        HotelPage hotelPage = new HotelPage(driver);
        String actualStartDate = hotelPage.getStartDate();
        String actualEndDate = hotelPage.getEndDate();
        Assert.assertEquals(actualStartDate, expectedStartDate);
        Assert.assertEquals(actualEndDate, expectedEndDate);
    }
    @Test
    public void validateUserCanReserveHotel(){
        HomePage homePage = new HomePage(driver);
        homePage.setSelectedCity("Alexandria");
        homePage.setSelectedDate();
        homePage.pressSearchButton();
        homePage.seeHotelAvailability();
        HotelPage hotelPage = new HotelPage(driver);
        hotelPage.selectBedType();
        hotelPage.selectReservationAmount();
        hotelPage.pressReserveButton();
    }
}
