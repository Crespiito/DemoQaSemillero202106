package co.com.qvision.certificaion.demoqa.tasks.services;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.services.PrepararServicioInteraction.prepararServicio;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrepararServicioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                prepararServicio()
        );
    }

    public static PrepararServicioTask prepararServicioTask(){
        return instrumented(PrepararServicioTask.class);
    }
}
