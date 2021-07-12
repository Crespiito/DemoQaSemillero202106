package co.com.qvision.certificaion.demoqa.tasks.Elements.RadioButton;

import co.com.qvision.certificaion.demoqa.interactions.Elements.RadioButton.SelectTarjetaRBInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectOpElementsRBTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectTarjetaRBInteraction.seleccionar());
    }

    public static SelectOpElementsRBTask seleccionarOpcion(){
        return Tasks.instrumented(SelectOpElementsRBTask.class);
    }
}
