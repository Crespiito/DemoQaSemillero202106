package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ButtonsStepDefinition {

    @Dado("que deseo probar el boton click me")
    public void queDeseoProbarElBotonClickMe() {
        System.out.println("entro al dado ");
    }

    @Cuando("le doy click al boton")
    public void leDoyClickAlBoton() {
        System.out.println("entro al cuando");
    }
    @Entonces("me deberia mostrar un mensaje {string}")
    public void meDeberiaMostrarUnMensaje(String string) {
        System.out.println("entro al entonces");
    }

    @Dado("que deseo probar el boton {string}")
    public void queDeseoProbarElBoton(String string) {
        System.out.println("entro al dado ");
    }

}
