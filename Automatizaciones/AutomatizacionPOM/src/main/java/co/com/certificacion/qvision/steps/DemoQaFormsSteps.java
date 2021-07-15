package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.pages.interactions.DemoQaFormInteraction;
import co.com.certificacion.qvision.pages.userinterface.DemoQaFormUI;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class DemoQaFormsSteps {

    @Page
    DemoQaFormInteraction demoQaForm;

    @Step
    public void diligenciarFormulario(FormDataModel option) {
        demoQaForm.enviarFormulario(option);
    }

    @Step
    public void validarTitulo() {
       /*
        MatcherAssert.assertThat("El titulo seleccionado coincide",
                demoQaGeneralInteractions.obtenerTituloSeleccionado(), sameBeanAs(titulo)
        );
        */
    }
}
