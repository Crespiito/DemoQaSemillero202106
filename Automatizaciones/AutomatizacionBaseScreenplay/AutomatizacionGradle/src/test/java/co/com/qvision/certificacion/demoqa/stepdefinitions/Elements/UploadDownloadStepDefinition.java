package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
public class UploadDownloadStepDefinition {

    @Dado("que el usuario ingresa al modulo Upload & Download y ubica el boton de Download")
    public void queElUsuarioIngresaAlModuloUploadDownloadYUbicaElBotonDeDownload() {
        System.out.println("entro al dado ");
    }

    @Cuando("el usuario accede al item de Download")
    public void elUsuarioAccedeAlItemDeDownload() {
        System.out.println("entro al Cuando ");
    }

    @Entonces("valido que al acceder al item Download se de la correcta descarga de un archivo.")
    public void validoQueAlAccederAlItemDownloadSeDeLaCorrectaDescargaDeUnArchivo() {
        System.out.println("entro al Entonces ");
    }

    @Dado("que el usuario ingresa al modulo Upload & Download y ubica el boton Seleccionar un archivo")
    public void queElUsuarioIngresaAlModuloUploadDownloadYUbicaElBotonSeleccionarUnArchivo() {
        System.out.println("entro al Dado");
    }

    @Cuando("el usuario accede al item {string}")
    public void elUsuarioAccedeAlItem(String string) {
        System.out.println("entro al Cuando ");
    }

    @Entonces("valido que se despliegue una ventana nueva con acceso a los diferentes directorios del equipo, que se permita la seleccion de un archivo y se cargue correctamente, adicional que me permita ver el nombre del archivo seleccionado y la ruta en la que se encontro.")
    public void validoQueSeDespliegueUnaVentanaNuevaConAccesoALosDiferentesDirectoriosDelEquipoQueSePermitaLaSeleccionDeUnArchivoYSeCargueCorrectamenteAdicionalQueMePermitaVerElNombreDelArchivoSeleccionadoYLaRutaEnLaQueSeEncontro() {
        System.out.println("entro al Entonces ");
    }
}
