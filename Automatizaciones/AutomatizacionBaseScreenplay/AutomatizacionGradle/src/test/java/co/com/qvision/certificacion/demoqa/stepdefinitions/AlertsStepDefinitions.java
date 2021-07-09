package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.models.OpcionRadioButtonModel;
import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.questions.ValidarAlertsQuestion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static co.com.qvision.certificaion.demoqa.tasks.ClicksAlertsTask.clicksAlerts;
import static co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask.seleccionarOpcion;

public class AlertsStepDefinitions {

    @Dado("que el usuario quiera ver la alerta")
    public void queElUsuarioQuieraVerLaAlerta(OpcionesMenuModel option) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                seleccionarOpcion(option.getOpcion(),option.getSubmenu())
        );
    }

    @Cuando("seleccione el boton Haz click en mi que corresponde a la alerta deseada")
    public void seleccioneElBotonHazClickEnMiQueCorrespondeALaAlertaDeseada(OpcionRadioButtonModel option) {
        OnStage.theActorInTheSpotlight().attemptsTo(
               clicksAlerts(option.getBoton())
        );


    }

    @Entonces("se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                "La validación de mi prueba",
                ValidarAlertsQuestion.validarAlertsQuestion(),
                Matchers.anyOf(
                        Matchers.is("You clicked a button"),
                        Matchers.is("This alert appeared after 5 seconds")
                )
        ));
    }

    @Dado("que el usuario quiera ver la alerta despues de cinco segundos")
    public void queElUsuarioQuieraVerLaAlertaDespuesDeCincoSegundos() {

    }

    @Cuando("seleccione el boton Haz click en mi que corresponde a la alerta despues de cinco segundos")
    public void seleccioneElBotonHazClickEnMiQueCorrespondeALaAlertaDespuesDeCincoSegundos() {

    }

    @Entonces("se mostrara una ventana despues de cinco segundos con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaDespuesDeCincoSegundosConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {

    }

    @Dado("que el usuario quiera ver la confirmacion al seleccionar el boton")
    public void queElUsuarioQuieraVerLaConfirmacionAlSeleccionarElBoton() {

    }

    @Entonces("se mostrara un cuadro donde debe seleccionar aceptar para confirmar la accion y que esta se vea al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarAceptarParaConfirmarLaAccionYQueEstaSeVeaAlLadoDelEnunciadoDelBoton() {

    }

    @Entonces("se mostrara un cuadro donde debe seleccionar cancelar para ver esta eleccion al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarCancelarParaVerEstaEleccionAlLadoDelEnunciadoDelBoton() {

    }

    @Dado("que el usuario quiera validar la aparicion de un cuadro de aviso")
    public void queElUsuarioQuieraValidarLaAparicionDeUnCuadroDeAviso() {

    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar")
    public void seMostraraUnAvisoDondePuedeIngresarSuNombreElCualSeVeraReflejadoAlLadoDelEnunciadoSiSeleccionaElBotonAceptar() {

    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual no se vera reflejado al lado del enunciado si selecciona el boton cancelar")
    public void seMostraraUnAvisoDondePuedeIngresarSuNombreElCualNoSeVeraReflejadoAlLadoDelEnunciadoSiSeleccionaElBotonCancelar() {

    }

    @Dado("que como usuario del modulo Alerts frame & windows")
    public void queComoUsuarioDelModuloAlertsFrameWindows() {

    }

    @Cuando("selecciono cada boton")
    public void seleccionoCadaBoton() {

    }

    @Entonces("verifico los mensajes en los alerts")
    public void verificoLosMensajesEnLosAlerts() {

    }


}
