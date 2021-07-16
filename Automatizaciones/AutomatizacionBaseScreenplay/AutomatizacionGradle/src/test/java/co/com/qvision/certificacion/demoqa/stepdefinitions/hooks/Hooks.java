package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import co.com.qvision.certificaion.demoqa.models.OpcionRadioButtonModel;
import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
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
    public TextBoxModel textBoxModel(Map<String, String> dato) {
        return new TextBoxModel(
                dato.get("Name"),
                dato.get("Mail"),
                dato.get("CuAdd"),
                dato.get("PeAdd")
        );
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



}
