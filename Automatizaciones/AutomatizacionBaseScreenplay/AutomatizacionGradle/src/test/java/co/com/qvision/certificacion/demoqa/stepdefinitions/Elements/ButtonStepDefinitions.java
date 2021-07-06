package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class ButtonStepDefinitions {
    @Dado("que como usuario del elemento buttons")
    public void queComoUsuarioDelElementoButtons() {
        System.out.println("Entro al Dado");
    }

    @Cuando("le doy click al boton")
    public void leDoyClickAlBoton() {
        System.out.println("Entro al Cuando");
    }

    @Entonces("verifico un mensaje You have done a dynamic click")
    public void verificoUnMensajeYouHaveDoneADynamicClick() {
        System.out.println("Entro al Entonces");
    }

    @Entonces("verifico un mensaje You have done a right click")
    public void verificoUnMensajeYouHaveDoneARightClick() {
        System.out.println("Entro al Entonces");
    }

    @Cuando("selecciono el boton click me")
    public void seleccionoElBotonClickMe() {
        System.out.println("Entro al Cuando");
    }

    @Entonces("verifico un mensaje You have done a double click")
    public void verificoUnMensajeYouHaveDoneADoubleClick() {
        System.out.println("Entro al Cuando");
    }

}
