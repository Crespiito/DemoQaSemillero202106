package co.com.qvision.certificacion.demoqa.stepdefinitions.practiceform;

import co.com.qvision.certificaion.demoqa.models.FormData;
import co.com.qvision.certificaion.demoqa.questions.ValidarFormularioQuestion;
import co.com.qvision.certificaion.demoqa.tasks.LlenarFormulario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;


public class PracticeFormStepDefinition {

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario(FormData datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenarFormulario(datos));
    }


    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario() {
        FormData datos = OnStage.theActorInTheSpotlight().recall("datos");
        //FormData datos = Serenity.sessionVariableCalled("datos");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("la validacion de mi prueba", ValidarFormularioQuestion.validar(),sameBeanAs(datos)));
    }



}
