package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_ELEMENTS_TEXT_BOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElementsTextBoxInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LBL_LEFT_ELEMENTS_TEXT_BOX),
                Click.on(LBL_LEFT_ELEMENTS_TEXT_BOX)
        );
    }

    public static ElementsTextBoxInteractions seleccionarTextBox(){
        return instrumented(ElementsTextBoxInteractions.class);
    }
}
