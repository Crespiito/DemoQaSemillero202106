package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.models.MenuModel;
import co.com.qvision.certificaion.demoqa.models.RadioButtonModel;
import co.com.qvision.certificaion.demoqa.questions.elements.RadioButtonQuestion;
import co.com.qvision.certificaion.demoqa.questions.elements.TextBoxQuestion;
import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.RadioButtonTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

public class RadioButtonStepDefinition {
    @Dado("que el usuario en el modulo Elements y submodulo Radio Button")
    public void queElUsuarioEnElModuloElementsYSubmoduloRadioButton(MenuModel menuModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(menuModel.getModulo(), menuModel.getIntem()));
    }

    @Cuando("selecciona los botones")
    public void seleccionaLosBotones(RadioButtonModel radioButtonModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(RadioButtonTask.radioButtonTask(radioButtonModel));
    }

    @Entonces("valida que el mensaje mostrado sea el deseado")
    public void validaQueElMensajeMostradoSeaElDeseado(RadioButtonModel radioButtonModel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                RadioButtonQuestion.radioButtonQuestion(),sameBeanAs(radioButtonModel.getMensaje())));
    }



}
