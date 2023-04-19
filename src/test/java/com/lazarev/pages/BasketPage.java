package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    private final SelenideElement counterProductBasket = $(".basket-section__header"),
    elementEmptyBasket = $x("//div[@class=\"basket-empty__wrap\"]/p");

    public String getCountProduct() {
        return counterProductBasket.hover().getAttribute("data-count");
    }

    @Step("Открыть страницу Корзина")
    public void openBasketPage() {
        open("lk/basket");
        sleep(1000);
    }

    @Step("Проверка тайтла страницы")
    public void assertTextEmptyBasket(String data) {
        elementEmptyBasket.shouldHave(text(data));
    }
}
