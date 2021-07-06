package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;

import io.cucumber.java.es.Cuando;

import io.cucumber.java.es.Entonces;

public class ToolTipsStepDefinition {

    @Cuando("Ubico el boton {string} y pasa el cursor sobre el o lo clickea")
    public void ubicoElBotonYPasaElCursorSobreElOLoClickea(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice el mensaje {string}")
    public void visualiceElMensaje(String string) {
        System.out.println("entro al entonces");
    }

    @Cuando("Ubico el campo {string} y pasa el cursor sobre el, lo clickea, o escribe en el")
    public void ubicoElCampoYPasaElCursorSobreElLoClickeaOEscribeEnEl(String string) {
        System.out.println("entro al cuando");
    }

    @Cuando("Ubico el campo o texto en color azul y pasa el cursor sobre el, lo clickea y se subraya")
    public void ubicoElCampoOTextoEnColorAzulYPasaElCursorSobreElLoClickeaYSeSubraya() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice el mensaje {string} campo o texto")
    public void visualiceElMensajeCampoOTexto(String string) {
        System.out.println("entro al entonces");
    }


}
