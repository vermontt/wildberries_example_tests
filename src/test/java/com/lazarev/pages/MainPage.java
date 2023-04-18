package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement searchField = $("#searchInput"),
            searchButton = $("#applySearchBtn");

    public void openPage() {
        open("");
    }

    public void inputSearchWord(String data) {
        searchField.setValue(data);
        searchButton.click();
    }

}
