package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchHotelPage;

import static org.testng.AssertJUnit.assertEquals;

public class SearchHotelSteps {
    private SearchHotelPage search;
    private WebDriver driver;
    private static final String BOOKING_URL = "https://www.booking.com/searchresults.ru-gb.html";
    private String nameCity = "Минск,";
    private String nameHotel = "Гостиница Турист";
    private String rating = "8,4";


    @cucumber.api.java.en.Given("поисковая форма Booking.com")
    @Step("На экране форма для поиска")
    public void searchHotel() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        driver = new ChromeDriver();
        search = new SearchHotelPage(driver);
        driver.get(BOOKING_URL);
    }

    @cucumber.api.java.en.When("заполняем поля формы поиска")
    @Step("Пользователь ввел название искомого отеля")
    public void search() {
        search.searchHotel(nameCity, nameHotel);
    }

    @cucumber.api.java.en.Then("сравниваем {string} и {string} с заданными значениями")
    @Step("Сравниваем полученные результаты с ожидаемыми")
    public void assertSearchResult() {
        assertEquals(nameHotel, search.getNameHotel());
        assertEquals(rating, search.getRating());
    }
}
