package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;

import io.cucumber.java.es.Cuando;

import io.cucumber.java.es.Entonces;

public class SliderStepDefinition {

    @Cuando("Seleccione y mueva el item {string} o circulo azul")
    public void seleccioneYMuevaElItemOCirculoAzul(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee y se muestre la posicion en la que esta entre {int} y {int} bajo el circulo azul y en el recuadro")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeYSeMuestreLaPosicionEnLaQueEstaEntreYBajoElCirculoAzulYEnElRecuadro(String string, Integer int1, Integer int2) {
        System.out.println("entro al entonces");
    }


}
