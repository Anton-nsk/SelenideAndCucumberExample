package ru.zoopassage.tests.basicpage;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Тогда;

public class BasicPageSteps extends BasicPageActions {

    public static final String BASIC_URL = "https://spb.zoopassage.ru/";

    @Дано("Открываем страницу интернет-магазина 'Зоопассаж'")
    public void openPage() {
        open(BASIC_URL);
        checkOpenedPage();
    }

    @Тогда("Переходим в корзину")
    public void goToCart() {
        openCart();
    }
}
