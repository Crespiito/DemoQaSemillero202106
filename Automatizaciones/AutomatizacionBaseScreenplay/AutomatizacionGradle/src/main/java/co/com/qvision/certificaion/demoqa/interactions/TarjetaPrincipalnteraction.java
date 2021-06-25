package co.com.qvision.certificaion.demoqa.interactions;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.TARJETA_FORM;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarjetaPrincipalnteraction implements Interaction {
    OpcionesMenuModel opciones;


    public TarjetaPrincipalnteraction(OpcionesMenuModel opciones) {
        this.opciones = opciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Scroll.to(TARJETA_FORM.of(opciones.getOpcion())),
               Click.on(TARJETA_FORM.of(opciones.getOpcion())),
               Click.on(LBL_LATERAL.of(opciones.getSubmenu()))
       );
    }

    public static TarjetaPrincipalnteraction seleccion(OpcionesMenuModel opciones){
        return instrumented(TarjetaPrincipalnteraction.class,opciones);
    }
}
