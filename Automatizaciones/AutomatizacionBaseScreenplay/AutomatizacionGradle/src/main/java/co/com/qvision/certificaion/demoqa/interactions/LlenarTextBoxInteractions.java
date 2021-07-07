package co.com.qvision.certificaion.demoqa.interactions;

import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarTextBoxInteractions implements Interaction {

    TextBoxModel option;

    public LlenarTextBoxInteractions(TextBoxModel option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(option.getName()).into(TXT_FULL_NAME),
                Enter.keyValues(option.getMail()).into(TXT_EMAIL),
                Enter.keyValues(option.getCuAdd()).into(TXT_CURRENT_ADDRESS),
                Enter.keyValues(option.getPeAdd()).into(TXT_PERMANENT_ADDRESS)
        );
    }

    public static LlenarTextBoxInteractions llenarTextBox(TextBoxModel option) {

        return instrumented(LlenarTextBoxInteractions.class,option);
    }
}
