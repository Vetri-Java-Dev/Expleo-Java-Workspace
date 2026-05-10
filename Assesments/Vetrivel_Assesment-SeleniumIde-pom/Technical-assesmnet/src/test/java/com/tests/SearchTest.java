package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actions.CartAction;
import com.actions.PaymentAction;
import com.actions.SearchAction;
import com.actions.SignupAction;
import com.dataProviders.DataProviderForSearch;
import com.listeners.ListenerForAutomationExercise;

@Listeners(ListenerForAutomationExercise.class)
public class SearchTest extends BaseTest {

	private static SearchAction action;
	
	@BeforeClass
	public void login() {
	    SignupAction action = new SignupAction(getDriver());
	    action.login("2k22cse163@kiot.ac.in", "admin");
	}
	
	@BeforeMethod
	public void init() {
		action=new SearchAction(driver.get());
	}
	
	@Test(dataProvider="validsearch", dataProviderClass=DataProviderForSearch.class,
			enabled=true)
	public void search(String keyword) {
		action.search(keyword);
		Assert.assertTrue(action.isExist(keyword));
	}
	
	@Test(testName="addToCart")
	public void addToCart() {
		action.addToCart("shirt");
		Assert.assertEquals(action.getAdded(),"Added!");
	}
	
	@Test
	public void addToCartAndCheckoutTest() {

	    SearchAction search = new SearchAction(getDriver());
	    CartAction cart = new CartAction(getDriver());
	    PaymentAction payment = new PaymentAction(getDriver());

	    search.addToCart("shirt");

	    cart.openCart();
	    cart.proceedToCheckout();
	    cart.placeOrder();

	    payment.pay("Vetri Vel","4111111111111111","123","12","2030");

	    Assert.assertTrue(payment.getSuccessMessage().toLowerCase().contains("congrat"));
	}
	
	
}
