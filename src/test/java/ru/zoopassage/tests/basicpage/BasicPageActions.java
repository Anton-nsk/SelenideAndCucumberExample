package ru.zoopassage.tests.basicpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.Assert;
import ru.zoopassage.tests.hooks.Hooks;

public class BasicPageActions extends BasicPageElement implements Hooks {

    public static void open(String url) {
        Selenide.open(url);
    }

    @Step("Проверям, что страница загрузилась корректно")
    public static void checkOpenedPage() {
        Assert.assertTrue("Лого не отображается", logo.isDisplayed());
    }

    @Step("Проверяем, что открыта требуемая страница")
    public static void checkOpenNeedPage(String namePage) {
        Assert.assertEquals("Найден больше чем 1 элемент", namePage, title.getText());
    }

    @Step("Переходим в корзину")
    public static void openCart() {
        btnCart.shouldBe(Condition.visible)
                .click();
    }

    public static void stopTests() {
        Selenide.webdriver().driver().close();
    }
}
