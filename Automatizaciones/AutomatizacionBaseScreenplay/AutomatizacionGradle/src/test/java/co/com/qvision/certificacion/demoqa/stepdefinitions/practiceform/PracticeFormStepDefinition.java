package co.com.qvision.certificacion.demoqa.stepdefinitions.practiceform;

import co.com.qvision.certificaion.demoqa.tasks.LlenarFormulario;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PracticeFormStepDefinition {

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.seleccionarOpcion());
    }


    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
    }


    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        System.out.println("entro al entonces");

    }


    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenarFormulario());
    }
}
