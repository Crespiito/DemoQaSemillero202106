package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certificaion.demoqa.interactions.CamposTextoInteractions.camposTextoInteractions;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarCamposTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                camposTextoInteractions()
        );
    }

    public static DiligenciarCamposTask diligenciarCamposTask(){
        return instrumented(DiligenciarCamposTask.class);
    }
}
