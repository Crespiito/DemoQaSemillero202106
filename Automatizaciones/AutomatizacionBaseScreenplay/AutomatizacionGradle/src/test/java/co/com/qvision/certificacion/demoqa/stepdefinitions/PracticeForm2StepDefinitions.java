package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.qvision.certificaion.demoqa.tasks.DiligenciarCamposTask.diligenciarCamposTask;
import static co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask.seleccionarOpcion;

public class PracticeForm2StepDefinitions {
    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                seleccionarOpcion()
        );
    }

    @Cuando("Selecciono el boton subir")
    public void seleccionoElBotonSubir() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                diligenciarCamposTask()
        );
    }

    @Entonces("Confirmo su se registro el formulario con campos vacios")
    public void confirmoSuSeRegistroElFormularioConCamposVacios() {

    }
}
