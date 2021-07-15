package co.com.qvision.certificaion.demoqa.interactions.windows;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.certificaion.demoqa.user_interfaces.windows.AlertsPage.BUTTON;

public class AlertsbuttonInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON)
        );
        }

    public static AlertsbuttonInteraction alertsbuttonInteraction(){
        return Tasks.instrumented(AlertsbuttonInteraction.class);
    }
}
