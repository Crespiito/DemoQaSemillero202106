package co.com.qvision.certificacion.demoqa.stepdefinitions.Interactions;

import io.cucumber.java.es.Cuando;

import io.cucumber.java.es.Entonces;


public class SortableStepDefinition {

    @Cuando("Seleccione un item listado y lo arrastre a otra posicion")
    public void seleccioneUnItemListadoYLoArrastreAOtraPosicion() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item arrastrado se movio a donde el usuario deseaba, y los demas items del listado subieron y cambiaron de orden")
    public void visualiceQueElItemArrastradoSeMovioADondeElUsuarioDeseabaYLosDemasItemsDelListadoSubieronYCambiaronDeOrden() {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione un item en los recuadros delimitados y lo arrastre a otra posicion")
    public void seleccioneUnItemEnLosRecuadrosDelimitadosYLoArrastreAOtraPosicion() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item arrastrado se movio a donde el usuario deseaba y cambio de posicion con el recuadro a donde lo movio")
    public void visualiceQueElItemArrastradoSeMovioADondeElUsuarioDeseabaYCambioDePosicionConElRecuadroADondeLoMovio() {
        System.out.println("entro al entonces");
    }


}
