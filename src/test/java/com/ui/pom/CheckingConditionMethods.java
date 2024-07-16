package com.ui.pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CheckingConditionMethods {

    //проверка на то, отображается ли элемент
    protected boolean isDisplayed(SelenideElement element) {
        return element.isDisplayed();
    }
    public void checkElementIsEnabled() {
        $("#elementId").shouldBe(enabled); // Проверка, что элемент доступен для взаимодействия
    }
    public void checkElementText() {
        $("#elementId").shouldHave(text("Expected text")); // Проверка, что текст элемента соответствует ожидаемому
    }
    public void checkElementHasAttribute() {
        $("#elementId").shouldHave(attribute("data-testid", "elementTestId")); // Проверка, что у элемента есть указанный атрибут
    }
    public void checkElementExists() {
        $("#elementId").exists(); // Проверка наличия элемента в DOM
    }
    public void checkElementIsSelected() {
        $("#checkboxId").shouldBe(selected); // Проверка, что чекбокс выбран
    }

}
