package co.com.qvision.certificaion.demoqa.interactions.Elements.RadioButton;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.OPCION_NO_RADIOBUTTON;

public class SelectNoRBInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(OPCION_NO_RADIOBUTTON),
                Click.on(OPCION_NO_RADIOBUTTON)
        );

    }

    public static SelectNoRBInteraction selectNo(){
        return Tasks.instrumented(SelectNoRBInteraction.class);
    }
}
