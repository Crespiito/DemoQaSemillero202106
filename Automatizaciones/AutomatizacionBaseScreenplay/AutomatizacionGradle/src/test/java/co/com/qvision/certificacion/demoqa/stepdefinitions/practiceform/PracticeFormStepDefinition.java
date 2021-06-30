package co.com.qvision.certificacion.demoqa.stepdefinitions.practiceform;

import co.com.qvision.certificaion.demoqa.models.FormData;
import co.com.qvision.certificaion.demoqa.questions.ValidarFormularioQuestion;
import co.com.qvision.certificaion.demoqa.tasks.LlenarFormulario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.Matchers.equalTo;


public class PracticeFormStepDefinition {

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenarFormulario());
    }


    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario() {
        FormData datos = new FormData("juan","bautista","Female");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("la validacion de mi prueba", ValidarFormularioQuestion.validar(),sameBeanAs(datos)));
    }



}
