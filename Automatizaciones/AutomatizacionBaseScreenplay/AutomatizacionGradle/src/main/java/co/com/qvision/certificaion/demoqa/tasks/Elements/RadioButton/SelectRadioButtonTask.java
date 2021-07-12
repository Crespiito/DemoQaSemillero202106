package co.com.qvision.certificaion.demoqa.tasks.Elements.RadioButton;

import co.com.qvision.certificaion.demoqa.interactions.Elements.RadioButton.SelectRadioButtonOptionInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectRadioButtonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectRadioButtonOptionInteraction.seleccionar()

        );
    }

    public static SelectRadioButtonTask seleccionar(){
        return Tasks.instrumented(SelectRadioButtonTask.class);
    }
}
