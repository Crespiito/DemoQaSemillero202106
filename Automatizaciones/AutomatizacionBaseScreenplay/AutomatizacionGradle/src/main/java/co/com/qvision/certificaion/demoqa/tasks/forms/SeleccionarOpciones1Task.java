package co.com.qvision.certificaion.demoqa.tasks.forms;

import co.com.qvision.certificaion.demoqa.interactions.forms.SeleccionarOpcionesInicialesInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpciones1Task implements Task {

    @Override
    public <T extends Actor > void performAs (T actor) {
      //  actor.attemptsTo(SeleccionarOpcionesInicialesInteraction.());

    }

    public static SeleccionarOpciones1Task seleccionarOpcion(){
        return instrumented(SeleccionarOpciones1Task.class);

    }
}
