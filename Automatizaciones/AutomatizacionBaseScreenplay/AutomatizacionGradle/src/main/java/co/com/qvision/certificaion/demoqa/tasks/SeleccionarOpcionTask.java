package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.SeleccionarOpcionesInicialesInteraction.seleccionarOpcionesInicialesInteraction;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarOpcionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                seleccionarOpcionesInicialesInteraction()
        );
    }

    public static SeleccionarOpcionTask seleccionarOpcion() {
        return instrumented(SeleccionarOpcionTask.class
        );
    }
}
