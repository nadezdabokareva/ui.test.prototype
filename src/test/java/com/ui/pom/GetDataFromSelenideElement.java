package com.ui.pom;

import static com.codeborne.selenide.Selenide.$;

public class GetDataFromSelenideElement {
    public String getElementText() {
        return $("#elementId").getText();
    }
    public String getElementAttribute() {
        return $("#elementId").getAttribute("value");
    }
    public String getElementValue() {
        return $("#elementId").getValue();
    }
}
