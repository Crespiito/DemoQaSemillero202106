package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.tasks.LlenarFormularioTask;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpciones1Task;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class PracticeFormStepDefinition {

/*
    @Dado("que como usuario ingrese a la opcion {}")
    public void queComoUsuarioEnElModuloFormsYEnElItemPracticesForm(String opcion ) {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTask.menu(opcion));
    }

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
        System.out.println("entro al cuando");
    }


    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        System.out.println("entro al entonces");

    }
*/

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpciones1Task.seleccionarOpcion());
    }

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {

    }

    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        System.out.println("entro al entonces");
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioTask.llenarFormularioTask());
    }
}

