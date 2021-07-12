package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.RadioButtonInteraction;
import co.com.qvision.certificaion.demoqa.models.RadioButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class RadioButtonTask implements Task {
RadioButtonModel radioButtonModel;

    public RadioButtonTask(RadioButtonModel radioButtonModel) {
        this.radioButtonModel = radioButtonModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(RadioButtonInteraction.radioButtonSelect(radioButtonModel));
    }
    public static RadioButtonTask radioButtonTask(RadioButtonModel radioButtonModel){
        return instrumented(RadioButtonTask.class,radioButtonModel);
    }
}
