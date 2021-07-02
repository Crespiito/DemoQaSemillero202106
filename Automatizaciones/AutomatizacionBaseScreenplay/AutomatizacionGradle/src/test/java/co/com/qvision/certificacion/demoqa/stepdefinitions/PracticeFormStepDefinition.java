package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.models.FormData;
import co.com.qvision.certificaion.demoqa.questions.ValidarFormularioQuestion;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;



public class PracticeFormStepDefinition {

    @Dado("que el usuario ingresa al modulo {} y al submenu Seleccionando {}")
    public void queElUsuarioIngresaAlModuloFormsYAlSubmenuSeleccionandoPracticeForm(String opcion, String opcion2) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opcion, opcion2));
    }

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmite(){


    }
    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioTask.llenarFormularioTask());
    }

    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario() {
        FormData datos = new FormData("juan","pedraza","Female");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("la validacion de mi prueba", ValidarFormularioQuestion.validar(),sameBeanAs(datos)));
    }



}

