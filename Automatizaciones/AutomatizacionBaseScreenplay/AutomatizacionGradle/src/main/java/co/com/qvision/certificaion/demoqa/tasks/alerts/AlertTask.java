package co.com.qvision.certificaion.demoqa.tasks.alerts;

import co.com.qvision.certificaion.demoqa.interactions.alerts.AlertInteraction;
import co.com.qvision.certificaion.demoqa.models.AlertModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertTask implements Task {
    AlertModel alertModel;

    public AlertTask(AlertModel alertModel) {
        this.alertModel = alertModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(AlertInteraction.alertInteraction(alertModel));
    }
    public  static AlertTask alertTask(AlertModel alertModel){
        return instrumented(AlertTask.class,alertModel);
    }
}
