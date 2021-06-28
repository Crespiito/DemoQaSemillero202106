package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposTextoInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("Juan").into(NOMBRE),
                Enter.keyValues("Hernández").into(APELLIDO),
                Enter.keyValues("juan@mail.com").into(EMAIL),
                Scroll.to(MOBILE),
                Enter.keyValues("9876541238").into(MOBILE),
                Scroll.to(SUBJECTS),
                Enter.keyValues("English").into(SUBJECTS),
                Scroll.to(CURRENT_ADDRESS),
                Enter.keyValues("Avenida Siempre viva 123").into(CURRENT_ADDRESS)
        );
    }

    public static CamposTextoInteractions camposTextoInteractions() {
        return instrumented(CamposTextoInteractions.class);
    }

}
