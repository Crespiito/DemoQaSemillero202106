package co.com.qvision.certificaion.demoqa.interactions.elements;

import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.TextBoxPage.*;
import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.TextBoxPage.CURRENT_ADRESS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.forms.FormPage.SUBMIT;


public class CamposTextBoxInteraction implements Interaction {

    TextBoxModel datosTB;

    public CamposTextBoxInteraction(TextBoxModel datosTB) {
        this.datosTB = datosTB;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosTB.getNombre()).into(NOMBRES),
                Enter.theValue(datosTB.getEmail()).into(CORREOS),
                Enter.theValue(datosTB.getCurrentAdress()).into(CURRENT_ADRESS),
                Enter.theValue(datosTB.getPermanentAdress()).into(PERMANENT_AD),
                Scroll.to(PERMANENT_AD),
                Click.on(SUBMIT)

        );

    }
    public static CamposTextBoxInteraction camposTextBoxInteraction(TextBoxModel datosTB){
        return Tasks.instrumented(CamposTextBoxInteraction.class, datosTB);
    }
}
