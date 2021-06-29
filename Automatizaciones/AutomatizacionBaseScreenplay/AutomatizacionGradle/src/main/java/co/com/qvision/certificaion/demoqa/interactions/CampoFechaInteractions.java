package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.FECHA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CampoFechaInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FECHA),
                DoubleClick.on(FECHA),
                Hit.the(Keys.DELETE).keyIn(FECHA),
                DoubleClick.on(FECHA),
                Hit.the(Keys.DELETE).keyIn(FECHA),
                DoubleClick.on(FECHA),
                Hit.the(Keys.DELETE).keyIn(FECHA),
                DoubleClick.on(FECHA),
                Hit.the(Keys.DELETE).keyIn(FECHA),
                DoubleClick.on(FECHA),
                Enter.keyValues("12 jan 2000").into(FECHA)
        );
    }

    public static CampoFechaInteractions campoFechaInteractions(){
        return instrumented(CampoFechaInteractions.class);
    }
}
