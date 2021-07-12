package co.com.qvision.certificaion.demoqa.tasks.Elements.RadioButton;

import co.com.qvision.certificaion.demoqa.interactions.Elements.RadioButton.SelectYesRBInteraction;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectYesRBTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectYesRBInteraction.selectYes()
        );

    }
    public static SelectYesRBTask seleccionarYes(){
        return Tasks.instrumented(SelectYesRBTask.class);
    }
}
