package co.com.certificacion.qvision.stepdefinitions.hooks;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


import java.util.Map;

public class Hooks {

    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;


    @Before()
    public void abrirNavegador() {
        demoQaGeneralSteps.abrirPaginaDemoQa();
    }

    @DataTableType
    public OpcionesMenuModel opcionesMenu(Map<String, String> dato) {
        return new OpcionesMenuModel(dato.get("La Tarjeta"), dato.get("Seleccionado"));
    }

    @DataTableType
    public FormDataModel formDataModel(Map<String, String> dato) {
        return new FormDataModel(
                dato.get("nombre"),
                dato.get("apellido"),
                dato.get("email"),
                dato.get("mobile"),
                dato.get("genero"),
                dato.get("subject"),
                dato.get("currentAddress")
        );
    }


}
