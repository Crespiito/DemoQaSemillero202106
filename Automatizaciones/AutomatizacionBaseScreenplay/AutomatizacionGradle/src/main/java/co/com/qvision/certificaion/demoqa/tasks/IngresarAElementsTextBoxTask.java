package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalElementsInteractions.tarjetaMenuPrincipalElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAElementsTextBoxTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                tarjetaMenuPrincipalElements()
        );
    }

    public static IngresarAElementsTextBoxTask seleccionarMenu(){
        return instrumented (IngresarAElementsTextBoxTask.class);
    }
}
