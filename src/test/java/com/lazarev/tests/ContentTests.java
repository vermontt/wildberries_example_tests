package com.lazarev.tests;


import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.lazarev.data.TestData.URLFooter;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("MainPage")
public class ContentTests extends BaseTest {

    @Test
    @TmsLink("4")
    @DisplayName("WB-TC-4: Проверка содержания списка категорий")
    void categoriesTest() {
        mainPage.openPage();
        mainPage.clickMenuItems();
        assertThat(mainPage.sizeListCategories()).isEqualTo("24");
    }

    @Test
    @TmsLink("5")
    @DisplayName("WB-TC-5: Проверка текста иконки корзины")
    void basketTextIconTest() {
        mainPage.openPage();
        mainPage.assertTextBasketIcon("корзина");
    }

    @Test
    @TmsLink("4")
    @DisplayName("WB-TC-6: Проверка перехода по правильному URL в футере")
    void urlTest() {
        mainPage.openPage();
        mainPage.moveFooterURL();

        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(URLFooter, currentUrl);
    }
}