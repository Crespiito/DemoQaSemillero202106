package co.com.certificacion.qvision.stepdefinitions.forms;

import co.com.certification.qvision.models.FormData;
import co.com.certification.qvision.models.OpcionMenuModel;
import co.com.certification.qvision.steps.DemoQaGeneralSteps;
import co.com.certification.qvision.steps.PracticeFormStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;



public class PracticeFormStepDefinitions {

    @Steps
    PracticeFormStep practiceFormStep;

    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;



    @Dado("que el usuario ingresa al modulo de La Tarjeta y al submenu Seleccionando")
    public void queElUsuarioIngresaAlModuloDeLaTarjetaYAlSubmenuSeleccionando(OpcionMenuModel opciones) {
        demoQaGeneralSteps.abrirPaginaDemoQa();
        demoQaGeneralSteps.seleccionarOpcion(opciones);
        demoQaGeneralSteps.seleccionarSubMenu(opciones);
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario(FormData formData) {
        practiceFormStep.llenaCampos(formData);
    }


    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario(FormData data) {

        practiceFormStep.validarEnvio(data);
    }

}
