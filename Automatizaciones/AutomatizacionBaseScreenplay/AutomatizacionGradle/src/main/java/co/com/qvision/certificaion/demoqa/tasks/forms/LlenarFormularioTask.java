package co.com.qvision.certificaion.demoqa.tasks.forms;

import co.com.qvision.certificaion.demoqa.interactions.forms.CamposTextoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LlenarFormularioTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(CamposTextoInteraction.llenarFormularioInteraction());

    }
    public static LlenarFormularioTask llenarFormularioTask(){

        return instrumented(LlenarFormularioTask.class);
    }
}
