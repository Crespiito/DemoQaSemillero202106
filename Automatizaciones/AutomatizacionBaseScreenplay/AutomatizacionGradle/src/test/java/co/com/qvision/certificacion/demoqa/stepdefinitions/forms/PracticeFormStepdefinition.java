package co.com.qvision.certificacion.demoqa.stepdefinitions.forms;

import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class PracticeFormStepdefinition {

    @Dado("Yo como usuario que ingreso al modulo {} en el item {}")
    public void yoComoUsuarioQueIngresoAlModuloElementsEnElItemTextBox(String opcion,String opcion2) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(opcion,opcion2));
    }

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioTask.llenarFormularioTask());
    }

    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
