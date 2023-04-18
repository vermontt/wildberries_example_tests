package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    private final SelenideElement counterProductBasket = $(".basket-section__header");

    public String getCountProduct() {
        return counterProductBasket.hover().getAttribute("data-count");
    }

}
