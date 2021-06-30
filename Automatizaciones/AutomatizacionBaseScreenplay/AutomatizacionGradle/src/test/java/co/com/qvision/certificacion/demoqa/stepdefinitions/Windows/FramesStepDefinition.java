package co.com.qvision.certificacion.demoqa.stepdefinitions.Windows;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class FramesStepDefinition {

    @Dado(": que estoy en el modulo alerts verifico el item Frames")
    public void queEstoyEnElModuloAlertsVerificoElItemFrames() {
        System.out.println("Entro el Dado");
    }

    @Cuando(": verifique y  mueva la barra de iFrame")
    public void verifiqueYMuevaLaBarraDeIFrame() {
        System.out.println("Entro el Cuando");
    }

    @Entonces(": debe mostrar la frase This is a sample page")
    public void debeMostrarLaFraseThisIsASamplePage() {
        System.out.println("Entro el Entonces");
    }
}
