package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA2;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA_ELEMENTS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_SUB_MENU_FORM;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_SUB_MENU_RADIO_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionesRadioButtonInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_TARJETA_ELEMENTS),
                Click.on(BTN_TARJETA_ELEMENTS),
                Click.on(LBL_LEFT_SUB_MENU_RADIO_BUTTON)
        );
    }

    public static SeleccionarOpcionesRadioButtonInteraction seleccionarOpcionesRadioButtonInteraction(){
        return instrumented(SeleccionarOpcionesRadioButtonInteraction.class);
    }
}
