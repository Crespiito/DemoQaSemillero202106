package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarTextBoxInteractions implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("Juan").into(TXT_FULL_NAME),
                Enter.keyValues("Juan@mail.com").into(TXT_EMAIL),
                Enter.keyValues("Calle 2 #2-1").into(TXT_CURRENT_ADDRESS),
                Enter.keyValues("Carrera 1 #23-12").into(TXT_PERMANENT_ADDRESS)
        );
    }

    public static LlenarTextBoxInteractions llenarTextBox() {

        return instrumented(LlenarTextBoxInteractions.class);
    }
}
