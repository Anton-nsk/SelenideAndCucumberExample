package ru.zoopassage.tests.mainpage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {

    protected static final SelenideElement searchInput = $x("//*[@id = 'smart-title-search-input-test']");
}
