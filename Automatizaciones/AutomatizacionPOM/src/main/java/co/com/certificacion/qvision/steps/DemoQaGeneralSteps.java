package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.pages.interactions.DemoQaGeneralInteractions;
import org.fluentlenium.core.annotation.Page;

public class DemoQaGeneralSteps {

    @Page
    DemoQaGeneralInteractions demoQaGeneralInteractions;

    public void abrirPaginaDemoQa(){
        demoQaGeneralInteractions.open();
    }
}
