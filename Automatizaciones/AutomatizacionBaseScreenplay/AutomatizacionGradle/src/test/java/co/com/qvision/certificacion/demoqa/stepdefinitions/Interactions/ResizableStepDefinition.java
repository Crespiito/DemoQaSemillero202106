package co.com.qvision.certificacion.demoqa.stepdefinitions.Interactions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class ResizableStepDefinition {

    @Entonces("Visualice las opciones {string} y {string}")
    public void visualiceLasOpcionesY(String string, String string2) {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario ingrese al modulo Resizable")
    public void yoComoUsuarioIngreseAlModuloResizable() {
        System.out.println("entro al dado ");
    }

    @Cuando("el usuario seleccione y mueva el item {string}")
    public void elUsuarioSeleccioneYMuevaElItem(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item {string} se mueve y cambia su tamano segun el usuario desee dentro del recuadro marcado y predeterminado")
    public void visualiceQueElItemSeMueveYCambiaSuTamanoSegunElUsuarioDeseeDentroDelRecuadroMarcadoYPredeterminado(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee por toda la pantalla y cambie le tamano de este item")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseePorTodaLaPantallaYCambieLeTamanoDeEsteItem(String string) {
        System.out.println("entro al entonces");
    }


}
