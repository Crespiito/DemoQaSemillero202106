package co.com.certificacion.qvision.stepdefinitions.forms;

import co.com.certificacion.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class practiceFormStepDefinition {
//StepDefinition -> Steps -> Interaction -> UI
    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        demoQaGeneralSteps.abrirPaginaDemoQa();
        demoQaGeneralSteps.selectTarjetaForms();
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario() {

        System.out.println("entro al Cuando");
    }

    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario() {

        //demoQaGeneralSteps.validarTituloTarjeta();
    }
}
