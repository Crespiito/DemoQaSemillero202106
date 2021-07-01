package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.CampoRadioButtonInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class RadioButtonTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CampoRadioButtonInteraction.campoRadioButtonInteraction());
    }

    public static RadioButtonTask radioButtonTask(){
        return Tasks.instrumented(RadioButtonTask.class);
    }
}
