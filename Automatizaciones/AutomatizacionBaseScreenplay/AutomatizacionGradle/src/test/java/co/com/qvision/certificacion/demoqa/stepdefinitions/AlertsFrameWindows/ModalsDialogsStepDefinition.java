package co.com.qvision.certificacion.demoqa.stepdefinitions.AlertsFrameWindows;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ModalsDialogsStepDefinition {

    @Dado("que como usuario del modulo Alerts, frame y windows")
    public void queComoUsuarioDelModuloAlertsFrameYWindows() {
        System.out.println("entro al dado ");
    }

    @Entonces("verifico los mensajes en los alerts")
    public void verificoLosMensajesEnLosAlerts() {
        System.out.println("entro al entonces");
    }
}
