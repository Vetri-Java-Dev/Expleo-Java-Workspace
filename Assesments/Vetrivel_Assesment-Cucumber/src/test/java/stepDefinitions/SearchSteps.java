package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverFactory;

public class SearchSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());

    @Given("user launches the TutorialsNinja application")
    public void user_launches_application() {
        DriverFactory.getDriver().get("https://tutorialsninja.com/demo");
    }

    @When("user searches for {string}")
    public void user_searches_for(String keyword) {
        homePage.enterProduct(keyword);
        homePage.clickSearch();
    }

    @Then("search result should {string} the product")
    public void search_result_should_verify(String condition) {

        boolean productDisplayed=homePage.isProductDisplayed();

        if(condition.equalsIgnoreCase("contain")) {
            Assert.assertTrue(productDisplayed);
        }
        else if(condition.equalsIgnoreCase("not contain")) {
            Assert.assertFalse(productDisplayed);
        }
    }
}