package com.ui.pom;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchElementMethods {
    protected SelenideElement findElement(String cssSelector) {
        return $(cssSelector);
    }

    protected SelenideElement findElement(By locator) {
        return $(locator);
    }
}
