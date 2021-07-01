package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubirArchivosInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("C:\\Users\\QV-4543\\Documents\\Qvision\\DemoQaSemillero202106\\Automatizaciones\\AutomatizacionBaseScreenplay\\AutomatizacionGradle\\src\\test\\resources\\docs\\doc.txt").into("//*[@id='uploadFile']")
        );
    }

    public static SubirArchivosInteractions subirArchivosInteractions(){
        return instrumented(SubirArchivosInteractions.class);
    }
}
