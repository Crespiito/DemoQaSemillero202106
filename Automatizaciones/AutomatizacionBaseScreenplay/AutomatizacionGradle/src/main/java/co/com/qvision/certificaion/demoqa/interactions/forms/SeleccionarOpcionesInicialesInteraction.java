package co.com.qvision.certificaion.demoqa.interactions.forms;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionesInicialesInteraction implements Interaction {

    String opcion;
    String opcion2;

    public SeleccionarOpcionesInicialesInteraction(String opcion, String opcion2){
        this.opcion = opcion;
        this.opcion2 = opcion2;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(

                   Scroll.to(BTN_FORM.of(opcion)),
                   Click.on(BTN_FORM.of(opcion)),
                   Click.on(BTN_ITEMLATERAL.of(opcion2))
           );

    }

    public static  SeleccionarOpcionesInicialesInteraction menu(String opcion, String opcion2){
        return instrumented(SeleccionarOpcionesInicialesInteraction.class, opcion,opcion2);
    }
}
