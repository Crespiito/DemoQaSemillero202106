package co.com.qvision.certificaion.demoqa.tasks.Elements.RadioButton;

import co.com.qvision.certificaion.demoqa.interactions.Elements.RadioButton.SelectNoRBInteraction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectNoRBTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectNoRBInteraction.selectNo()
        );

    }
    public static SelectNoRBTask selectNo(){
        return Tasks.instrumented(SelectNoRBTask.class);
    }
}
