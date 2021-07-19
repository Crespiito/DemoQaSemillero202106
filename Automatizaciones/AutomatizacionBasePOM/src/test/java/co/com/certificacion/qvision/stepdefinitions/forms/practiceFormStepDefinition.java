package co.com.certificacion.qvision.stepdefinitions.forms;

import co.com.certificacion.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import co.com.certificacion.qvision.models.FormData;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.steps.DemoQaFormSteps;

public class practiceFormStepDefinition {
//StepDefinition -> Steps -> Interaction -> UI
    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;

    @Steps
    DemoQaFormSteps demoQaFormSteps;

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado(OpcionesMenuModel opciones) {
        demoQaGeneralSteps.seleccionarOpcion(opciones);
    }
   /* public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        demoQaGeneralSteps.abrirPaginaDemoQa();
        demoQaGeneralSteps.seleccionarTarjetaForms();
    }
*/
    @Cuando("lleno el formulario")
    public void llenoElFormulario(FormData data) {
        demoQaFormSteps.enviarFormularioBase(data);
    }

    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario(FormData data) {

        demoQaFormSteps.validarEnvio(data);
    }
}