package co.com.qvision.certificaion.demoqa.tasks.Elements.Links;

import co.com.qvision.certificaion.demoqa.interactions.Elements.Links.SelectTarjetaLinksInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectOptionLinksTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectTarjetaLinksInteraction.seleccionar()
        );
    }

    public static SelectOptionLinksTask selectOptionLinksTask(){
        return Tasks.instrumented(SelectOptionLinksTask.class);
    }
}
