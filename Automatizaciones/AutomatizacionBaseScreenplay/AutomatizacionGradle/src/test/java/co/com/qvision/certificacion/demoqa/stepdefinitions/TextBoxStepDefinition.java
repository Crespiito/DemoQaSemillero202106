package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class TextBoxStepDefinition {

    @Dado("Yo como usuario este en el formulario desplegado de {string}")
    public void yoComoUsuarioEsteEnElFormularioDesplegadoDe(String string) {
            System.out.println("entro al dado ");
    }

    @Cuando("Seleccione {string}")
    public void seleccione(String string) {
        System.out.println("entro al cuando ");
    }
    @Entonces("Despliegue el formulario")
    public void despliegueElFormulario() {
        System.out.println("entro al entonces ");
    }
}
