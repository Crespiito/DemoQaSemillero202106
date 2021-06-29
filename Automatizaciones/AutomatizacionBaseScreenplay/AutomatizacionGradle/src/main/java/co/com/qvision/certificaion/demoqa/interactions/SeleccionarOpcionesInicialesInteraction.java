package co.com.qvision.certificaion.demoqa.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionesInicialesInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(
                   Scroll.to(BTN_FORM),
                   Click.on(BTN_FORM),
                   Click.on(BTN_LATERAL)
           );

    }

    public static  SeleccionarOpcionesInicialesInteraction seleccionar(){
        return instrumented(SeleccionarOpcionesInicialesInteraction.class);
    }
}
