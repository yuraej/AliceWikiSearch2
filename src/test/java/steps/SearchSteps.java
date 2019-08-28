package steps;

import model.SearchItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsIterableContaining.hasItem;

public class SearchSteps{
    private SearchItem searchItem;
    private WikiWebDriverHelper helper;
    
    
    @cucumber.api.java.en.Given("Keyword for search is {string}")
    public void searchKeywordIsString(String keyword) {
        helper = new WikiWebDriverHelper();
        searchItem = new SearchItem(keyword);
    }

    @cucumber.api.java.en.When("User does search")
    public void search() {
        helper.search(searchItem.getSearchString());
    }

    @cucumber.api.java.en.Then("Wiki page {string} is on the first page")
    public void assertSearchResult(String result) {
        assertThat(String.format("There are no results for search string '%s' on first search page", result),
                helper.getResults(), 
                hasItem(result));
    }
}

