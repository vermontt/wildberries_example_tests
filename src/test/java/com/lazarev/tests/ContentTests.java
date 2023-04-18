package com.lazarev.tests;


import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.lazarev.data.TestData.URLFooter;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("MainPage")
public class ContentTests extends BaseTest {

    @Test
    @Story("Проверка содержания списка категорий")
    void categoriesTest() {
        mainPage.openPage();
        mainPage.clickMenuItems();
        sleep(1000);
        assertThat(mainPage.sizeListCategories()).isEqualTo("24");
    }

    @Test
    @Story("Проверка текста иконки корзины")
    void basketTextIconTest() {
        mainPage.openPage();
        mainPage.assertTextBasketIcon("корзина");
    }

    @Test
    @Story("Проверка перехода по правильному URL в футере")
    void urlTest() {
        mainPage.openPage();
        mainPage.moveFooterURL();

        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(URLFooter, currentUrl);
    }
}