package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.BTN_RADIO_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickGenericoInteraction implements Interaction {

    String boton;

    public ClickGenericoInteraction(String boton) {
        this.boton = boton;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_RADIO_BUTTON.of(boton))
        );
    }

    public static ClickGenericoInteraction clickGenericoInteraction(String boton){
        return instrumented(ClickGenericoInteraction.class,boton);
    }
}
