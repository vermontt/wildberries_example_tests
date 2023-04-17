package com.lazarev.helpers;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;

public class Attach {

    @Attachment(value = "Скриншот", type = "image/png")
    public static byte[] takeScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }
}
