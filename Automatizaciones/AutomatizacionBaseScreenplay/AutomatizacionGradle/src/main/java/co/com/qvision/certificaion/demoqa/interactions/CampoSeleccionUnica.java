package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormsUI.GENDER;
import static co.com.qvision.certificaion.demoqa.user_interfaces.FormsUI.HOBBIES;

public class CampoSeleccionUnica implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
             //  Scroll.to(GENDER),
                Click.on(GENDER),
                Scroll.to(HOBBIES),
                Click.on(HOBBIES)
        );
    }

    public static CampoSeleccionUnica campoSeleccionUnica(){
        return Tasks.instrumented(CampoSeleccionUnica.class);
    }
}
