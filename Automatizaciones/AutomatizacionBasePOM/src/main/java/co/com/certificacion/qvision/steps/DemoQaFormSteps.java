package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.models.FormData;
import co.com.certificacion.qvision.pages.interactions.DemoQaFormInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.MatcherAssert.assertThat;

public class DemoQaFormSteps {


    @Page
    DemoQaFormInteraction demoQaFormInteraction;

    @Step
    public void enviarFormularioBase(FormData datos){
        demoQaFormInteraction.enviarFormularioBase(datos);
    }

    @Step
    public void validarEnvio(FormData datos){
        assertThat("los datos no coinciden ", demoQaFormInteraction.obtenerDatosTabla(),sameBeanAs(datos).ignoring("genero"));

    }
}