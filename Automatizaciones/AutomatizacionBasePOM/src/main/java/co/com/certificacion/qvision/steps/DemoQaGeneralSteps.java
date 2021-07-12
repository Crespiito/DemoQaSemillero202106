package co.com.certificacion.qvision.steps;


import co.com.certificacion.qvision.pages.interactions.DemoQaGeneralInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class DemoQaGeneralSteps  {

    //se agregan todos los mapeos pero sin usar target

    String texto = "Texto en Variable";
    @Page
    DemoQaGeneralInteraction demoQaGeneralInteraction;

    @Step
    public void abrirPaginaDemoQa(){
        demoQaGeneralInteraction.open();
    }

    @Step("Descripcion 1")
    public void selectTarjetaForms() {
        demoQaGeneralInteraction.selectTarjetaForms();
    }

    @Step("Descripcion 2")
    public void validarTituloTarjeta(){

        //comparacion directa
        MatcherAssert.assertThat(
                "El titulo no coincide con el seleccionado",
                demoQaGeneralInteraction.
                        ObtenerTituloSeleccionado().contains("Forms"));


       /*
     Titulo titulo = new Titulo("Forms");
      assertThat("Los textos no coinciden ",demoQaGeneralInteraction.ObtenerTituloSeleccionado(),sameBeanAs(titulo));
*/
    }

}
