package co.com.qvision.certificaion.demoqa.tasks.windows;

import co.com.qvision.certificaion.demoqa.interactions.windows.AlertsbuttonInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


    public class AlertsClickmeTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(AlertsbuttonInteraction.alertsbuttonInteraction());
    }

    public static AlertsClickmeTask clickmeTask(){
        return Tasks.instrumented(AlertsClickmeTask.class);

    }
}
