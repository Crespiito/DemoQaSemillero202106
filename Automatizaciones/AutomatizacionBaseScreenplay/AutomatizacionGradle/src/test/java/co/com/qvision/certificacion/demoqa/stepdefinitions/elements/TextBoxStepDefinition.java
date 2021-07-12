package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.models.MenuModel;
import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import co.com.qvision.certificaion.demoqa.questions.elements.TextBoxQuestion;
import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.TexBoxTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

public class TextBoxStepDefinition {

    @Dado("que como usuario en el item Text Box del modulo elements")
    public void queComoUsuarioEnElItemTextBoxDelModuloElements(MenuModel menuModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(menuModel.getModulo(), menuModel.getIntem()));
    }

    @Cuando("ingreso datos en los campos de texto")
    public void ingresoDatosEnLosCamposDeTexto(TextBoxModel textBoxModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(TexBoxTask.texBoxTask(textBoxModel));
    }
    @Entonces("verifico que se guarden los datos")
    public void verificoQueSeGuardenLosDatos(TextBoxModel textBoxModel) {
 OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextBoxQuestion.textBoxQuestion(),sameBeanAs(textBoxModel)));

    }

}
