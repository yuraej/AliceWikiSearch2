package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchHotelPage extends BasePage{
    private WebDriver driver;


    private By propertyName = By.id("ss");
    private By buttonSearch = By.xpath("//button[@type='submit']");
    private By nameHotel = By.cssSelector("span.sr-hotel__name");
    private By ratingHotel = By.cssSelector("bui-review-score__badge");

  /*  @BeforeClass
    public void startTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/searchresults.en-gb.html");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }*/

    public SearchHotelPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void searchHotel(String nameCity, String nameHotel) {
        driver.findElement(propertyName).sendKeys(nameCity);
        driver.findElement(propertyName).sendKeys(nameHotel);
        driver.findElement(buttonSearch).click();
    }

    public String getNameHotel() {
       return driver.findElement(nameHotel).getText();
    }

    public String getRating() {
        return driver.findElement(ratingHotel).getText();
    }
}
