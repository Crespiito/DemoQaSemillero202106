package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    @Before()
    public void abrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }

    @DataTableType
    public OpcionesMenuModel opcionesMenu(Map<String,String> datos){
        return new OpcionesMenuModel(datos.get("La Tarjeta"),datos.get("Seleccionado"));
    }




}
