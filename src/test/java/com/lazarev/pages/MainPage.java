package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement firstName = $x("//*[@id='firstName']"),
            lastName = $x("//*[@id='lastName']"),
            userEmail = $x("//*[@id='userEmail']"),
            gender = $x("//*[@class='custom-control custom-radio custom-control-inline'][2]"),
            userNumber = $x("//*[@id='userNumber']"),
            dateOfBirthInput = $x("//*[@id='dateOfBirthInput']"),
            dateChange = $x("//*[@class='react-datepicker__day react-datepicker__day--010']"),
            currentAddress = $x("//*[@id='currentAddress']"),
            buttonSubmit = $x("//*[@id='submit']");



    public void openPage() {
        open("/automation-practice-form");
    }

//    public RegisterFormPage inputFirstName(String data) {
//        firstName.setValue(data);
//        return this;
//    }
//
//    public RegisterFormPage inputLastName(String data) {
//        lastName.setValue(data);
//        return this;
//    }
//
//    public RegisterFormPage inputEmail(String data) {
//        userEmail.setValue(data);
//        return this;
//    }



}
