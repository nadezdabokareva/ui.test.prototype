package com.ui.generator;

import java.util.Scanner;

public class GeneratorSelenideElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("как назвать переменную");
        String varName = in.next();

        System.out.print("какой локатор (byClassName|byText и тд");
        String locatorName = in.next();

        System.out.print("путь к элементу");
        String locatorPath = in.next();

        String selenideElement = "private SelenideElement " + varName + " = " + "$(" + locatorName + "(\"" + locatorPath + "\"));";

        System.out.println(selenideElement);
    }
}
