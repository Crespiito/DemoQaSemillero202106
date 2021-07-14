package co.com.certificacion.qvision.stepdefinitions.hooks;

import co.com.certificacion.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.Before;

import net.thucydides.core.annotations.Steps;

public class Hooks {

    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;

    @Before()
    public void abrirNavegador(){
        demoQaGeneralSteps.abrirPaginaDemoQa();
    }

}
