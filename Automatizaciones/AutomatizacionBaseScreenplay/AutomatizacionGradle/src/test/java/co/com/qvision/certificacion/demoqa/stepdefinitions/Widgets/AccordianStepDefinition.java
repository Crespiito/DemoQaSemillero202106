package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class AccordianStepDefinition {


    @Dado("Yo como usuario ingreso a la pestana {string}")
    public void yoComoUsuarioIngresoALaPestana(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Selecciono una de los items listados")
    public void seleccionoUnaDeLosItemsListados() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que se despliegue el texto bajo el item seleccionado, y cualquier otro item se contraiga")
    public void visualiceQueSeDespliegueElTextoBajoElItemSeleccionadoYCualquierOtroItemSeContraiga() {
        System.out.println("entro al entonces");
    }


}
