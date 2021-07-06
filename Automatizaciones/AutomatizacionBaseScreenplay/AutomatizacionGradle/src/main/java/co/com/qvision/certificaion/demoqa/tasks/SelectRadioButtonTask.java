package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.SelectOpcionInicialElementsInteraction;
import co.com.qvision.certificaion.demoqa.interactions.SelectRadioButtonOptionInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SelectRadioButtonTask implements Interaction {
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
