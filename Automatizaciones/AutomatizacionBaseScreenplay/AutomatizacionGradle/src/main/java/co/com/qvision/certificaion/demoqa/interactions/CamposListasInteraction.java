package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposListasInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DEPARTAMENTOS),
                Click.on(DEPARTAMENTOS),
                Click.on(SELECCIONAR_DEPARTAMENTOS),
                //SelectFromOptions.byValue("Haryana").from(DEPARTAMENTOS)
                //Enter.keyValues("NCR").into(DEPARTAMENTOS)
                //Hit.the(Keys.ENTER).keyIn(DEPARTAMENTOS)
                //SelectFromOptions.byVisibleText("NCR").from(DEPARTAMENTOS),

                Scroll.to(CITY),
                Click.on(CITY),
                Click.on(SELECCIONAR_CITY)
                //SelectFromOptions.byValue("Delhi").from(CITY),
                //Hit.the(Keys.ENTER).keyIn(CITY)
        );
    }

    public static CamposListasInteraction camposListasInteraction() {
        return instrumented(CamposListasInteraction.class);
    }
}
