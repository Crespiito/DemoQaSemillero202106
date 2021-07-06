package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA2;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_SUB_MENU;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_SUB_MENU_FORM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionesInicialesInteraction implements Interaction {

    String tarjeta;
    String subMenu;

    public SeleccionarOpcionesInicialesInteraction(String tarjeta, String subMenu) {
        this.tarjeta = tarjeta;
        this.subMenu = subMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_TARJETA.of(tarjeta)),
                Click.on(BTN_TARJETA.of(tarjeta)),
                Scroll.to(LBL_LEFT_SUB_MENU.of(subMenu)),
                Click.on(LBL_LEFT_SUB_MENU.of(subMenu))
        );
    }

    public static SeleccionarOpcionesInicialesInteraction seleccionarOpcionesInicialesInteraction(String tarjeta, String subMenu){
        return instrumented(SeleccionarOpcionesInicialesInteraction.class,tarjeta,subMenu);
    }
}
