package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.ValidarTextBoxInteraction;
import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class TexBoxTask implements Task {

TextBoxModel textBoxModel;

    public TexBoxTask(TextBoxModel textBoxModel) {
        this.textBoxModel = textBoxModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(ValidarTextBoxInteraction.validarTextBoxInteraction(textBoxModel));
    }
    public  static TexBoxTask texBoxTask(TextBoxModel textBoxModel){

       return instrumented(TexBoxTask.class, textBoxModel);
    }
}
