package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.CamposTextBoxInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarOpcionTextTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CamposTextBoxInteraction.camposTextBoxInteraction());

    }

    public static SeleccionarOpcionTextTask seleccionarOpcionTextTask(){

        return Tasks.instrumented(SeleccionarOpcionTextTask.class);
    }
}
