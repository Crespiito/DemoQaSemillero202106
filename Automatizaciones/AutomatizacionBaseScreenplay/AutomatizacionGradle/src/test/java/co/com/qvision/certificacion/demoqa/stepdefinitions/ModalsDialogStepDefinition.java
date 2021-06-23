package co.com.qvision.certificacion.demoqa.stepdefinitions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
public class ModalsDialogStepDefinition {

    @Dado("que como usuario del modulo Alerts frame  windows")
    public void queComoUsuarioDelModuloAlertsFrameWindows() {
        System.out.println("Por aca entró el dado");
    }

    @Cuando("selecciono cada boton")
    public void seleccionoCadaBoton() {
        System.out.println("Por aca entró el cuando");
    }

    @Entonces("verifico los mensajes en los alerts")
    public void verificoLosMensajesEnLosAlerts() {
        System.out.println("Por aca entró el entonces ");
    }
}
