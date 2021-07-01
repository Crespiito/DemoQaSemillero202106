package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;


import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.RadioButtonTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class RadioButtonStepDefinition {

    @Dado("que el usuario accede al modulo {} en el item {}")
    public void queElUsuarioAccedeAlModuloElementsEnElItemRadioButton(String opcion, String opcion2) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opcion, opcion2));
    }

    @Cuando("selecciona el radio button Impressive")
    public void seleccionaElRadioButtonImpressive() {
        OnStage.theActorInTheSpotlight().attemptsTo(RadioButtonTask.radioButtonTask());
    }

    @Entonces("el sistema muestra mensaje You have selected")
    public void elSistemaMuestraMensajeYouHaveSelected() {
        System.out.println("Entonces");
    }
}
