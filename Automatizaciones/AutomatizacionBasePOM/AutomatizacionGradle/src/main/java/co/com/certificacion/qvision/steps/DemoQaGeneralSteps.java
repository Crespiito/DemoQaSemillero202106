package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.pages.interactions.DemoQaGeneralInteractions;
import co.com.certificacion.qvision.pages.interactions.DemoQaSubMenuPageInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class DemoQaGeneralSteps {


    @Page
    DemoQaGeneralInteractions demoQaGeneralInteractions;

    @Page
    DemoQaSubMenuPageInteraction demoQaSubMenuPageInteraction;

    @Step
    public void abrirPaginaDemoQa(){
        demoQaGeneralInteractions.open();
    }


    public void seleccionarOpcion(OpcionesMenuModel opciones) {
        demoQaGeneralInteractions.seleccionarTarjetaElements(opciones.getOpcion());
        demoQaSubMenuPageInteraction.seleccionarOpcionSubMenu(opciones.getSubmenu());
    }
}
