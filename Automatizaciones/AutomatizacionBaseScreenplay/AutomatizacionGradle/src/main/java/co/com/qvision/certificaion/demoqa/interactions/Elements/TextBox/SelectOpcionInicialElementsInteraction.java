package co.com.qvision.certificaion.demoqa.interactions.Elements.TextBox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.BOTON_TEXTBOX;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ELEMENTS;

public class SelectOpcionInicialElementsInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_ELEMENTS),
                Click.on(TARJETA_ELEMENTS),
                Scroll.to(BOTON_TEXTBOX),
                Click.on(BOTON_TEXTBOX)

        );
    }

    public static SelectOpcionInicialElementsInteraction seleccionar(){
        return Tasks.instrumented(SelectOpcionInicialElementsInteraction.class);
    }
}
