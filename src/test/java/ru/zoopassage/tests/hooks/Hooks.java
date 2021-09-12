package ru.zoopassage.tests.hooks;

import io.qameta.allure.Step;

public interface Hooks {

    @Step("Запуск браузера. Открываем URL")
    static void open(String url) {
    }

    @Step("Убиваем браузер")
    static void stopTests() {
    }
}
