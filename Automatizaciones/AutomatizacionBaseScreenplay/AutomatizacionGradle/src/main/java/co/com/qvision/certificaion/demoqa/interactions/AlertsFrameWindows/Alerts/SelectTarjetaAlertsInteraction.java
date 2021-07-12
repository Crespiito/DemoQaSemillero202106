package co.com.qvision.certificaion.demoqa.interactions.AlertsFrameWindows.Alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.Alerts.AlertsFrameWindowsUI.BOTON_ALERTS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_AlERTS;


public class SelectTarjetaAlertsInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_AlERTS),
                Click.on(TARJETA_AlERTS)
              //  Scroll.to(BOTON_ALERTS),
              //  Click.on(BOTON_ALERTS)
        );
    }

    public static SelectTarjetaAlertsInteraction selectTarjeta(){
        return Tasks.instrumented(SelectTarjetaAlertsInteraction.class);
    }
}
