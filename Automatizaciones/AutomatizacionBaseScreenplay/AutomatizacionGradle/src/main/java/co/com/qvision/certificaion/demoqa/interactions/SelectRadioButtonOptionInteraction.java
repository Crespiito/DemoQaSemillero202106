package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.*;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ELEMENTS;


public class SelectRadioButtonOptionInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_ELEMENTS),
                Click.on(TARJETA_ELEMENTS),
                Click.on(BOTON_RADIOBUTTON),
                Scroll.to(OPCION_YES_RADIOBUTTON),
                Click.on(OPCION_YES_RADIOBUTTON),
                Click.on(OPCION_NO_RADIOBUTTON),
                Click.on(OPCION_IMPRESSIVE_RADIOBUTTON)

        );
    }

    public static SelectRadioButtonOptionInteraction seleccionar(){
        return Tasks.instrumented(SelectRadioButtonOptionInteraction.class);
    }
}
