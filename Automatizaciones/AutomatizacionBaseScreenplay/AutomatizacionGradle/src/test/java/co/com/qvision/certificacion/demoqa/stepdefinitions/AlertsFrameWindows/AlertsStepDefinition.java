package co.com.qvision.certificacion.demoqa.stepdefinitions.AlertsFrameWindows;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class AlertsStepDefinition {

    @Dado("que el usuario quiera ver la alerta")
    public void queElUsuarioQuieraVerLaAlerta() {
        System.out.println("entro al dado ");

    }

    @Cuando("seleccione el boton {string} que corresponde a la alerta deseada")
    public void seleccioneElbotonQueCorrespondeALaAlertaDeseada(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void semostraraUnaVentanaConUnMensajeDeLaaccionEjecutadaYParaContinuardeberaDarClickEnElbotonAceptar() {
        System.out.println("entro al entonces");
    }

    @Dado("que el usuario quiera ver la alerta despues de {int} segundos")
    public void queElUsuarioQuieraVerLaAlertadespuesDeSegundos(Integer int1) {
        System.out.println("entro al dado ");
    }

    @Entonces("se mostrara una ventana despues de 5s con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void semostraraUnaVentanadespuesDe5sConUnMensajeDeLaaccionEjecutadaYParaContinuardeberaDarClickEnElbotonAceptar() {
        System.out.println("entro al entonces");
    }

    @Dado("que el usuario quiera ver la confirmacion al seleccionar el boton")
    public void queElUsuarioQuieraVerLaconfirmacionAlSeleccionarElboton() {
        System.out.println("entro al dado ");
    }

    @Entonces("se mostrara un cuadro donde debe seleccionar aceptar para confirmar la accion y que esta se vea al lado del enunciado del boton")
    public void semostraraUnCuadroDondeDebeSeleccionarAceptarParaConfirmarLaaccionYQueEstaSeVeaAlLadoDelEnunciadoDelboton() {
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
