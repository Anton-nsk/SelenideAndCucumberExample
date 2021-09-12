package ru.zoopassage.tests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Step;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.browserSize;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"ru.zoopassage.tests"},
        plugin = "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
)

public class TestRunner {

    @BeforeClass
    @Step("Устанавливаем параметры браузера")
    public static void browserConfigurations() {
        browser = CHROME;
        browserSize = "1920x1080";
    }
}
