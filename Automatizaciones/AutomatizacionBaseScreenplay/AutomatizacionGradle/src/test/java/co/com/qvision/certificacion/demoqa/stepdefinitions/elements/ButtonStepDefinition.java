package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.models.ButtonModel;
import co.com.qvision.certificaion.demoqa.models.MenuModel;
import co.com.qvision.certificaion.demoqa.questions.elements.ButtonQuestion;
import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.ButtonTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

public class ButtonStepDefinition {
    @Dado("que como usuario en el modulo Elements y el submodulo Buttons")
    public void queComoUsuarioEnElModuloElementsYElSubmoduloButtons(MenuModel menuModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(menuModel.getModulo(),menuModel.getIntem()));
    }

    @Cuando("Selecciona los botones")
    public void seleccionaLosBotones(ButtonModel buttonModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(ButtonTask.buttonTask(buttonModel));

    }

    @Entonces("verifico los mensajes que muestra")
    public void verificoLosMensajesQueMuestra(ButtonModel buttonModel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("valida mensaje button",
                ButtonQuestion.buttonQuestion(),sameBeanAs(buttonModel.getMensaje())));
    }
}
