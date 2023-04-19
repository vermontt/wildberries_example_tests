package com.lazarev.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    private final List<SelenideElement> searchResult = $$(".product-card"),
            elementOrderCard = $$x("//div[@class=\"product-card__order\"]"),
            nameProduct = $$x("//span[@class=\"goods-name\"]"),
            paginationAllPages = $$x("//div[@class=\"pageToInsert pagination__wrapper\"]/a");

    private final SelenideElement basketIcon = $x("//div/a[@data-wba-header-name=\"Cart\"]"),
            paginationFirstPage = $x("//div[@class=\"pageToInsert pagination__wrapper\"]/span");

    public void findFirstSearchResult() {
        searchResult.get(0).hover();
    }

    public void addBasket() {
        elementOrderCard.get(0).click();
    }

    public void moveBasket() {
        basketIcon.click();
        sleep(1000);
    }

    public String getProductName() {
        return nameProduct.get(0).getText();
    }

    public void assertFirstPagePagination(String data) {
        paginationFirstPage.shouldHave(Condition.text(data));
    }

    public String assertAllPagesPagination() {
        return String.valueOf(paginationAllPages.size());
    }
}
