package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;


import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import co.com.qvision.certificaion.demoqa.models.RadioButtonModel;
import co.com.qvision.certificaion.demoqa.questions.ValidarYesRadioButtonQuestion;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.RadioButtonTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;


public class RadioButtonStepDefinition {

    @Dado("que el usuario accede al modulo Elements en el item Radio Button")
    public void queElUsuarioAccedeAlModuloElementsEnElItemRadioButton(OpcionMenuModel opciones)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opciones));
    }

    @Cuando("selecciona el radio button Yes")
    public void seleccionaElRadioButtonYes(RadioButtonModel datosRB)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(RadioButtonTask.radioButtonTask(datosRB ));
    }

    @Entonces("el sistema muestra mensaje You have selected Yes")
    public void elSistemaMuestraMensajeYouHaveSelectedYes(RadioButtonModel datosRB) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Validacion boton",
                ValidarYesRadioButtonQuestion.valida(),sameBeanAs(datosRB.getMessage())));
    }
}
