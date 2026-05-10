package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    By nameOnCard=By.name("name_on_card");
    By cardNumber=By.name("card_number");
    By cvc=By.name("cvc");
    By expiryMonth=By.name("expiry_month");
    By expiryYear=By.name("expiry_year");

    By payButton=By.xpath("//button[normalize-space()='Pay and Confirm Order']");
    By successMsg=By.xpath("//p[contains(text(),'Congratulations')]");

    public void enterNameOnCard(String name) {
        safeType(nameOnCard, name);
    }

    public void enterCardNumber(String number) {
        safeType(cardNumber, number);
    }

    public void enterCVC(String code) {
        safeType(cvc, code);
    }

    public void enterExpiryMonth(String month) {
        safeType(expiryMonth, month);
    }

    public void enterExpiryYear(String year) {
        safeType(expiryYear, year);
    }

    public void clickPay() {
        safeClick(payButton);
    }

    public void makePayment(String name, String number, String cvcCode,
                            String month, String year) {
        enterNameOnCard(name);
        enterCardNumber(number);
        enterCVC(cvcCode);
        enterExpiryMonth(month);
        enterExpiryYear(year);

        clickPay();
    }

    public String getSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg))
        		.getText();
    }
}