package co.com.qvision.certificaion.demoqa.interactions.Elements.RadioButton;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.OPCION_YES_RADIOBUTTON;

public class SelectYesRBInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(OPCION_YES_RADIOBUTTON),
                Click.on(OPCION_YES_RADIOBUTTON)
        );
    }

    public static SelectYesRBInteraction selectYes(){
        return Tasks.instrumented(SelectYesRBInteraction.class);
    }
}
