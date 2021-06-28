package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    @Before(value = "@Test1", order = 0)
    public void abrirNavegador() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }

    @Before(value = "@TestElements", order = 1)
    public void abrirNavegadorElements() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/elements"));
    }

    @Before(value = "@TestForms", order = 1)
    public void abrirNavegadorForms() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/forms"));
    }

    @Before(value = "@TestAlerts", order = 1)
    public void abrirNavegadorAlertsWindows() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/alertsWindows"));
    }

    @Before(value = "@TestWidgets", order = 1)
        public void abrirNavegadorWidgets() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/widgets"));
    }

    @Before(value = "@TestInteraction", order = 1)
        public void abrirNavegadorInteraction(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/interaction"));
    }

}
