package co.com.qvision.certificaion.demoqa.tasks.Elements.RadioButton;

import co.com.qvision.certificaion.demoqa.interactions.Elements.RadioButton.SelectImpRBInteraction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectImpRBTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectImpRBInteraction.selectImp()
        );

    }
    public static SelectImpRBTask selectImp(){
        return Tasks.instrumented(SelectImpRBTask.class);
    }
}

