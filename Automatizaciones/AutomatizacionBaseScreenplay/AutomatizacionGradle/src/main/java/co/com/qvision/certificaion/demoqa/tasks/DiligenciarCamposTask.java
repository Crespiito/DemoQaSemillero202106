package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.BotonSubmitInteraction.botonSubmitInteraction;
import static co.com.qvision.certificaion.demoqa.interactions.CampoFechaInteractions.campoFechaInteractions;
import static co.com.qvision.certificaion.demoqa.interactions.CamposBinariosInteractions.camposBinariosInteractions;
import static co.com.qvision.certificaion.demoqa.interactions.CamposListasInteraction.camposListasInteraction;
import static co.com.qvision.certificaion.demoqa.interactions.CamposTextoInteractions.camposTextoInteractions;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarCamposTask implements Task {

    FormDataModel opcion;

    public DiligenciarCamposTask(FormDataModel opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                camposTextoInteractions(opcion),
                camposBinariosInteractions(opcion),
                camposListasInteraction(opcion),
                campoFechaInteractions(opcion),
                botonSubmitInteraction()
        );
    }

    public static DiligenciarCamposTask diligenciarCamposTask(FormDataModel opcion) {
        return instrumented(DiligenciarCamposTask.class,opcion);
    }
}
