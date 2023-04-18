package com.lazarev.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    private final SelenideElement counterProductBasket = $(".basket-section__header"),
    elementEmptyBasket = $x("//div[@class=\"basket-empty__wrap\"]/p");

    public String getCountProduct() {
        return counterProductBasket.hover().getAttribute("data-count");
    }

    public void openBasketPage() {
        open("lk/basket");
        sleep(1000);
    }

    public void assertTextEmptyBasket(String data) {
        elementEmptyBasket.shouldHave(text(data));
    }
}
