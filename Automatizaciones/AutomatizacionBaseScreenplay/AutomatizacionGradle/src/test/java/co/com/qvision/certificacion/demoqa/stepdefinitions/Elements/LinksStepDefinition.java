package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LinksStepDefinition {

    @Dado("que como usuario me encuentro en la pagina {string}")
    public void queComoUsuarioMeEncuentroEnLaPagina(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("selecciono el link {string}")
    public void seleccionoElLink(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Me \\(lleva) direccionaria a la pagina inicial {string}")
    public void meLlevaDireccionariaALaPaginaInicial(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Me deberia mostrar un mensaje que diga {string}")
    public void meDeberiaMostrarUnMensajeQueDiga(String string) {
        System.out.println("entro al entonces");
    }



}
