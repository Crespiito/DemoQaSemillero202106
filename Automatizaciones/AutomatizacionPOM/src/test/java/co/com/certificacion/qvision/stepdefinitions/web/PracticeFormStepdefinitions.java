package co.com.certificacion.qvision.stepdefinitions.web;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.steps.DemoQaFormsSteps;
import co.com.certificacion.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class PracticeFormStepdefinitions {

    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;

    @Steps
    DemoQaFormsSteps demoQaFormsSteps;

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado(OpcionesMenuModel option) {
        demoQaGeneralSteps.seleccionarOpcion(option);
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario(FormDataModel option) {
        demoQaFormsSteps.diligenciarFormulario(option);
    }

    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario(FormDataModel option) {
        //demoQaGeneralSteps.validarTitulo();

    }

}
