package co.com.qvision.certificacion.demoqa.homepage;

import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import io.cucumber.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomePageStepDefinition {
    @Dado("que como usuario ingrese a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queComoUsuarioEnElModuloFormsYEnElItemPracticesForm(OpcionMenuModel opciones) {
      theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opciones));
    }
}
