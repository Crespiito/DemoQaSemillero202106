package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.SeleccionarOpciones1Task;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class PracticeFormStepDefinition {


    @Dado("que el usuario ingresa al modulo {} y al submenu Seleccionando {}")
    public void queElUsuarioIngresaAlModuloFormsYAlSubmenuSeleccionandoPracticeForm(String opcion, String opcion2) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opcion, opcion2));
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioTask.llenarFormularioTask());
    }

    @Entonces("como ususario envio el formulario con el boton submit")
    public void comoUsusarioEnvioElFormularioConElBotonSubmit() {
        System.out.println("entro Entonces");
    }



}

