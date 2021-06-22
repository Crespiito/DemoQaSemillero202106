package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before(value = "@test", order = 2)
    public void abrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoqa.com/"));
    }

    @Before(value = "@test2", order = 3)
    public void abrirNavegador2(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoqa.com/"));
    }

    @Before(value = "@test3", order = 1)
    public void abrirNavegador3(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoqa.com/"));
    }

    //@After



}
