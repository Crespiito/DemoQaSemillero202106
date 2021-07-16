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




}
