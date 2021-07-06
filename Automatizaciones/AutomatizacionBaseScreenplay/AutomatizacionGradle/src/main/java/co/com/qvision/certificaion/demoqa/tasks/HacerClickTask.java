package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.ClickGenericoInteraction.clickGenericoInteraction;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class HacerClickTask implements Task {

    String boton;

    public HacerClickTask(String boton) {
        this.boton = boton;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                clickGenericoInteraction(boton)
        );
    }

    public static HacerClickTask hacerClickTask(String boton) {
        return instrumented(HacerClickTask.class, boton);
    }


}
