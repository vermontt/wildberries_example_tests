package com.lazarev.tests;


import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.*;

@Feature("MainPage")
public class ContentTests extends BaseTest {

    @Test
    void test1() {

        open("");
        $x("//div/button[@aria-label=\"Навигация по сайту\"]").click();
        $("#searchInput").setValue("dfdf").pressEnter();
        sleep(5000);

    }

    @Test
    void test2() {

    }

    @Test
    void test3() {

    }


}
