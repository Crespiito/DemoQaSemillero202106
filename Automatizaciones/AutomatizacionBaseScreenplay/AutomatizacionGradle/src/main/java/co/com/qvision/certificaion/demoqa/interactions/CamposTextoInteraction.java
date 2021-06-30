package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPage.*;

public class CamposTextoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("juan").into(NOMBRE),
                Enter.theValue("bautista").into(APELLIDO),
                Enter.theValue("hola@cooreo.hola").into(CORREO),
                Click.on(GENERO),
                Enter.theValue("3333333351").into(NUMERO)
                );
    }

    public static CamposTextoInteraction camposTextoInteraction(){
        return Tasks.instrumented(CamposTextoInteraction.class);
    }
}
