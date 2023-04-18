package com.lazarev.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.title;
import static com.lazarev.data.TestData.emptyBasketText;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("Корзина")
public class BasketTests extends BaseTest {

    @Test
    @Tag("smoke")
    @Story("Проверка добавления товара в корзину")
    void addBasketTest() {
        step("Поиск товаров по слову", () -> {
            mainPage.openPage();
            sleep(1000);
            mainPage.inputSearchWord("книга");
            sleep(1000);
        });

        step("Добавление одного товара в корзину", () -> {
            searchPage.findFirstSearchResult();
            searchPage.addBasket();
        });

        step("Переход в корзину", () -> {
            sleep(1000);
            searchPage.moveBasket();
            sleep(1000);
        });

        step("Проверка количества товаров в корзине", () ->
                assertThat(basketPage.getCountProduct()).isEqualTo("1"));
    }

    @Test
    @Story("Проверка пустой корзины")
    void emptyBasketTest() {
        basketPage.openBasketPage();
        sleep(1000);
        basketPage.assertTextEmptyBasket(emptyBasketText);
    }

    @Test
    void titleTest() {
        basketPage.openBasketPage();
        assertThat(title()).contains("модный интернет магазин");
    }
}