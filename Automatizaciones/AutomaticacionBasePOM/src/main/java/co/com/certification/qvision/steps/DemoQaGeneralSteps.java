package co.com.certification.qvision.steps;

import co.com.certification.qvision.models.OpcionMenuModel;
import co.com.certification.qvision.pages.interactions.DemoQaMenuInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.MatcherAssert.assertThat;


public class DemoQaGeneralSteps {

    @Page
    DemoQaMenuInteraction demoQaMenuInteraction;


    @Step
    public void abrirPaginaDemoQa(){
        demoQaMenuInteraction.open();
    }

    @Step
    public void seleccionarOpcion(OpcionMenuModel opciones){
        demoQaMenuInteraction.seleccionarTarjeta(opciones.getOpcion());

    }

    @Step
    public void seleccionarSubMenu(OpcionMenuModel opciones){
        demoQaMenuInteraction.seleccionarOpcionSubMenu(opciones.getSubmenu());
    }

}
