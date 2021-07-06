package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarjetaPrincipalInteractions implements Interaction {

    String opcion;

    public TarjetaPrincipalInteractions(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_TARJETA.of(opcion)),
                Click.on(BTN_TARJETA.of(opcion))
        );
    }

    public static TarjetaPrincipalInteractions tarjetaMenuPrincipal(String opcion){
        return instrumented(TarjetaPrincipalInteractions.class,opcion);
    }


}
