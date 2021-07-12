package co.com.qvision.certificaion.demoqa.interactions.alerts;

import co.com.qvision.certificaion.demoqa.models.AlertModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.certificaion.demoqa.user_interfaces.AlertsPage.BTN_ALERT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertInteraction implements Interaction {
    AlertModel alertModel;

    public AlertInteraction(AlertModel alertModel) {
        this.alertModel = alertModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Click.on(BTN_ALERT.of(alertModel.getBoton()))
     );
    }
    public  static AlertInteraction alertInteraction(AlertModel alertModel){
        return instrumented(AlertInteraction.class,alertModel);
    }
}
