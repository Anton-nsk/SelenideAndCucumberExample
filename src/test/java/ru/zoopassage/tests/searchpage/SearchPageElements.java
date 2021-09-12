package ru.zoopassage.tests.searchpage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPageElements {

    protected static final SelenideElement defaultWeightSelect = $x("//*[@class = 'product-option selected']/div[@class = 'product-option__amount']");
    protected static final SelenideElement resultsSearch = $(By.id("zag1"));
    protected static final ElementsCollection searchItems = $$x("//div[contains(@class, 'catalog-products')]/div");
    protected static final SelenideElement btnAddCart = $x("//a[contains(@class, 'product-buttonbar')]/*[@alt = 'Корзина']/..");
    protected static final SelenideElement counterGoodOfCart = $x("//*[@class = 'navbar__cart-item-amount']");

    protected static SelenideElement productOptionSelected(String weight) {
        return $x(String.format("//*[@class = 'product-option']/div[text() = '%s']", weight));
    }
}
