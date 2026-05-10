package com.actions;

import org.openqa.selenium.WebDriver;

import com.pages.CartPage;

public class CartAction {

    private CartPage page;

    public CartAction(WebDriver driver) {
        page = new CartPage(driver);
    }

    public void openCart() {
        page.openCart();
    }

    public void proceedToCheckout() {
        page.clickCheckout();
    }

    public void placeOrder() {
        page.clickPlaceOrder();
    }
}