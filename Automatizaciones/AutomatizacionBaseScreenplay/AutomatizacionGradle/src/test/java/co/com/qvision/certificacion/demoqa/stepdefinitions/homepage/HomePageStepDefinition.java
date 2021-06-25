package co.com.qvision.certificacion.demoqa.stepdefinitions.homepage;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask;
import io.cucumber.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomePageStepDefinition {

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeFormulariosYElSubmenu(OpcionesMenuModel opciones) {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTask.menu(opciones));
    }
}
