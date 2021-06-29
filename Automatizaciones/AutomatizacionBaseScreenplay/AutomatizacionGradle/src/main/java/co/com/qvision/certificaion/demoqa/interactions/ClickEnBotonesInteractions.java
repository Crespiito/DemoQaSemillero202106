package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Scanner;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.BTN_SUBMIT_ELEMENTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickEnBotonesInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_SUBMIT_ELEMENTS),
                Click.on(BTN_SUBMIT_ELEMENTS)
        );

    }

    public static ClickEnBotonesInteractions clickEnBotonesInteractions(){
        return instrumented(ClickEnBotonesInteractions.class);
    }
}
