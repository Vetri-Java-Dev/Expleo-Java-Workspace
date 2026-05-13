package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddressBookPage;
import pages.LoginPage;
import utils.DriverFactory;

public class AddressBookSteps {

    LoginPage loginPage=new LoginPage(DriverFactory.getDriver());

    AddressBookPage addressPage=new AddressBookPage(DriverFactory.getDriver());

    @Given("user logs into TutorialsNinja application")
    public void user_logs_into_application() {

        WebDriver driver = DriverFactory.getDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        loginPage.login("cucumberAssesment@gmail.com","Cucumber");
    }

    @When("user adds new address with following details")
    public void user_adds_new_address(DataTable dataTable) {

        Map<String, String> data = dataTable.asMap();

        addressPage.clickAddressBook();
        addressPage.clickNewAddress();

        String firstName = data.get("firstname");
        String lastName = data.get("lastname");
        String address = data.get("address1");
        String city = data.get("city");
        String postcode = data.get("postcode");
        String country = data.get("country");
        String region = data.get("region");

        addressPage.addAddress(firstName,lastName,address,city,postcode,country,region);
        addressPage.clickContinue();
    }

    @Then("address should be added successfully")
    public void address_should_be_added_successfully() {
        Assert.assertTrue(addressPage.isAddressAdded());
    }
}