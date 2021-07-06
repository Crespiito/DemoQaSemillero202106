package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.BTN_SUBMIT_FORM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonSubmitInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_SUBMIT_FORM),
                Click.on(BTN_SUBMIT_FORM)
        );
    }

    public static BotonSubmitInteraction botonSubmitInteraction(){
        return instrumented(BotonSubmitInteraction.class);
    }
}
