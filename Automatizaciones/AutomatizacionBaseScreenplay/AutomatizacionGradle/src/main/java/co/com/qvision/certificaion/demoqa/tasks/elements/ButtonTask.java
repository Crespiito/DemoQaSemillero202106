package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.ButtonInteraction;
import co.com.qvision.certificaion.demoqa.models.ButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ButtonTask implements Task {
ButtonModel buttonModel;

    public ButtonTask(ButtonModel buttonModel) {
        this.buttonModel = buttonModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(ButtonInteraction.buttonInteraction(buttonModel));
    }
    public  static ButtonTask buttonTask(ButtonModel buttonModel){
        return instrumented(ButtonTask.class,buttonModel);
    }
}
