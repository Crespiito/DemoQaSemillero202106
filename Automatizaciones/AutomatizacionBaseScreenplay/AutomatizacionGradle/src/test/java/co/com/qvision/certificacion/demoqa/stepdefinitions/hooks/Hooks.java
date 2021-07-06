package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import co.com.qvision.certificaion.demoqa.models.OpcionRadioButtonModel;
import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import lombok.Value;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

public class Hooks {

    @Before(value = "@test11")
    public void abrirNavegador() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoqa.com/"));
    }

    @DataTableType
    public OpcionesMenuModel opcionesMenu(Map<String, String> dato) {
        return new OpcionesMenuModel(dato.get("La Tarjeta"), dato.get("Seleccionado"));
    }

    @DataTableType
    public FormDataModel formDataModel(Map<String, String> dato) {
        return new FormDataModel(
                dato.get("Nombre"),
                dato.get("Apellido"),
                dato.get("Genero"),
                dato.get("Mobile"),
                dato.get("Email"),
                dato.get("Subject"),
                dato.get("CurrentAddres"));
    }

    @DataTableType
    public OpcionRadioButtonModel opcionRadioButton(Map<String, String> dato) {
        return new OpcionRadioButtonModel(dato.get("Boton"));
    }
/*
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
