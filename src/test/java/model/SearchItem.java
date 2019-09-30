package model;

import java.util.Scanner;

public class SearchItem {
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    private String searchString;

    public String getSearchString() {
        return searchString;
    }

    public SearchItem(String searchString) {
        this.searchString = searchString;
    }
}
