package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.pages.interactions.DemoQaGeneralInteractions;
import co.com.certificacion.qvision.pages.interactions.DemoQaSubMenuInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class DemoQaGeneralSteps {

    @Page
    DemoQaGeneralInteractions demoQaGeneralInteractions;

    @Page
    DemoQaSubMenuInteraction demoQaSubMenuInteraction;

    @Step("Descripción abrir la página")
    public void abrirPaginaDemoQa() {
        demoQaGeneralInteractions.open();
    }

    @Step
    public void seleccionarOpcion(OpcionesMenuModel option) {
        demoQaGeneralInteractions.seleccionarTarjeta(option.getOpcion());
        demoQaSubMenuInteraction.seleccionarOpcionElements(option.getSubmenu());
    }





}
