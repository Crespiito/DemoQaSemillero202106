package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.questions.ValidarFormularioObjetoQuestion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

import static co.com.qvision.certificaion.demoqa.tasks.DiligenciarCamposTask.diligenciarCamposTask;
import static co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask.seleccionarOpcion;

public class PracticeForm2StepDefinitions {
    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado(OpcionesMenuModel opciones) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                seleccionarOpcion(opciones.getOpcion(), opciones.getSubmenu())
        );
    }

    @Cuando("Selecciono el boton subir")
    public void seleccionoElBotonSubir(FormDataModel opcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                diligenciarCamposTask(opcion)
        );
    }

    @Entonces("Confirmo su se registro el formulario con campos vacios")
    public void confirmoSuSeRegistroElFormularioConCamposVacios(FormDataModel opcion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                "La validación de mi prueba",
                ValidarFormularioObjetoQuestion.validarFormularioObjetoQuestion(),
                sameBeanAs(opcion)
        ));
       /*
        Este compara string, value, boolean
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                "La validación de mi prueba",
                ValidarFormularioQuestion.validarFormularioQuestion(),
                Matchers.equalTo("Thanks for submitting the form")
        ));
        */

    }
}
