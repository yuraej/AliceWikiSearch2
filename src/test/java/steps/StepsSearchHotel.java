package steps;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import pages.SearchHotel;

public class StepsSearchHotel {
    private SearchHotel search;
    WebDriver driver;


    @cucumber.api.java.en.Given("название отеля это {string}")
    public void searchHotel() {
        search = new SearchHotel(driver);
        search.searchHotel("Турист");
    }
}
