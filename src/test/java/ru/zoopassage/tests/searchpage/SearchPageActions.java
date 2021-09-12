package ru.zoopassage.tests.searchpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

public class SearchPageActions extends SearchPageElements {

    @Step("Проверяем видимость поля поиска")
    public static void checkVisibleElement(SelenideElement element) {
        Assert.assertTrue("Ожидаемый элемент не отображается", element.isDisplayed());
    }

    @Step("Добавить в корзину товар")
    public static void addToCart() {
        checkVisibleElement(btnAddCart);
        btnAddCart.click();
        Assert.assertEquals("В корзине более 1 товара", "1", counterGoodOfCart.getText());
    }

    @Step("Проверяем, что найден единственный результат")
    public static void sumResultsIsOne() {
        checkVisibleElement(resultsSearch);
        Assert.assertEquals("Найден больше чем 1 элемент", 1, searchItems.size());
    }

    @Step("Выбираем вес товара")
    public static void selectWeightProduct(String weight) {
        String weightSelectDefault = defaultWeightSelect.getText();
        if (!weightSelectDefault.equals(weight)) {
            switch (weight) {
                case "2":
                    productOptionSelected("2 кг").shouldBe(Condition.visible).click();
                    break;
                case "7":
                    productOptionSelected("7 кг").shouldBe(Condition.visible).click();
                    break;
                case "14":
                    productOptionSelected("14 кг").shouldBe(Condition.visible).click();
                    break;
                default:
                    throw new IllegalStateException("Неизвестное значение: " + weight);
            }
        }
    }
}
