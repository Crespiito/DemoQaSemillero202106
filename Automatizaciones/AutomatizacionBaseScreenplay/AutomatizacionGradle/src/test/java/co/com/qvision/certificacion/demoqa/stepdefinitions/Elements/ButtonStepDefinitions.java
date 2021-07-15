package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.models.ButtonModel;
import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import co.com.qvision.certificaion.demoqa.questions.ValidarButtonQuestion;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.ButtonTask;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

public class ButtonStepDefinitions {

    @Dado("que como usuario accede al modulo Elements en el item Buttons")
    public void queComoUsuarioAccedeAlModuloElementsEnElItemButtons(OpcionMenuModel opciones) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opciones));
    }

    @Cuando("le doy click al boton")
    public void leDoyClickAlBoton(ButtonModel datosB)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(ButtonTask.buttonTask(datosB)
        );
    }


    @Entonces("verifico un mensaje You have done a double click")
    public void verificoUnMensajeYouHaveDoneADoubleClick(ButtonModel datosB) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Validar boton",
                ValidarButtonQuestion.validar(),sameBeanAs(datosB.getMensaje())));
    }
}

