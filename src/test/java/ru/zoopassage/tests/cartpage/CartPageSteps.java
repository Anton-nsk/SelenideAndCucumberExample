package ru.zoopassage.tests.cartpage;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

import static ru.zoopassage.tests.basicpage.BasicPageActions.checkOpenNeedPage;

public class CartPageSteps extends CartPageActions {

    @И("Проверяем, что в корзине требуемое количество ([^\"]*) товара \"([^\"]*)\"")
    public static void checkPositionInGood(int sumPosition, String namePosition) {
        checkOpenNeedPage("Корзина");
        checkGoodForCart(sumPosition, namePosition);
    }

    @Тогда("Удалим позицию \"([^\"]*)\" из корзины")
    public static void deletePositionByNameInCart(String namePosition) {
        deletePosition(namePosition);
        checkCartIsEmpty();
    }
}
