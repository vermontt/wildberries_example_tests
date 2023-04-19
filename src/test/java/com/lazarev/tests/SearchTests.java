package com.lazarev.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.lazarev.helpers.Attach.takeScreenshot;
import static org.assertj.core.api.Assertions.assertThat;

@Feature("Поиск")
public class SearchTests extends BaseTest {

    @ValueSource(strings = {
            "Шорты",
            "Майка",
            "Джинсы"
    })
    @ParameterizedTest(name = "\"{0}\"")
    @Owner("Лазарев И.И.")
    @TmsLinks({@TmsLink("17500"), @TmsLink("17500"), @TmsLink("17500")})
    @DisplayName("WB-TC-7: Проверка поисковой строки по слову")
    void searchTest(String searchWord) {
        mainPage.openPage();
        mainPage.inputSearchWord(searchWord);

        Allure.step("Проверка на соответствие введенному слову", () -> {
            assertThat(searchPage.getProductName()).contains(searchWord);
            takeScreenshot();
        });
    }

    @Test
    @Owner("Бондарев А.А.")
    @TmsLink("17501")
    @DisplayName("WB-TC-8: Проверка пагинации страниц поиска")
    void paginationTest() {
        mainPage.openPage();
        mainPage.inputSearchWord("мячи");

        searchPage.assertFirstPagePagination("1");
        assertThat(searchPage.assertAllPagesPagination()).isEqualTo("7");
    }
}