package co.com.qvision.certificacion.demoqa.stepdefinitions.AlertsFrameWindows;

import co.com.qvision.certificaion.demoqa.tasks.AlertsFrameWindows.Alerts.SelectAlertTask;
import co.com.qvision.certificaion.demoqa.tasks.AlertsFrameWindows.Alerts.SelectOptionTarjetaAlertsTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class AlertsStepDefinition {

    //Alerta simple - Click Button to see alert
    @Dado("que el usuario quiera ver la alerta")
    public void queElUsuarioQuieraVerLaAlerta() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectOptionTarjetaAlertsTask.selectOptionTarjetaAlertsTask()

        );

        //System.out.println("entro al dado ");

    }

    @Cuando("seleccione el boton {string} que corresponde a la alerta deseada")
    public void seleccioneElbotonQueCorrespondeALaAlertaDeseada(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectAlertTask.selectAlertTask()

        );
        //System.out.println("entro al cuando");
    }

    @Entonces("se mostrara una ventana con el mensaje {} y para continuar debera dar click en el boton {}")
    public void seMostraraUnaVentanaConElMensajeyParaContinuarDeberaDarClickEnElBoton() {
        System.out.println("entro al entonces");
    }


    // #On button click, alert will appear after 5 seconds

    @Dado("que el usuario quiera ver la alerta despues de cinco segundos")
    public void queElUsuarioQuieraVerLaAlertadespuesDeCincoSegundos() {
        System.out.println("entro al dado ");
    }

    @Entonces("se mostrara una ventana despues de cinco seg con el mensaje {} y para continuar debera dar click en el boton {}")
    public void seMostraraUnaVentanaDespuesDeCincoSegConElMensajeYParaContinuarDeberaDarClickEnElboton() {
        System.out.println("entro al entonces");
    }


   // #On button click, confirm box will appear - select Accept

    @Dado("que el usuario quiera ver la Confirmacion al seleccionar el boton")
    public void queElUsuarioQuieraVerLaconfirmacionAlSeleccionarElboton() {
        System.out.println("entro al dado ");
    }

    @Entonces("se mostrara un cuadro donde debe seleccionar {} para confirmar la accion y que esta se vea al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarParaConfirmarLaAccionYQueEstaSeVeaAlLadoDelEnunciadoDelboton() {
        System.out.println("entro al entonces");
    }

    @Entonces("se mostrara un cuadro donde debe seleccionar cancelar para ver esta eleccion al lado del enunciado del boton")
    public void semostraraUnCuadroDondeDebeSeleccionarCancelarParaVerEstaEleccionAlLadoDelEnunciadoDelboton() {
        System.out.println("entro al entonces");
    }

    @Dado("que el usuario quiera validar la aparicion de un cuadro de aviso")
    public void queElUsuarioQuieraValidarLaAparicionDeUnCuadroDeAviso() {
        System.out.println("entro al dado ");
    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar.")
    public void semostraraUnAvisoDondePuedeIngresarSuNombreElCualSeveraReflejadoAlLadoDelEnunciadoSiSeleccionaElbotonAceptar() {
        System.out.println("entro al entonces");
    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual no se vera reflejado al lado del enunciado si selecciona el boton cancelar.")
    public void semostraraUnAvisoDondePuedeIngresarSuNombreElCualNoSeveraReflejadoAlLadoDelEnunciadoSiSeleccionaElbotonCancelar() {
        System.out.println("entro al entonces");
    }

    @Dado("que como usuario del modulo Alerts, frame & windows")
    public void queComoUsuarioDelModuloAlertsFrameWindows() {
        System.out.println("entro al dado ");
    }





}
