package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class TabsStepDefinition {
    @Dado("Yo como usuario ingreso al modulo {string}")
    public void yoComoUsuarioIngresoAlModulo(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Selecciono {string}")
    public void selecciono(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice las pestanas {string} {string} {string} y {string}")
    public void visualiceLasPestanasY(String string, String string2, String string3, String string4) {
        System.out.println("entro al entonces");
    }

    @Cuando("Selecciono la pestana {string}")
    public void seleccionoLaPestana(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice el texto en la pestana")
    public void visualiceElTextoEnLaPestana() {
        System.out.println("entro al entonces");
    }

    @Entonces("No cambie de pestana o Visualice un texto diferente al previamente seleccionado")
    public void noCambieDePestanaOVisualiceUnTextoDiferenteAlPreviamenteSeleccionado() {
        System.out.println("entro al entonces");
    }

}
