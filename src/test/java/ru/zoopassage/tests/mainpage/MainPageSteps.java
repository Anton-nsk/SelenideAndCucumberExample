package ru.zoopassage.tests.mainpage;

import io.cucumber.java.ru.Тогда;

public class MainPageSteps extends MainPageActions {

    @Тогда("Ищем товар с названием \"([^\"]*)\"$")
    public static void searchGood(String goodName) {
        searchGoodForName(goodName);
    }
}
