package co.com.qvision.certificacion.demoqa.stepdefinitions.Interactions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class DragabbleStepDefinition {

    @Entonces("Visualice las pestanas {string}  {string}  {string} y {string}")
    public void visualiceLasPestanasY(String string, String string2, String string3, String string4) {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario ingrese a la pestana {string}")
    public void yoComoUsuarioIngreseALaPestana(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione y mueva el item {string}")
    public void seleccioneYMuevaElItem(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee")
    public void visualiceQueElItemSeMueveSegunElUsuarioDesee(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve solamente horizontalmente dentro de la pantalla")
    public void visualiceQueElItemSeMueveSolamenteHorizontalmenteDentroDeLaPantalla(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve solamente verticalmente dentro de la pantalla")
    public void visualiceQueElItemSeMueveSolamenteVerticalmenteDentroDeLaPantalla(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve solamente dentro del recuadro definido y que le texto es estatico")
    public void visualiceQueElItemSeMueveSolamenteDentroDelRecuadroDefinidoYQueLeTextoEsEstatico(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el texto {string} se mueve dentro del recuadro definido y que le recuadro en el que esta contenido es estatico")
    public void visualiceQueElTextoSeMueveDentroDelRecuadroDefinidoYQueLeRecuadroEnElQueEstaContenidoEsEstatico(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve correctamente y que el cursor se visualiza en el centro del recuadro")
    public void visualiceQueElItemSeMueveCorrectamenteYQueElCursorSeVisualizaEnElCentroDelRecuadro(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve correctamente y que el cursor se visualiza en la esquina superior izquierda del recuadro")
    public void visualiceQueElItemSeMueveCorrectamenteYQueElCursorSeVisualizaEnLaEsquinaSuperiorIzquierdaDelRecuadro(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve correctamente y que el cursor se visualiza en la base inferior del recuadro")
    public void visualiceQueElItemSeMueveCorrectamenteYQueElCursorSeVisualizaEnLaBaseInferiorDelRecuadro(String string) {
        System.out.println("entro al entonces");
    }
}
