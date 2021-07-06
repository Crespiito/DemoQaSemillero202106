package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.models.MenuModel;
import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.RadioButtonTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RadioButtonStepDefinition {
    @Dado("que el usuario accede al modulo {} en el item {}")
    public void queElUsuarioAccedeAlModuloElementsEnElItemRadioButton() {
        //OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(menuModel));
    }

    @Cuando("selecciona el radio button Impressive")
    public void seleccionaElRadioButtonImpressive() {
        OnStage.theActorInTheSpotlight().attemptsTo(RadioButtonTask.radioButtonTask());
    }

    @Entonces("el sistema muestra mensaje You have selected")
    public void elSistemaMuestraMensajeYouHaveSelected() {
        System.out.println("entra por el entonces");
    }



}