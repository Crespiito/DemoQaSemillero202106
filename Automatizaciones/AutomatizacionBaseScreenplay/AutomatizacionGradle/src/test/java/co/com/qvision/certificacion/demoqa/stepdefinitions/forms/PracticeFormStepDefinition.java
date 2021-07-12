package co.com.qvision.certificacion.demoqa.stepdefinitions.forms;

import co.com.qvision.certificaion.demoqa.models.DataForm;
import co.com.qvision.certificaion.demoqa.models.MenuModel;
import co.com.qvision.certificaion.demoqa.questions.PracticeFormTableQuestion;
import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import  static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PracticeFormStepDefinition {


    @Dado("que el usuario ingresa al modulo Forms en el item Practice Form")
    public void queElUsuarioIngresaAlModuloFormsEnElItemPracticeForm(MenuModel menuModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(menuModel.getModulo(),menuModel.getIntem()));

    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario(DataForm dataForm) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioTask.llenarFormularioTask(dataForm));
    }

    @Entonces("confirmo si se envio el formulario")
    public void confirmoSiSeEnvioElFormulario(DataForm dataForm) {
       OnStage.theActorInTheSpotlight().should(seeThat("valida obj", PracticeFormTableQuestion.practiceFormQuestion2(),sameBeanAs(dataForm)));

    }
}
