package co.com.qvision.certificacion.demoqa.homepage;

import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import io.cucumber.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomePageStepDefinition {
    @Dado("que como usuario ingrese a la opcion {}")
    public void queComoUsuarioEnElModuloFormsYEnElItemPracticesForm(String opcion ) {
   //     theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opcion));
    }
}
