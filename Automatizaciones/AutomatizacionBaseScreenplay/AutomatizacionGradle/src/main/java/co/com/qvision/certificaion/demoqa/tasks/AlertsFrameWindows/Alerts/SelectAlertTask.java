package co.com.qvision.certificaion.demoqa.tasks.AlertsFrameWindows.Alerts;

import co.com.qvision.certificaion.demoqa.interactions.AlertsFrameWindows.Alerts.SelectAlertsInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectAlertTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectAlertsInteraction.selectAlertsInteraction()
        );
    }

    public static SelectAlertTask selectAlertTask(){
        return Tasks.instrumented(SelectAlertTask.class);
    }
}
