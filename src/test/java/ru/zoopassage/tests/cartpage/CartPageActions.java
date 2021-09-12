package ru.zoopassage.tests.cartpage;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.Assert;

public class CartPageActions extends CartPageElement {

    @Step("Проверяем, что в корзине единственная позиция и с требуемым наименованием")
    public static void checkGoodForCart(int numberPositions, String nameGood) {
        checkInBasketGoods(numberPositions);
        Assert.assertTrue("Товара нет в корзине", nameGoodInCart(nameGood).isDisplayed());
    }

    @Step("Удалим позицию из корзины")
    public static void deletePosition(String namePosition) {
        deletePositionByName(namePosition).shouldBe(Condition.visible).click();
    }

    @Step("Проверяем, что корзина пуста")
    public static void checkCartIsEmpty() {
        Assert.assertTrue("Корзина не пуста", cartIsEmpty.isDisplayed());
    }

    private static void checkInBasketGoods(int numberPositions) {
        Assert.assertEquals("Количество товаров не совпадает с ожидаемым", numberPositions, itemInBasket.size());
    }
}
