package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA_ELEMENTS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_ELEMENTS_TEXT_BOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarjetaPrincipalElementsInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_TARJETA_ELEMENTS),
                Click.on(BTN_TARJETA_ELEMENTS)
        );
    }

    public static TarjetaPrincipalElementsInteractions tarjetaMenuPrincipalElements(){
        return instrumented(TarjetaPrincipalElementsInteractions.class);
    }


}
