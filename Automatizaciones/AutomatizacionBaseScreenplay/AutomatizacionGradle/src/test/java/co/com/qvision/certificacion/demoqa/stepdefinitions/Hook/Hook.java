package co.com.qvision.certificacion.demoqa.stepdefinitions.Hook;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;

import  net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class Hook {

    /*@Before("@Test")
    public void abrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Miguel");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }*/


    @Before()
    public void abrirNavegadorMenu(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Miguel");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }
}
