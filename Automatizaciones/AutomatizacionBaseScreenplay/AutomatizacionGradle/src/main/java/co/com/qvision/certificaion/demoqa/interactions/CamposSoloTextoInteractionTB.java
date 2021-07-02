package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.*;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.EMAIL;
import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.FULL_NAME;
import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.CURRENT_ADDRESS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.SUBMIT;

public class CamposSoloTextoInteractionTB implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_TEXTBOX),
                Scroll.to(FULL_NAME),
                Enter.theValue("holisssssss").into(FULL_NAME),
                Enter.theValue("hola@queteimporta.com").into(EMAIL),

                Enter.theValue("123 ABCD").into(CURRENT_ADDRESS),
                Enter.theValue("123 ABCD").into(PERMANENT_ADDRESS),

                Scroll.to(SUBMIT),
                Click.on(SUBMIT)

        );
    }

    public static CamposSoloTextoInteractionTB camposSoloTextoInteraction(){
        return Tasks.instrumented(CamposSoloTextoInteractionTB.class);
    }
}
