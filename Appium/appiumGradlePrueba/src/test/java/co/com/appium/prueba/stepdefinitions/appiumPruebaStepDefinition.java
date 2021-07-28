package co.com.appium.prueba.stepdefinitions;

import co.com.appium.prueba.steps.AppiumHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class appiumPruebaStepDefinition {



	@Steps
	AppiumHomePage stepsAppium;


	@Given("^I have a calculator$")
	public void iHaveACalculator() throws Exception {
		stepsAppium.openDriverAppium();
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void iAddAnd(int arg1, int arg2) throws Exception {
		stepsAppium.testOperationSum();
	}

	@Then("^the sum should be (\\d+)$")
	public void theSumShouldBe(int arg1) throws Exception {
		stepsAppium.validationResultSum();
	}

	@When("^I subtract (\\d+) and (\\d+)$")
	public void iSubtractAnd(int arg1, int arg2) throws Exception {
		stepsAppium.testOperationSub();
	}

	@Then("^the subtract should be (\\d+)$")
	public void theSubtractShouldBe(int arg1) throws Exception {
		stepsAppium.validationResultSub();
	}

	@When("^I multiply (\\d+) and (\\d+)$")
	public void iMultiplyAnd(int arg1, int arg2) throws Exception {
		stepsAppium.testOperationMul();
	}

	@Then("^the multiply should be (\\d+)$")
	public void theMultiplyShouldBe(int arg1) throws Exception {
		stepsAppium.validationResultMul();
	}

	@When("^I divide (\\d+) and (\\d+)$")
	public void iDivideAnd(int arg1, int arg2) throws Exception {
		stepsAppium.testOperationDiv();
	}

	@Then("^the divide should be (\\d+)$")
	public void theDivideShouldBe(int arg1) throws Exception {
		stepsAppium.validationResultDiv();
	}
}

