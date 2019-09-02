package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchHotel {
    private WebDriver driver;

    By propertyName = By.id("ss");
    By buttonSearch = By.cssSelector("span[text()='Search']");

    @BeforeClass
    public void startTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/searchresults.en-gb.html");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    public SearchHotel(WebDriver driver) {
        this.driver = driver;
    }

    public void searchHotel(String nameHotel) {
        driver.findElement(propertyName).sendKeys("nameHotel");
        driver.findElement(buttonSearch).click();
    }

}
