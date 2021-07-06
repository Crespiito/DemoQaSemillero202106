package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class SelectMenuStepDefinition {


    @Cuando("Seleccione y mueva el item {string}, y selecciono uno de las opciones de la lista que se despliega")
    public void seleccioneYMuevaElItemYSeleccionoUnoDeLasOpcionesDeLaListaQueSeDespliega(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item seleccionado aparece en el recuadro en lugar de {string}")
    public void visualiceQueElItemSeleccionadoApareceEnElRecuadroEnLugarDe(String string) {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione y mueva el item {string}, y selecciono uno de los items de la lista que se despliega")
    public void seleccioneYMuevaElItemYSeleccionoUnoDeLosItemsDeLaListaQueSeDespliega(String string) {
        System.out.println("entro al cuando");
    }

    @Dado("Yo como usuario ubico la opcion {string} y un recuadro con opcion para desplegar")
    public void yoComoUsuarioUbicoLaOpcionYUnRecuadroConOpcionParaDesplegar(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione y despliegue el recuadro, selecciono uno de los items de la lista que se despliega")
    public void seleccioneYDespliegueElRecuadroSeleccionoUnoDeLosItemsDeLaListaQueSeDespliega() {
        System.out.println("entro al cuando");
    }

    @Dado("Yo como usuario ubico la opcion {string} y un recuadro {string} con opcion para desplegar")
    public void yoComoUsuarioUbicoLaOpcionYUnRecuadroConOpcionParaDesplegar(String string, String string2) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione y despliegue el recuadro {string}, selecciono uno o varios items de la lista que se despliega")
    public void seleccioneYDespliegueElRecuadroSeleccionoUnoOVariosItemsDeLaListaQueSeDespliega(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el o los items seleccionado aparece en el recuadro en lugar de {string}")
    public void visualiceQueElOLosItemsSeleccionadoApareceEnElRecuadroEnLugarDe(String string) {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario ubico la opcion {string} y un recuadro que me lista varias opciones")
    public void yoComoUsuarioUbicoLaOpcionYUnRecuadroQueMeListaVariasOpciones(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione una de las opciones en el recuadro")
    public void seleccioneUnaDeLasOpcionesEnElRecuadro() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item seleccionado aparece en el recuadro sombreado de otro color")
    public void visualiceQueElItemSeleccionadoApareceEnElRecuadroSombreadoDeOtroColor() {
        System.out.println("entro al entonces");
    }

}
