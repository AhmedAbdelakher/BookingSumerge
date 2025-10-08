package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HotelPage;
import pages.ReservationPage;
import testHelpers.TestBasis;

public class ValidateReservationPage extends TestBasis {
    @Test
    public void validateTheHotelName()
    {
        String expectedHotelName = "Tolip Hotel Alexandria";
        HomePage homePage = new HomePage(driver);
        homePage.setSelectedCity("Alexandria");
        homePage.setSelectedDate();
        homePage.pressSearchButton();
        homePage.seeHotelAvailability();
        HotelPage hotelPage = new HotelPage(driver);
        hotelPage.selectBedType();
        hotelPage.selectReservationAmount();
        hotelPage.pressReserveButton();
        ReservationPage reservationPage = new ReservationPage(driver);
        String actualHotelName = reservationPage.getHotelName();
        Assert.assertEquals(actualHotelName, expectedHotelName);
    }
}
