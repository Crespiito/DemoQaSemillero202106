package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.questions.ValidarFormularioQuestion;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.regex.Matcher;

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
    public void comoUsusarioEnvioElFormulario() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Validacion de mi prueba", ValidarFormularioQuestion.validar(),Matchers.is("null")));
    }



}

