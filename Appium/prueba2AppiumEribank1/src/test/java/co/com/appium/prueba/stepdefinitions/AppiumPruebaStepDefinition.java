package co.com.appium.prueba.stepdefinitions;

import co.com.appium.prueba.steps.AppiumHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AppiumPruebaStepDefinition {

    @Steps
    AppiumHomePage stepsAppium;


    @Given("^I want log in to the application$")
    public void iWantLogInToTheApplication() throws Exception {
        stepsAppium.openDriverAppium();
    }

    @When("^I enter the username and password$")
    public void iEnterTheUsernameAndPassword() throws Exception {
        stepsAppium.enterTheDataAccountValid();
    }

    @When("^I click the login button$")
    public void iClickTheLoginButton() throws Exception {
        stepsAppium.enterLogin();
    }

    @Then("^I verify that the login is successful$")
    public void iVerifyThatTheButtonIsActive() throws Exception {
        stepsAppium.validationLogin();
    }
}
