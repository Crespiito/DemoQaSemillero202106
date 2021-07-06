package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.SeleccionarOpcionTextTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


public class TexBoxStepDefinition {
    @Dado("Yo como usuario en el modulo {} en el formulario desplegado de {}")
    public void yoComoUsuarioEnElModuloElementsEnElFormularioDesplegadoDeTextBox() {
       //OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opcion, opcion2));

    }

    @Cuando("Diligencio cada uno de los campos")
    public void diligencioCadaUnoDeLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTextTask.seleccionarOpcionTextTask());
    }


    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void seVisualizaraElResumenDeLaInformacionDiligenciada() {
        System.out.println("ingreso Dado");
    }

}
