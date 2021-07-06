package co.com.qvision.certificacion.demoqa.stepdefinitions.AlertsFrameWindows;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class BrowserWindowsStepDefinition {

    @Entonces("Visualice {string}, {string} y {string}")
    public void visualiceY(String string, String string2, String string3) {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario este en Browser Windows")
    public void yoComoUsuarioEsteEnBrowserWindows() {
        System.out.println("entro al dado ");
    }

    @Cuando("selecciono New Tab")
    public void seleccionoNewTab() {
        System.out.println("entro al cuando");
    }

    @Entonces("Se despliega una nueva pestana en el Navegador")
    public void seDespliegaUnaNuevaPestanaEnElNavegador() {
        System.out.println("entro al entonces");
    }

    @Cuando("selecciono New Window")
    public void seleccionoNewWindow() {
        System.out.println("entro al cuando");
    }

    @Entonces("Se despliega una nueva ventana en el Navegador")
    public void seDespliegaUnaNuevaVentanaEnElNavegador() {
        System.out.println("entro al entonces");
    }

    @Cuando("selecciono New Window Message")
    public void seleccionoNewWindowMessage() {
        System.out.println("entro al cuando");
    }

    @Entonces("Se despliega una nueva ventana con el mensaje {string}")
    public void seDespliegaUnaNuevaVentanaConElMensaje(String string) {
        System.out.println("entro al entonces");
    }
}
