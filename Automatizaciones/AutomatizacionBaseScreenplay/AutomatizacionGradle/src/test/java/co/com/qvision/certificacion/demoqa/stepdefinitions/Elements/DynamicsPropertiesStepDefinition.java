package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class DynamicsPropertiesStepDefinition {

    @Dado("que como usuario del item Dynamics properties")
    public void queComoUsuarioDelItemDynamicsProperties() {
        System.out.println("entro al dado ");
    }

    @Entonces("verifico del cambio de estado automatica de los {int} botones")
    public void verificoDelCambioDeEstadoAutomaticaDeLosBotones(Integer int1) {
        System.out.println("entro al entonces");
    }

    @Cuando("selecciono cada boton")
    public void seleccionoCadaBoton() {
        System.out.println("entro al cuando");
    }

}
