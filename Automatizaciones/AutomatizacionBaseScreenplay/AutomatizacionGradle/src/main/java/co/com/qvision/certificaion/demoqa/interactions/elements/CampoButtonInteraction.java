package co.com.qvision.certificaion.demoqa.interactions.elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.DoubleClick;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.ButtonPage.DOUBLE_BUTTON;

public class CampoButtonInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DoubleClick.on(DOUBLE_BUTTON)
        );
    }
    public static CampoButtonInteraction campoButtonInteraction(){
        return Tasks.instrumented(CampoButtonInteraction.class);
    }
}
