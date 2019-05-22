package WebTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {


    HomePage homePage = new HomePage();
    RegisterPage registerPage =new RegisterPage();
    CurrencyChange currencyChange=new CurrencyChange();
    ProductShortByHighToLaw productShortByHighToLaw =new ProductShortByHighToLaw();

    @Given("^user is on register page$")
    public void userIsOnRegisterPage() {
        homePage.UserShouldBeAbleToClickRegisterButtonSuccessfully();
        registerPage.enterDetailsForRegistration();
    }

    @When("^user enters all registration details$")
    public void userEntersAllRegistrationDetails() {
    }

    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully() {
    }



    @When("^user hovering on apparel$")
    public void userHoveringOnApparel() {

    }

    @Then("^user click on clothing$")
    public void userClickOnClothing() {

    }

    @And("^click on currecncy$")
    public void clickOnCurrecncy() {
    }

    @And("^click on Euro$")
    public void clickOnEuro() {

    }

    @And("^Click on Sort Currency$")
    public void clickOnSortCurrency() {

    }

    @And("^click on USD$")
    public void clickOnUSD() {

    }


    @Then("^Check for value$")
    public void checkForValue() {
    }

    @Given("^user on Home page$")
    public void userOnHomePage() {

    }

    @When("^user hovering on Electronics$")
    public void userHoveringOnElectronics() {

    }

    @Then("^user click on cell phone$")
    public void userClickOnCellPhone() {

    }

    @And("^Click on Sort order$")
    public void clickOnSortOrder() {

    }

    @And("^click on click hig to law$")
    public void clickOnClickHigToLaw() {

    }


    @Then("^sorting in decending order$")
    public void sortingInDecendingOrder() {
    }

    @And("null")
    public void getTextOf$Valu() {
    }
}




