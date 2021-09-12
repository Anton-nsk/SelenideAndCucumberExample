package ru.zoopassage.tests.basicpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BasicPageElement {

    protected static final SelenideElement logo = $x("//*[@id = 'header']//img[@alt='Зоо Пассаж']");
    protected static final SelenideElement btnCart = $x("//*[@id = 'bx_basketT0kNhm']");
    protected static final SelenideElement title = $(By.id("zag1"));
}
