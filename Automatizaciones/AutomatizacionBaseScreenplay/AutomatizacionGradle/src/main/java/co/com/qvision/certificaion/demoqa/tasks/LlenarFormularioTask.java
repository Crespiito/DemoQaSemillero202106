package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.CamposTextInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormularioTask implements Task {
    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(CamposTextInteraction.camposTextInteraction());
    }

    public static LlenarFormularioTask llenarFormularioTask(){
    return Tasks.instrumented(LlenarFormularioTask.class);
    }
}
