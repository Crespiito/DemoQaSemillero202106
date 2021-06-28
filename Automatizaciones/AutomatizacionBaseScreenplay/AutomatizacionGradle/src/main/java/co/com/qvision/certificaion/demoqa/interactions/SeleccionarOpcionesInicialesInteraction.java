package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA2;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_SUB_MENU_FORM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionesInicialesInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_TARJETA2),
                Click.on(BTN_TARJETA2),
                Click.on(LBL_LEFT_SUB_MENU_FORM)
        );
    }

    public static SeleccionarOpcionesInicialesInteraction seleccionarOpcionesInicialesInteraction(){
        return instrumented(SeleccionarOpcionesInicialesInteraction.class);
    }
}
