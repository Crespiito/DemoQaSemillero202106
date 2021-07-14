package co.com.certificacion.qvision.steps;


import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.pages.interactions.DemoQaGeneralInteraction;
import co.com.certificacion.qvision.pages.interactions.DemoQaSubMenuPageInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.MatcherAssert.assertThat;

public class DemoQaGeneralSteps {

    //se agregan todos los mapeos pero sin usar target

    //String texto = "Texto en Variable";

    @Page
    DemoQaGeneralInteraction demoQaGeneralInteraction;

    @Page
    DemoQaSubMenuPageInteraction demoQaSubMenuPageInteraction;

    @Step
    public void abrirPaginaDemoQa() {
        demoQaGeneralInteraction.open();
    }

/*
    @Step("Descripcion #texto 2")
    public void validarTituloTarjeta() {
      //  demoQaGeneralInteraction.seleccionarTarjetaForms();
       // MatcherAssert.assertThat("los textos no coinciden ", demoQaGeneralInteraction.ObtenerTituloSeleccionado(), sameBeanAs());
      /*  //comparacion directa
        MatcherAssert.assertThat(
                "El titulo no coincide con el seleccionado",
                demoQaGeneralInteraction.
                        ObtenerTituloSeleccionado().contains("Forms"));
                        }
    */


        //Titulo titulo = new Titulo("Forms");
        // assertThat("Los textos no coinciden ",demoQaGeneralInteraction.ObtenerTituloSeleccionado(),sameBeanAs(titulo));



    public void seleccionarOpcion(OpcionesMenuModel opciones) {
        demoQaGeneralInteraction.seleccionarTarjetaForms(opciones.getOpcion());
        demoQaSubMenuPageInteraction.seleccionarOpcionSubMenu(opciones.getSubmenu());
    }
}


