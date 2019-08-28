package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiMainPage extends BasePage {

    @FindBy(id = "searchInput")
    private WebElement searchField;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    public WikiMainPage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(String keyword){
        searchField.sendKeys(keyword);
        searchButton.click();
    }


}
