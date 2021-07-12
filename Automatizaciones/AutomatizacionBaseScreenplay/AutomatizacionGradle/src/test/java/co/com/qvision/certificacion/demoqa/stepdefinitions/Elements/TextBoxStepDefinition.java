package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.tasks.Elements.TextBox.LlenarSoloTexto;
import co.com.qvision.certificaion.demoqa.tasks.Elements.SeleccionarOpcionElementsTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class TextBoxStepDefinition {

   //Escenario principal

    @Dado("Yo como usuario este en el formulario desplegado de {}")
    public void yoComoUsuarioEsteEnElFormularioDesplegadoDe(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionElementsTask.seleccionarOpcion());
       // System.out.println("entro al dado ");
    }

    @Cuando("Diligencio cada uno de los campos")
    public void diligencioCadaUnoDeLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarSoloTexto.llenarSoloTexto());
        //System.out.println("entro al cuando");
    }

    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void sevisualizaraElResumenDeLainformacionDiligenciada() {
        System.out.println("entro al entonces");
    }


    @Cuando("Diligencio solo el campo {}")
    public void diligencioSoloElCampo(String string) {
        System.out.println("entro al cuando");
    }



    // Otros escenarios

    @Entonces("Se visualizara el resumen con el nombre")
    public void sevisualizaraElResumenConElNombre() {
        System.out.println("entro al entonces");
    }

    @Entonces("Despliegue el formulario")
    public void despliegueElFormulario() {
        System.out.println("entro al entonces");
    }

    @Entonces("Se visualizara el resumen del {}")
    public void sevisualizaraElResumenDel(String string) {
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
