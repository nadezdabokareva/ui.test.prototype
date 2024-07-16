package com.ui.pom;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class ActionWithElementMethods {

    //клик на элемент
    protected void click(SelenideElement element) {
        element.click();
    }

    //очистить поле и ввести текст
    protected void typeText(SelenideElement element, String text) {
        element.clear();
        element.setValue(text);
    }

    //получить текст из элемента
    protected String getText(SelenideElement element) {
        return element.getText();
    }

    //имитация наведения курсора на какой-либо элемент
    protected void hover(SelenideElement element) {
        element.hover();
    }

    //двойной клик на элемент
    protected void doubleClick(SelenideElement element) {
        element.doubleClick();
    }

    //нажатие правой кнопкой мыши
    protected void rightClick(SelenideElement element) {
        element.contextClick();
    }

    //загрузка файла
    protected void uploadFile(SelenideElement element, File file) {
        element.uploadFile(file);
    }

    //позволяет выбрать опцию в элементе по ее видимому тексту или индексу
    protected void selectOption(SelenideElement element, String value) {
        element.selectOption(value);
    }
    public void selectOptionByVisibleText() {
        $("#dropdown").selectOption("Option 1");
    }

    //позволяет выбрать опцию в элементе по ее видимому тексту или индексу
    protected void selectOptionByIndex(SelenideElement element, int index) {
        element.selectOption(index);
    }

    //нажатие на радио баттон
    protected void selectRadio(SelenideElement element) {
        element.selectRadio(element.getValue());
    }

    //нажатие Enter
    protected void pressEnter(SelenideElement element) {
        element.pressEnter();
    }

    //нажать Esc
    protected void pressEscape(SelenideElement element) {
        element.pressEscape();
    }

    //нажатие Tab
    protected void pressTab(SelenideElement element) {
        element.pressTab();
    }
}

