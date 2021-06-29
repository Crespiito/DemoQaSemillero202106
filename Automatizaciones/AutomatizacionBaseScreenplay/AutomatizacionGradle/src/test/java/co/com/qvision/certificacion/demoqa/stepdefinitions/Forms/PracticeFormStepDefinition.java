package co.com.qvision.certificacion.demoqa.stepdefinitions.Forms;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.qvision.certificaion.demoqa.tasks.LlenarFormulario;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class PracticeFormStepDefinition {

    @Dado("que como usuario ingreso en el modulo forms y en el item practices form")
    public void queComoUsuarioIngresoEnElModuloFormsYEnElItemPracticesForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTask.seleccionarOpcion());
        //System.out.println("entro al dado ");
    }

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
        System.out.println("entro al cuando");
    }

    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        System.out.println("entro al entonces");
    }

    @Cuando("ingreso los datos validos en cada campo")
    public void ingresoLosDatosValidosEnCadaCampo() {
        System.out.println("entro al cuando");
    }

    @Entonces("confirmo si el registro se realiza con exito")
    public void confirmoSiElRegistroSeRealizaConExito() {
        System.out.println("entro al entonces");
    }

    @Cuando("ingreso datos invalidos en los campos")
    public void ingresoDatosInvalidosEnLosCampos() {
        System.out.println("entro al cuando");
    }


    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTask.seleccionarOpcion());
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenarFormulario());

    }
}
