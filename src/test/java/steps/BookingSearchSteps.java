package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingSearchSteps {
   /* BookingSearchPage page;
    WebDriver driver;
    String searchString;
    
    @Given("I want to search for {string}")
    public void iWantToSearchFor(String hotelName) {
        searchString = hotelName;
        driver = ChromeDriver();
        page = new BookingSearchPage(driver);
    }

    @When("I do search")
    public void iDoSearch() {
        page.inputHotelName(searchString);
        page.clickSearch();
    }

    @Then("Results page should contain {string}")
    public void resultsPageShouldContain(String arg0) {
        BookingResultsPage page = new BookingResultsPage(driver);
        page.isPageOpened();
        List<String> hotels = page.getResults();
        assertThat(hotels, contains(arg0));
    }

    @And("rating should be {string}")
    public void ratingShouldBe(String arg0) {

        BookingResultsPage page = new BookingResultsPage(driver);
        String rating = page.getRatingFor(hotelName);
        assertEquals(rating, arg0)
    }*/
}
