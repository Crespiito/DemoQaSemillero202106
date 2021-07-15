package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Hooks {

    @Before("@Test")

    public void abrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ana");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));

    }

    @Before("@Test2")

    public void abrirNavegadorTextBox(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ana");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));

    }

    @Before("@Test3")
    public void abrirNavegadorWindows(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ana");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));

    }

    @Before("@Test4")
    public void abrirNavegadorRadioButton(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ana");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));

    }

    @Before("@Test5")
    public void abrirNavegadorButtons(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ana");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));

    }
        }



