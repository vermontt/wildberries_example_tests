package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement searchField = $("#searchInput"),
            searchButton = $("#applySearchBtn"),
            categoriesItem = $x("//span[@class=\"nav-element__burger-line\"]"),
            basketIcon = $x("//a[@data-wba-header-name=\"Cart\"]"),
            footerItem = $x("//li[@data-wba-footer-name=\"How_to_order\"]/a");

    private final List<SelenideElement> categoriesList = $$x("//li[@class=\"menu-burger__main-list-item" +
            " j-menu-main-item menu-burger__main-list-item--subcategory\"]");

    @Step("Открыть главную страницу")
    public void openPage() {
        open("");
        sleep(1000);
    }

    public void inputSearchWord(String data) {
        searchField.setValue(data);
        searchButton.click();
    }

    public void clickMenuItems() {
        categoriesItem.click();
        sleep(1000);
    }

    public String sizeListCategories() {
        return String.valueOf(categoriesList.size());
    }

    public void assertTextBasketIcon(String data) {
        basketIcon.shouldHave(text(data));
    }

    public void moveFooterURL() {
        footerItem.scrollIntoView(true).click();
    }
}