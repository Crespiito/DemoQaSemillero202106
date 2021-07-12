package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.pages.interactions.DemoQaGeneralInteractions;
import co.com.certificacion.qvision.pages.interactions.DemoQaSubMenuPageInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.MatcherAssert.assertThat;


public class DemoQaGeneralSteps {

    String texto = "texo en variable";

    @Page
    DemoQaGeneralInteractions demoQaGeneralInteractions;

    @Page
    DemoQaSubMenuPageInteraction demoQaSubMenuPageInteraction;

    @Step
    public void abrirPaginaDemoQa(){
        demoQaGeneralInteractions.open();
    }


    @Step("descripcion #texto 2")
    public void validarTitulo(){

        //assertThat("los textos no coinciden ", demoQaGeneralInteractions.ObtenerTituloSeleccionado(),sameBeanAs());

    }

    public void seleccionarOpcion(OpcionesMenuModel opciones) {
        demoQaGeneralInteractions.seleccionarTarjetaElements(opciones.getOpcion());
        demoQaSubMenuPageInteraction.seleccionarOpcionSubMenu(opciones.getSubmenu());
    }
}
