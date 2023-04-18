package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    private final List<SelenideElement> searchResult = $$(".product-card"),
    elementOrderCard = $$x("//div[@class=\"product-card__order\"]"),
    nameProduct = $$x ("//span[@class=\"goods-name\"]");

    private final SelenideElement basketIcon = $x("//div/a[@data-wba-header-name=\"Cart\"]");

    public void findFirstSearchResult() {
        searchResult.get(0).hover();
    }

    public void addBasket() {
        elementOrderCard.get(0).click();
    }

    public void moveBasket() {
        basketIcon.click();
    }

    public String getProductName() {
        return nameProduct.get(0).getText();
    }

}
