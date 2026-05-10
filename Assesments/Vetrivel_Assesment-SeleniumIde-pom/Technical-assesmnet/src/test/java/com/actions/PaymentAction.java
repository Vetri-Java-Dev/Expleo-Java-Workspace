package com.actions;

import org.openqa.selenium.WebDriver;

import com.pages.PaymentPage;

public class PaymentAction {

    private PaymentPage paymentPage;

    public PaymentAction(WebDriver driver) {
        paymentPage = new PaymentPage(driver);
    }

    public void pay(String name, String number, String cvc,
                    String month, String year) {

        paymentPage.makePayment(name, number, cvc, month, year);
    }

    public String getSuccessMessage() {
        return paymentPage.getSuccessMessage();
    }
}
