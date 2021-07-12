package co.com.qvision.certificaion.demoqa.tasks.Elements.CheckBox;

import co.com.qvision.certificaion.demoqa.interactions.Elements.CheckBox.ToggleOptionCBInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectToggleCBTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ToggleOptionCBInteraction.toggleCBInteraction()
        );
    }

    public static SelectToggleCBTask selectToggleCBTask(){
        return Tasks.instrumented(SelectToggleCBTask.class);
    }
}
