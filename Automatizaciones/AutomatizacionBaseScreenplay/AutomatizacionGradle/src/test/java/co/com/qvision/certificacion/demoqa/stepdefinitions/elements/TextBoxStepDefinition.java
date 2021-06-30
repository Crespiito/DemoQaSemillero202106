package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.TexBoxTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class TextBoxStepDefinition {
    @Dado("Yo como usuario que ingreso al modulo {} en el item {}")
    public void yoComoUsuarioQueIngresoAlModuloElementsEnElItemTextBox(String opcion,String opcion2) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(opcion,opcion2));
    }

    @Cuando("lleno los Text Box")
    public void llenoLosTextBox() {
       OnStage.theActorInTheSpotlight().attemptsTo(TexBoxTask.texBoxTask());
    }


    @Entonces("valido que guarde los datos")
    public void validoQueGuardeLosDatos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
