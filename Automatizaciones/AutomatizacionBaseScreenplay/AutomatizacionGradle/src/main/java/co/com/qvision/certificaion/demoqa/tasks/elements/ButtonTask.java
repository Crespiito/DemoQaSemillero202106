package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.CampoButtonInteraction;
import co.com.qvision.certificaion.demoqa.models.ButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;

public class ButtonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CampoButtonInteraction.campoButtonInteraction());

    }

    public static ButtonTask buttonTask(ButtonModel datosB){
        return Tasks.instrumented(ButtonTask.class);
    }
}
