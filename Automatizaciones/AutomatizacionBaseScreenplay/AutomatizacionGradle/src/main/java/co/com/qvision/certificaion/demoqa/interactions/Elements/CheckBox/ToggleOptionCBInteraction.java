package co.com.qvision.certificaion.demoqa.interactions.Elements.CheckBox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.*;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ELEMENTS;

public class ToggleOptionCBInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_ELEMENTS),
                Click.on(TARJETA_ELEMENTS),
                Scroll.to(BOTON_CHECKBOX),
                Click.on(BOTON_CHECKBOX),

                Scroll.to(DESPLEGAR_HOME),
                Click.on(DESPLEGAR_HOME),

                Scroll.to(DESPLEGAR_DESKTOP),
                Click.on(DESPLEGAR_DESKTOP),

                Scroll.to(DESPLEGAR_DOCUMENTS),
                Click.on(DESPLEGAR_DOCUMENTS),

                Scroll.to(DESPLEGAR_WORKSPACE),
                Click.on(DESPLEGAR_WORKSPACE),

                Scroll.to(DESPLEGAR_OFFICE),
                Click.on(DESPLEGAR_OFFICE),

                Scroll.to(DESPLEGAR_DOWNLOADS),
                Click.on(DESPLEGAR_DOWNLOADS)



        );
    }

    public static ToggleOptionCBInteraction toggleCBInteraction(){
        return Tasks.instrumented(ToggleOptionCBInteraction.class);
    }
}
