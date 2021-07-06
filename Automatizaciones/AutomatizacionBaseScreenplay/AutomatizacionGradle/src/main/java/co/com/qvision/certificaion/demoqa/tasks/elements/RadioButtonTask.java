package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.RadioButtonInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class RadioButtonTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(RadioButtonInteraction.radioButtonSelect());
    }
    public static RadioButtonTask radioButtonTask(){
        return instrumented(RadioButtonTask.class);
    }
}
