package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;


import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.BTN_RADIO_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MouseInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        );
    }

    public static MouseInteraction mouseInteraction() {
        return instrumented(MouseInteraction.class);
    }
}
