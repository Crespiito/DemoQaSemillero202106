package co.com.qvision.certificaion.demoqa.tasks.Elements.CheckBox;

import co.com.qvision.certificaion.demoqa.interactions.Elements.CheckBox.CheckOptionCBInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectCheckBoxCBTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CheckOptionCBInteraction.checkCBInteraction()
        );
    }

    public static SelectCheckBoxCBTask selectCheckBoxCBTask(){
        return Tasks.instrumented(SelectCheckBoxCBTask.class);
    }
}
