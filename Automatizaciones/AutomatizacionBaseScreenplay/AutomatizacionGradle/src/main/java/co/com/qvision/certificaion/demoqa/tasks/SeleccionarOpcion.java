package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.SeleccionarOpcionesInicialesInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarOpcion  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeleccionarOpcionesInicialesInteraction.seleccionar());
    }

    public static SeleccionarOpcion seleccionarOpcion(){
        return Tasks.instrumented(SeleccionarOpcion.class);
    }
}
