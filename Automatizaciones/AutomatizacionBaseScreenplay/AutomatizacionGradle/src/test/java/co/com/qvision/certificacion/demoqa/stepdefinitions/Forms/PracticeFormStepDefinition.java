package co.com.qvision.certificacion.demoqa.stepdefinitions.Forms;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.qvision.certificaion.demoqa.models.FormData;
import co.com.qvision.certificaion.demoqa.questions.ValidarFormularioQuestion;
import co.com.qvision.certificaion.demoqa.tasks.LlenarFormulario;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.Matchers.equalTo;



public class PracticeFormStepDefinition {


    // Escenarios usados en caso base


    @Dado("que el usuario ingresa a la opcion de {} y el submenu {}")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado(String forms, String practicesForm) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTask.seleccionarOpcion());
    }


    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenarFormulario());

    }

    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        //Comparacion por modelo
        FormData datos = new FormData("juan","bautista","Female", "1234567890");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("la validacion de mi prueba", ValidarFormularioQuestion.validar(),sameBeanAs(datos)));


                //Comparacion directa usando Matchers
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("La validacion de la prueba", ValidarFormularioQuestion.validar() , Matchers.is("null")));

    }


    // Escenarios especificos

    @Dado("que como usuario ingreso en el modulo {} y en el item {}")
    public void queComoUsuarioIngresoEnElModuloFormsYEnElItemPracticesForm(String forms, String practicesForm) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTask.seleccionarOpcion());
        //System.out.println("entro al dado ");
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

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
        System.out.println("entro al cuando");
    }


}
