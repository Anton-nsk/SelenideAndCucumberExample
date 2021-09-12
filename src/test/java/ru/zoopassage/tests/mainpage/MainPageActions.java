package ru.zoopassage.tests.mainpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

public class MainPageActions extends MainPageElements {

    @Step("Проверяем видимость поля поиска")
    public static void checkVisibleElement(SelenideElement element) {
        Assert.assertTrue("Ожидаемый элемент не отображается", element.isDisplayed());
    }

    @Step("Проверяем, что поле поиска отображается и ищем товар по названию")
    public static void searchGoodForName(String nameGood) {
        checkVisibleElement(searchInput);
        searchInput
                .shouldBe(Condition.visible)
                .setValue(nameGood)
                .pressEnter();
    }
}
