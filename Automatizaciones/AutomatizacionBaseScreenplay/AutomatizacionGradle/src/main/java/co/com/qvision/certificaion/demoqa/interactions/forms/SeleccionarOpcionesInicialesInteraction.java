package co.com.qvision.certificaion.demoqa.interactions.forms;


import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionesInicialesInteraction implements Interaction {

  OpcionMenuModel opciones;

    public SeleccionarOpcionesInicialesInteraction(OpcionMenuModel opciones) {
        this.opciones = opciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(

                   Scroll.to(BTN_FORM.of(opciones.getOpcion())),
                   Click.on(BTN_FORM.of(opciones.getOpcion())),
                   Click.on(BTN_ITEMLATERAL.of(opciones.getSubmenu()))
           );

    }

    public static  SeleccionarOpcionesInicialesInteraction menu(OpcionMenuModel opciones){
        return instrumented(SeleccionarOpcionesInicialesInteraction.class, opciones);
    }
}
