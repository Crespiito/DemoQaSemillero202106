package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.models.OpcionRadioButtonModel;
import co.com.qvision.certificaion.demoqa.questions.ValidarRaddioButtonQuestion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static co.com.qvision.certificaion.demoqa.tasks.HacerClickTask.hacerClickTask;
import static co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask.seleccionarOpcion;

public class RadioButtonsStepDefinitions {


    @Cuando("despliegue la lista de Elements Boton")
    public void despliegueLaListaDeElements(OpcionRadioButtonModel opcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                hacerClickTask(opcion.getBoton())
        );
    }

    @Entonces("valido que este presente el item Radio Button")
    public void validoQueEstePresenteElItemRadioButton() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                "La validación de mi prueba es",
                ValidarRaddioButtonQuestion.validarRaddioButtonQuestion(),
                Matchers.anyOf(
                        Matchers.equalTo("Yes"),
                        Matchers.equalTo("Impressive")
                )
        ));
    }

}
