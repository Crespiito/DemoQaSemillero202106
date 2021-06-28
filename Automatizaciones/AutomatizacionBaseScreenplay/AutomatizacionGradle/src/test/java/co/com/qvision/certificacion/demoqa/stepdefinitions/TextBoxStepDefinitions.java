package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.qvision.certificaion.demoqa.tasks.DiligenciarFormularioTextBoxTask.llenarFormularioTxtBox;

public class TextBoxStepDefinitions {

    @Cuando("Seleccione Text Box")
    public void seleccioneTextBox() {

    }

    @Entonces("Despliegue el formulario")
    public void despliegueElFormulario() {

    }

    @Dado("Yo como usuario este en el formulario desplegado de Text Box")
    public void yoComoUsuarioEsteEnElFormularioDesplegadoDeTextBox() {

    }

    @Cuando("Diligencio el campo Full Name y Email y CurrentAddress y PermanentAddress")
    public void DiligencioCadaUnoDeLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                llenarFormularioTxtBox()
        );
    }

    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void seVisualizaraElResumenDeLaInformacionDiligenciada() {

    }

    @Cuando("Diligencio solo el campo Full Name")
    public void diligencioSoloElCampoFullName() {

    }

    @Entonces("Se visualizara el resumen con el nombre")
    public void seVisualizaraElResumenConElNombre() {

    }

     @Cuando("Diligencio solo el campo E mail")
    public void diligencioSoloElCampoEMail() {

    }

    @Entonces("Se visualizara el resumen del E mail")
    public void seVisualizaraElResumenDelEMail() {

    }

    @Cuando("Envio el formulario sin diligenciar")
    public void envioElFormularioSinDiligenciar() {

    }

    @Entonces("No se visualizara ningun cambio")
    public void noSeVisualizaraNingunCambio() {

    }


}
