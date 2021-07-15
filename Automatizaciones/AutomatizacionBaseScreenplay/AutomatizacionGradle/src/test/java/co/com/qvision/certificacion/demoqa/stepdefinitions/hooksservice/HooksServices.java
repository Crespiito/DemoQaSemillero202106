package co.com.qvision.certificacion.demoqa.stepdefinitions.hooksservice;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class HooksServices {

    @Before()
    public void habilitarServicio() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at("https://www.demoqa.com/"));
    }

}
