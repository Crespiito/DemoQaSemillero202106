package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.BTN_RADIO_BUTTON;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.CAMPO_POR_ID;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicPorIdInteraction implements Interaction {

    String boton;

    public ClicPorIdInteraction(String boton) {
        this.boton = boton;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_POR_ID.of(boton))
        );
    }

    public static ClicPorIdInteraction clicPorId(String boton){
        return instrumented(ClicPorIdInteraction.class, boton);
    }
}
