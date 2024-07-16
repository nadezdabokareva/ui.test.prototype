package com.ui.pom;

import com.codeborne.selenide.SelenideElement;

public class CheckingConditionMethods {
    protected boolean isDisplayed(SelenideElement element) {
        return element.isDisplayed();
    }
}
