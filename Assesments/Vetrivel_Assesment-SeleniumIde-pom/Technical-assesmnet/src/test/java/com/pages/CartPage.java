package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By cart = By.xpath("//a[contains(text(),'Cart')]");
    By checkout = By.xpath("//a[contains(text(),'Proceed To Checkout')]");
    By placeOrder = By.xpath("//a[contains(text(),'Place Order')]");

    public void openCart() {
        safeClick(cart);
    }

    public void clickCheckout() {
        safeClick(checkout);
    }

    public void clickPlaceOrder() {
        safeClick(placeOrder);
    }
}