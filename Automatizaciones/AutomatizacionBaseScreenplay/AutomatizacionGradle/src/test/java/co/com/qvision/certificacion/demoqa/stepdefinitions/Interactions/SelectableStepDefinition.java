package co.com.qvision.certificacion.demoqa.stepdefinitions.Interactions;

import io.cucumber.java.es.Cuando;

import io.cucumber.java.es.Entonces;

public class SelectableStepDefinition {

    @Entonces("Visualice las pestanas {string}  {string}")
    public void visualiceLasPestanas(String string, String string2) {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione uno o varios de los items listados al darle click una vez sobre ellos")
    public void seleccioneUnoOVariosDeLosItemsListadosAlDarleClickUnaVezSobreEllos() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que los items que han sido clickeados una vez cambian de color al ser seleccionados")
    public void visualiceQueLosItemsQueHanSidoClickeadosUnaVezCambianDeColorAlSerSeleccionados() {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione uno o varios de los items en los recuadros delimitados, al darle click una vez sobre ellos")
    public void seleccioneUnoOVariosDeLosItemsEnLosRecuadrosDelimitadosAlDarleClickUnaVezSobreEllos() {
        System.out.println("entro al cuando");
    }

}
