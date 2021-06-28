package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class AutoCompleteStepDefinition {

    @Dado("Yo como usuario ubico la opcion {string} y un recuadro bajo el")
    public void yoComoUsuarioUbicoLaOpcionYUnRecuadroBajoEl(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione el recuadro escibo algo en el y completo con las opciones que se despliegan, selecciono uno o varios items de la lista que se despliega o repito el proceso")
    public void seleccioneElRecuadroEsciboAlgoEnElYCompletoConLasOpcionesQueSeDesplieganSeleccionoUnoOVariosItemsDeLaListaQueSeDespliegaORepitoElProceso() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el o los items seleccionado aparece en el recuadro")
    public void visualiceQueElOLosItemsSeleccionadoApareceEnElRecuadro() {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione el recuadro escibo algo en el y completo con una de las opciones que se despliegan, selecciono uno de los items de la lista que se despliega")
    public void seleccioneElRecuadroEsciboAlgoEnElYCompletoConUnaDeLasOpcionesQueSeDesplieganSeleccionoUnoDeLosItemsDeLaListaQueSeDespliega() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item seleccionado aparece en el recuadro")
    public void visualiceQueElItemSeleccionadoApareceEnElRecuadro() {
        System.out.println("entro al entonces");
    }

}
