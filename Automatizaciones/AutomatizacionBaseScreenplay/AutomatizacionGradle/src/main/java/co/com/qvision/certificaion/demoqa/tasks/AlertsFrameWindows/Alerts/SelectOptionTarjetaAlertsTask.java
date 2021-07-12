package co.com.qvision.certificaion.demoqa.tasks.AlertsFrameWindows.Alerts;


import co.com.qvision.certificaion.demoqa.interactions.AlertsFrameWindows.Alerts.SelectTarjetaAlertsInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectOptionTarjetaAlertsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectTarjetaAlertsInteraction.selectTarjeta()
        );
    }
    public static SelectOptionTarjetaAlertsTask selectOptionTarjetaAlertsTask(){
        return Tasks.instrumented(SelectOptionTarjetaAlertsTask.class);
    }
}
