package co.com.qvision.certificacion.demoqa.stepdefinitions.Windows;

import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import co.com.qvision.certificaion.demoqa.questions.ValidarButtonAlertsQuestion;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionMenuTask;
import co.com.qvision.certificaion.demoqa.tasks.windows.AlertsClickmeTask;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;


public class AlertsStepDefinition {


    @Dado("que el usuario ingresa al modulo de La Tarjeta y al submenu Seleccionando")
    public void queElUsuarioIngresaAlModuloDeLaTarjetaYAlSubmenuSeleccionando(OpcionMenuModel opciones)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOpcionMenuTask.menu(opciones));
    }

    @Cuando("seleccione el boton click me")
    public void seleccioneElBotonClickMe() {
        OnStage.theActorInTheSpotlight().attemptsTo(AlertsClickmeTask.clickmeTask());
    }

    @Entonces("se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Validacion button alert",
                ValidarButtonAlertsQuestion.validarButtonAlertsQuestion(), Matchers.equalTo("You clicked a button")));
    }
}
