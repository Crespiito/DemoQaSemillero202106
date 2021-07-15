package co.com.qvision.certificacion.demoqa.stepdefinitions.hookservice;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    @Before()
    public void abilitarServicio(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        theActorInTheSpotlight().whoCan(CallAnApi.at("https://demoqa.com/"));
    }
}
