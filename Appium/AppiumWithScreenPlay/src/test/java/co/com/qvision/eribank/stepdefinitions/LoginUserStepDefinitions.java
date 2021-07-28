package co.com.qvision.eribank.stepdefinitions;

import co.com.qvision.eribank.questions.HomePageQuestion;
import co.com.qvision.eribank.userinterfaces.LoginToTheApp;
import co.com.qvision.eribank.utils.MyDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginUserStepDefinitions {

    private String userName = "company";
    private String userPassword = "company";

    private Actor Eli = Actor.named("Eli");

    @Given("^that Eli open the app$")
    public void thatEliOpenTheApp() throws Exception {
        Eli.can(BrowseTheWeb.with(MyDriver.abrirApp()));
    }


    @When("^she enters with valid user data$")
    public void sheEntersWithValidUserData() throws Exception {
        Eli.attemptsTo(LoginToTheApp.withUserData(userName, userPassword));
    }

    @Then("^She can see the main menu$")
    public void sheCanSeeTheMainMenu() throws Exception {
       Eli.should(
               seeThat(HomePageQuestion.isVisible())
       );
    }

}
