package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.ClicPorIdInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicksAlertsTask implements Task {

    String boton;

    public ClicksAlertsTask(String boton) {
        this.boton = boton;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ClicPorIdInteraction.clicPorId(boton)

        );
        System.out.println("");
    }

    public static ClicksAlertsTask clicksAlerts(String boton) {
        return instrumented(ClicksAlertsTask.class, boton);
    }
}
