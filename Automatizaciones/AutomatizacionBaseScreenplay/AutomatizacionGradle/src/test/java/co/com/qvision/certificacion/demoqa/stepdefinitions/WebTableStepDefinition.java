package co.com.qvision.certificacion.demoqa.stepdefinitions;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
public class WebTableStepDefinition {

    @Dado("que el usuario desee editar un registro de la tabla")
    public void queElUsuarioDeseeEditarUnRegistroDeLaTabla() {
        System.out.println("entro al dado ");
    }

    @Cuando("seleccione el boton de editar de determinado registro")
    public void seleccioneElBotonDeEditarDeDeterminadoRegistro() {
        System.out.println("entro al dado ");
    }

    @Entonces("se le mostrara el formulario con los campos que podra editar")
    public void seLeMostraraElFormularioConLosCamposQuePodraEditar() {
        System.out.println("entro al dado ");
    }

    @Dado("que el usuario desee eliminar un registro de la tabla")
    public void queElUsuarioDeseeEliminarUnRegistroDeLaTabla() {
        System.out.println("entro al dado ");
    }

    @Cuando("seleccione el boton de eliminar de determinado registro")
    public void seleccioneElBotonDeEliminarDeDeterminadoRegistro() {
        System.out.println("entro al dado ");
    }

    @Entonces("se eliminara el registro de la tabla y ya no se podra visualizar en esta")
    public void seEliminaraElRegistroDeLaTablaYYaNoSePodraVisualizarEnEsta() {
        System.out.println("entro al dado ");
    }

    @Dado("que el usuario desee agregar un registro a la tabla")
    public void queElUsuarioDeseeAgregarUnRegistroALaTabla() {
        System.out.println("entro al dado ");
    }

    @Cuando("seleccione el boton de agregar")
    public void seleccioneElBotonDeAgregar() {
        System.out.println("entro al dado ");
    }

    @Entonces("se le mostrara un formulario para que diligencie los campos del registro a agregar")
    public void seLeMostraraUnFormularioParaQueDiligencieLosCamposDelRegistroAAgregar() {
        System.out.println("entro al dado ");
    }

    @Dado("que el usuario quiera consultar un registro")
    public void queElUsuarioQuieraConsultarUnRegistro() {
        System.out.println("entro al dado ");
    }

    @Cuando("escriba una letra, número o caracter en la caja")
    public void escribaUnaLetraNúmeroOCaracterEnLaCaja() {
        System.out.println("entro al dado ");
    }

    @Entonces("se le mostrara el o los registros que contengan lo escrito en la caja de busqueda")
    public void seLeMostraraElOLosRegistrosQueContenganLoEscritoEnLaCajaDeBusqueda() {
        System.out.println("entro al dado ");
    }

    @Dado("que el usuario quiera validar si un registro existe en la tabla")
    public void queElUsuarioQuieraValidarSiUnRegistroExisteEnLaTabla() {
        System.out.println("entro al dado ");
    }

    @Cuando("escriba una letra numero o caracter en la caja")
    public void escribaUnaLetraNumeroOCaracterEnLaCaja() {
        System.out.println("entro al dado ");
    }

    @Entonces("mostrara un mensaje indicando que no se encontraron filas.")
    public void mostraraUnMensajeIndicandoQueNoSeEncontraronFilas() {
        System.out.println("entro al dado ");

    }
}
