package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.BTN_LATERAL;

public class SeleccionarOpcionesInicialesInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_TARJETA),
                Click.on(BTN_TARJETA),
                Click.on(BTN_LATERAL)
        );
    }

    public static SeleccionarOpcionesInicialesInteraction seleccionar(){
        return Tasks.instrumented(SeleccionarOpcionesInicialesInteraction.class);
    }



}
