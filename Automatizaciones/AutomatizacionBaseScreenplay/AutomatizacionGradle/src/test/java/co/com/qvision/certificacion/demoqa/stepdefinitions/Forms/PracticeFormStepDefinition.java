package co.com.qvision.certificacion.demoqa.stepdefinitions.Forms;

import co.com.qvision.certificaion.demoqa.models.Forms.FormData;
import co.com.qvision.certificaion.demoqa.questions.Forms.ValidarFormularioQuestion;
import co.com.qvision.certificaion.demoqa.tasks.Forms.LlenarFormulario;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;


public class PracticeFormStepDefinition {


    // Escenarios usados en caso base


    @Dado("que el usuario ingresa a la opcion de {} y el submenu {}")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado(String forms, String practicesForm) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionTask.seleccionarOpcion());
    }


    @Cuando("lleno el formulario")
    public void llenoElFormulario(FormData datos) {
            OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenarFormulario(datos));

    }


    //Para comparacion por modelo y directa se usa el void sin parametros de entrada()
    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios(FormData datos) {
        //Comparacion por modelo
        //FormData datos = new FormData("juan","bautista","hola@queteimporta.com", "Male", "1234567890","English","Sports","abc 123");

        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.
                        seeThat("la validacion de mi prueba",
                                ValidarFormularioQuestion.validar(),
                                sameBeanAs(datos)));


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
