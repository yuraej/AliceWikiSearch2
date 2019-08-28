package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.WikiMainPage;
import pages.WikiSearchPage;

import java.io.File;
import java.util.List;

public class WikiWebDriverHelper {
    private static final String WIKI_URL = "http://en.wikipedia.org";
    private WikiSearchPage searchPage;
    private WebDriver driver;
    private WikiMainPage wikiMainPage;
    
    public WikiWebDriverHelper() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
    }
    
    public void search(String searchString) {
        driver = new ChromeDriver();
        driver.get(WIKI_URL);
        wikiMainPage = new WikiMainPage(driver);
        wikiMainPage.searchByKeyword(searchString);
        searchPage = new WikiSearchPage(driver);
    }

    public List<String> getResults() {
        return searchPage.getResultLinks();
    }

    public void tearDown() {
        driver.quit();
    }
}
