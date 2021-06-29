package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.GENDER;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.HOBBIES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposBinariosInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(GENDER),
                Click.on(GENDER),
                Scroll.to(HOBBIES),
                Click.on(HOBBIES)
        );
    }

    public static CamposBinariosInteractions camposBinariosInteractions(){
        return instrumented(CamposBinariosInteractions.class);
    }
}
