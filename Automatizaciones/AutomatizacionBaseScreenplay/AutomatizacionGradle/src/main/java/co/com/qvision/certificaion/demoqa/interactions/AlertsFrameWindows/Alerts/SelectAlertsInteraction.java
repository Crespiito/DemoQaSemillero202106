package co.com.qvision.certificaion.demoqa.interactions.AlertsFrameWindows.Alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.Alerts.AlertUI.*;


public class SelectAlertsInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_CLICKME),
                Click.on(BOTON_CLICKME),

                Scroll.to(BOTON_CLICKME_5),
                Click.on(BOTON_CLICKME_5),

                Scroll.to(BOTON_CLICKME_CONFIRM),
                Click.on(BOTON_CLICKME_CONFIRM),

                Scroll.to(BOTON_CLICKME_TEXTO),
                Click.on(BOTON_CLICKME_TEXTO)

        );
    }
    public static SelectAlertsInteraction selectAlertsInteraction(){
        return Tasks.instrumented(SelectAlertsInteraction.class);
    }
}
