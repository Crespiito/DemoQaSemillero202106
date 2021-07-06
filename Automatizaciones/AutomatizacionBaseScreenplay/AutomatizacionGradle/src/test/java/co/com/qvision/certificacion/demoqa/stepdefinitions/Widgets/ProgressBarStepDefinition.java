package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;

import io.cucumber.java.es.Cuando;

import io.cucumber.java.es.Entonces;

public class ProgressBarStepDefinition {
    @Cuando("Seleccione el boton Start")
    public void seleccioneElBotonStart() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el boton {string} cambia a {string} y una barra que se empieza a colorear verticalmente de azul y marcar de {int}% a {int}%, al llegar a {int}% cambia toda la barra a color verde y el boton {string} cambia a {string}")
    public void visualiceQueElBotonCambiaAYUnaBarraQueSeEmpiezaAColorearVerticalmenteDeAzulYMarcarDeAAlLlegarACambiaTodaLaBarraAColorVerdeYElBotonCambiaA(String string, String string2, Integer int1, Integer int2, Integer int3, String string3, String string4) {
        System.out.println("entro al entonces");
    }

}
