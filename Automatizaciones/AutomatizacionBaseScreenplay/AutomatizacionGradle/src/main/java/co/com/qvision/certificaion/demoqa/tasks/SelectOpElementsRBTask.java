package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.SelectOpElementsRBInteraction;
import co.com.qvision.certificaion.demoqa.interactions.SelectOpcionInicialElementsInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SelectOpElementsRBTask implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectOpElementsRBInteraction.seleccionar());
    }

    public static SelectOpElementsRBTask seleccionarOpcion(){
        return Tasks.instrumented(SelectOpElementsRBTask.class);
    }
}
