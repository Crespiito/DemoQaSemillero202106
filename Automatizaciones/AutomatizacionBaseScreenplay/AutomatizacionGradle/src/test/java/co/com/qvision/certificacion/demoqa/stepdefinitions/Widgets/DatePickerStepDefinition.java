package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class DatePickerStepDefinition {

    @Dado("Yo como usuario ubico la opcion {string} y el recuadro {string}")
    public void yoComoUsuarioUbicoLaOpcionYElRecuadro(String string, String string2) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione el recuadro {string}, y selecciono una de las fechas de la lista que se despliega")
    public void seleccioneElRecuadroYSeleccionoUnaDeLasFechasDeLaListaQueSeDespliega(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que la fecha seleccionada aparece en formato numerico en el recuadro en lugar de {string}")
    public void visualiceQueLaFechaSeleccionadaApareceEnFormatoNumericoEnElRecuadroEnLugarDe(String string) {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario ubico la opcion {string} y el recuadro que debe mostrar la fecha y hora actual")
    public void yoComoUsuarioUbicoLaOpcionYElRecuadroQueDebeMostrarLaFechaYHoraActual(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione el recuadro y escojo una de las fechas y horarios de las listas que se despliega")
    public void seleccioneElRecuadroYEscojoUnaDeLasFechasYHorariosDeLasListasQueSeDespliega() {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que la fecha y hora seleccionada aparece en el recuadro")
    public void visualiceQueLaFechaYHoraSeleccionadaApareceEnElRecuadro() {
        System.out.println("entro al entonces");
    }



}
