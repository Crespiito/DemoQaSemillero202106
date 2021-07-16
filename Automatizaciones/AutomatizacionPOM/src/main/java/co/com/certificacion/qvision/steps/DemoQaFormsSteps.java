package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.pages.interactions.DemoQaFormInteraction;
import co.com.certificacion.qvision.pages.userinterface.DemoQaFormUI;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

public class DemoQaFormsSteps {

    @Page
    DemoQaFormInteraction demoQaForm;

    @Step
    public void diligenciarFormulario(FormDataModel option) {
        demoQaForm.enviarFormulario(option);
    }

    @Step
    public void validarFormulario(FormDataModel option) {
        MatcherAssert.assertThat("Los datos no coinciden",
                demoQaForm.obtenerDatosTabla(), sameBeanAs(option).ignoring("genero")
        );
    }
}
