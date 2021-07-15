package co.com.qvision.certificaion.demoqa.tasks.services;

import co.com.qvision.certificaion.demoqa.interactions.services.PrepararServiceInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class PrepararServicioTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(PrepararServiceInteraction.prepararService());
    }

    public static PrepararServicioTask prepararServicio(){
        return Tasks.instrumented(PrepararServicioTask.class);
    }
}
