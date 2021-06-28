package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class TextBoxStepDefinition {

    @Entonces("Despliegue el formulario")
    public void despliegueElFormulario() {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario este en el formulario desplegado de {string}")
    public void yoComoUsuarioEsteEnElFormularioDesplegadoDe(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Diligencio cada uno de los campos")
    public void diligencioCadaUnoDeLosCampos() {
        System.out.println("entro al cuando");
    }

    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void sevisualizaraElResumenDeLainformacionDiligenciada() {
        System.out.println("entro al entonces");
    }

    @Cuando("Diligencio solo el campo {string}")
    public void diligencioSoloElCampo(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Se visualizara el resumen con el nombre")
    public void sevisualizaraElResumenConElNombre() {
        System.out.println("entro al entonces");
    }


    @Entonces("Se visualizara el resumen del E mail")
    public void sevisualizaraElResumenDelEMail() {
        System.out.println("entro al entonces");
    }

    @Cuando("Envio el formulario sin diligenciar")
    public void EnvioElFormularioSinDiligenciar() {
        System.out.println("entro al cuando");
    }

    @Entonces("No se visualizara ningun cambio")
    public void noSevisualizaraNingunCambio() {
        System.out.println("entro al entonces");
    }

}
