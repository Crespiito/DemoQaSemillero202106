package co.com.qvision.certificacion.demoqa.stepdefinitions.AlertsFrameWindows;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class FramesStepDefinition {

    @Dado("que estoy en el modulo alerts verifico el item Frames")
    public void queEstoyEnElModuloAlertsVerificoElItemFrames() {
        System.out.println("entro al dado ");
    }

    @Cuando("verifique y  mueva la barra de iFrame")
    public void verifiqueYMuevaLaBarraDeIFrame() {
        System.out.println("entro al cuando");
    }

    @Entonces("deberia mostrar la frase {string}")
    public void deberiaMostrarLaFrase(String string) {
        System.out.println("entro al entonces");
    }

}
