package co.com.qvision.certificaion.demoqa.interactions.elements;

import co.com.qvision.certificaion.demoqa.user_interfaces.elements.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.TextBoxPage.*;
import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.TextBoxPage.CURRENT_ADRESS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.forms.FormPage.*;


public class CamposTextBoxInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("CAMILA ESTRABAO").into(NOMBRES),
                Enter.theValue("camz@fith.com").into(CORREOS),
                Enter.theValue("Broadway 23 WS ").into(CURRENT_ADRESS),
                Enter.theValue("HOLLYWOOD 12 WE").into(PERMANENT_AD),
                Click.on(SUBMIT)

        );

    }
    public static CamposTextBoxInteraction camposTextBoxInteraction(){
        return Tasks.instrumented(CamposTextBoxInteraction.class);
    }
}
