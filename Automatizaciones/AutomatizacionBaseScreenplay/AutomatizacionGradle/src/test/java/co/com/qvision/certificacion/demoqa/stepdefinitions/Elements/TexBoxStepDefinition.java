package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import co.com.qvision.certificaion.demoqa.questions.TextBoxQuestion;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.SeleccionarOpcionTextTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;


public class TexBoxStepDefinition {
    @Dado("Yo como usuario en el modulo elements en el formulario de Text Box")
    public void yoComoUsuarioEnElModuloElementsEnElFormularioDeTextBox(OpcionMenuModel opciones) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opciones));


    }

    @Cuando("Diligencio cada uno de los campos")
    public void diligencioCadaUnoDeLosCampos(TextBoxModel datosTB) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTextTask.seleccionarOpcionTextTask(datosTB));
    }


    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void seVisualizaraElResumenDeLaInformacionDiligenciada(TextBoxModel datosTB) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Validacion de prueba Text box",
                TextBoxQuestion.validar(),sameBeanAs(datosTB)));
    }


}
