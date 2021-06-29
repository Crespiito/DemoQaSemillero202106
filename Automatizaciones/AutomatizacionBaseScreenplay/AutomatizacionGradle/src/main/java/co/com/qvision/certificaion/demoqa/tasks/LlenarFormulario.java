package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.CamposTextoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LlenarFormulario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CamposTextoInteraction.camposTextoInteraction());

    }

    public static LlenarFormulario llenarFormulario(){
        return Tasks.instrumented(LlenarFormulario.class);
    }
}
