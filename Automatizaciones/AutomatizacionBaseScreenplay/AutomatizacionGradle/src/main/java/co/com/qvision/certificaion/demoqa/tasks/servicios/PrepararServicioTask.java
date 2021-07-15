package co.com.qvision.certificaion.demoqa.tasks.servicios;

import co.com.qvision.certificaion.demoqa.interactions.servicios.PrepararServicioInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class PrepararServicioTask  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PrepararServicioInteraction.prepararServicio());
    }
    public static PrepararServicioTask prepararServicio(){
        return Tasks.instrumented(PrepararServicioTask.class);
    }
}
