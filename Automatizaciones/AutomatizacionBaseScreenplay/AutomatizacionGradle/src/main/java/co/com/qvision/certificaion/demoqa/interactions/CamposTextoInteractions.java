package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposTextoInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("Hola").into(NOMBRE),
                Enter.keyValues("Hola apellido").into(APELLIDO),
                Enter.keyValues("Hola correo").into(EMAIL)
        );
    }

    public static CamposTextoInteractions camposTextoInteractions(){
        return instrumented(CamposTextoInteractions.class);
    }

}
