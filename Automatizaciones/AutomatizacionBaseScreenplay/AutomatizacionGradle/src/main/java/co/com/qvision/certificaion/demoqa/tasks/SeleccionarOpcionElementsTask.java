package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.SeleccionarOpcionesInicialesInteraction;
import co.com.qvision.certificaion.demoqa.interactions.SelectOpcionInicialElementsInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarOpcionElementsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectOpcionInicialElementsInteraction.seleccionar());
    }

    public static SeleccionarOpcionElementsTask seleccionarOpcion(){
        return Tasks.instrumented(SeleccionarOpcionElementsTask.class);
    }
}
