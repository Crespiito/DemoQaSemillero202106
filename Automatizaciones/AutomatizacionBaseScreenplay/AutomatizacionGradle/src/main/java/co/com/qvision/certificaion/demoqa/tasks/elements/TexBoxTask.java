package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.ValidarTextBoxInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class TexBoxTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(ValidarTextBoxInteraction.validarTextBoxInteraction());
    }
    public  static TexBoxTask texBoxTask(){

       return instrumented(TexBoxTask.class);
    }
}
