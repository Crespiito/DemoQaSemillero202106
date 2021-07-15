package co.com.certification.qvision.steps;

import co.com.certification.qvision.models.FormData;
import co.com.certification.qvision.pages.interactions.PracticeFormInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.MatcherAssert.assertThat;

public class PracticeFormStep {

    @Page
    PracticeFormInteraction practiceFormInteraction;

    @Step
    public void llenaCampos(FormData formData){
        practiceFormInteraction.llenarCampos(formData);
    }

    @Step
    public void validarEnvio(FormData data){
        assertThat("datos coinciden ",practiceFormInteraction.obtenerDatosTabla(),sameBeanAs(data));
    }
}
