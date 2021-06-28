package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.TARJETA_FORM;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarjetaPrincipalInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Scroll.to(TARJETA_FORM),
            Click.on(TARJETA_FORM),
            Click.on(LBL_LATERAL)

    );
    }

    public static TarjetaPrincipalInteraction seleccion(){
        return instrumented(TarjetaPrincipalInteraction.class);
    }


}
