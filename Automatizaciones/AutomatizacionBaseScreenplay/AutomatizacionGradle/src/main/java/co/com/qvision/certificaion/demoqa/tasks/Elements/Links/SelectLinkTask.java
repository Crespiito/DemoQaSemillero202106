package co.com.qvision.certificaion.demoqa.tasks.Elements.Links;

import co.com.qvision.certificaion.demoqa.interactions.Elements.Links.SelectLinkInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectLinkTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectLinkInteraction.selectLinkInteraction()
        );

    }


    public static SelectLinkTask selectLinkTask(){
        return Tasks.instrumented(SelectLinkTask.class);
    }
}
