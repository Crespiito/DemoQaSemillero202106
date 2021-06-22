package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LinkStepDefinition {

    @Dado(": que como usuario me encuentro en la pagina Links")
    public void queComoUsuarioMeEncuentroEnLaPaginaLinks() {
        System.out.println("entra el Dado");
    }

    @Cuando(": selecciono el link Home")
    public void seleccionoElLinkHome() {
        System.out.println("entra el Cuando");
    }

    @Entonces(": Me direcciona a la pagina inicial demoqa.com")
    public void meDireccionaALaPaginaInicialDemoqaCom() {
        System.out.println("entra el Entonces");
    }
}
