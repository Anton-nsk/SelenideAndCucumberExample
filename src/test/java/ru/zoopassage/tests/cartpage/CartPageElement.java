package ru.zoopassage.tests.cartpage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CartPageElement {

    protected static final SelenideElement resultsSearch = $(By.id("basket_items"));
    protected static final ElementsCollection itemInBasket = $$x("//div[@id = 'basket_items']/div");
    protected static final SelenideElement cartIsEmpty = $x("//*[@class = 'errortext'][text() = 'Ваша корзина пуста']");

    protected static SelenideElement deletePositionByName(String nameGood) {
        return $x(String.format("//div[@data-item-name = '%s']//*[@class = 'pagecart-positions-cost__remove']", nameGood));
    }

    protected static SelenideElement nameGoodInCart(String nameGood) {
        return $x(String.format("//div[@data-item-name = '%s']", nameGood));
    }
}
