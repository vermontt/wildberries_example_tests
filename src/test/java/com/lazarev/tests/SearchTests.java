package com.lazarev.tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.sleep;
import static org.assertj.core.api.Assertions.assertThat;

@Feature("Поиск")
public class SearchTests extends BaseTest {

    @ValueSource(strings = {
            "Шорты",
            "Майка",
            "Джинсы"
    })
    @ParameterizedTest
    @Story("Проверка поисковой строки")
    void searchTest(String searchWord) {
        mainPage.openPage();
        sleep(1000);
        mainPage.inputSearchWord(searchWord);
        sleep(1000);

        Allure.step("Проверка на соответствие введенному слову", () ->
                assertThat(searchPage.getProductName()).contains(searchWord));
    }

    @Test
    @Story("Проверка пагинации страниц поиска")
    void paginationTest() {
        mainPage.openPage();
        sleep(1000);
        mainPage.inputSearchWord("мячи");
        sleep(1000);

        searchPage.assertFirstPagePagination("1");
        assertThat(searchPage.assertAllPagesPagination()).isEqualTo("7");
    }
}