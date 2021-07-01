package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import lombok.Value;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

public class Hooks {

    @Before(value= "@test12")
    public void abrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoqa.com/"));
    }
/*
    @DataTableType
    public OpcionesMenuModel opcionesMenu(Map<String,String> dato) {
        return new OpcionesMenuModel(dato.get("Tarjeta"),dato.get("Seleccionado"));
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
*/
    //@After



}
