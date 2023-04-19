package com.lazarev.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static com.lazarev.data.TestData.emptyBasketText;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("Корзина")
public class BasketTests extends BaseTest {

    @Test
    @Tag("smoke")
    @TmsLink("1")
    @DisplayName("WB-TC-1: Проверка добавления товара в корзину")
    void addBasketTest() {
        mainPage.openPage();

        step("Поиск товаров по слову", () ->
            mainPage.inputSearchWord("книга")
        );

        step("Добавление одного товара в корзину", () -> {
            searchPage.findFirstSearchResult();
            searchPage.addBasket();
        });

        step("Переход в корзину", () -> {
            searchPage.moveBasket();
        });

        step("Проверка количества товаров в корзине", () ->
                assertThat(basketPage.getCountProduct()).isEqualTo("1"));
    }

    @Test
    @TmsLink("2")
    @DisplayName("WB-TC-2: Проверка содержания пустой корзины")
    void emptyBasketTest() {
        basketPage.openBasketPage();
        basketPage.assertTextEmptyBasket(emptyBasketText);
    }

    @Test
    @TmsLink("3")
    @DisplayName("WB-TC-3: Проверка тайтла страницы Корзина")
    void titleTest() {
        basketPage.openBasketPage();
        assertThat(title()).contains("модный интернет магазин");
    }
}