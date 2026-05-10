package com.actions;

import org.openqa.selenium.WebDriver;

public class OrderAction {

    private SearchAction search;
    private CartAction cart;
    private PaymentAction payment;
    private SignupAction login;

    public OrderAction(WebDriver driver) {
        search = new SearchAction(driver);
        cart = new CartAction(driver);
        payment = new PaymentAction(driver);
        login = new SignupAction(driver);
    }

    public void placeOrder(String email, String password, String product) {
        login.login(email, password);

        search.addToCart(product);

        cart.openCart();
        cart.proceedToCheckout();

        // 🔹 Payment
        payment.pay(
            "Vetri Vel",
            "4111111111111111",
            "123",
            "12",
            "2030"
        );
    }

    public String getOrderSuccessMessage() {
        return payment.getSuccessMessage();
    }
}