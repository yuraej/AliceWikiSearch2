package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class WikiSearchPage extends BasePage {

    @FindBy(xpath = "//ul[@class='mw-search-results']//a")
    private List<WebElement> resultsLinks;

    public WikiSearchPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getResultLinks() {
        return resultsLinks.stream().map(result->result.getAttribute("innerText"))
                .filter(result-> !result.isEmpty()).collect(Collectors.toList());
    }
}
