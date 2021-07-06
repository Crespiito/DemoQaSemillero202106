package co.com.qvision.certificaion.demoqa.interactions.forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.TARJETA_FORM;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.BTN_FORM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarjetaPrincipalInteraction implements Interaction {

    public TarjetaPrincipalInteraction(String opcion) {
        this.opcion = opcion;
    }

    String opcion;

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Scroll.to(TARJETA_FORM.of(opcion)),
            Click.on(BTN_FORM.of(opcion))

    );
    }

    public static TarjetaPrincipalInteraction seleccion(String opcion){
        return instrumented(TarjetaPrincipalInteraction.class,opcion);
    }


}
