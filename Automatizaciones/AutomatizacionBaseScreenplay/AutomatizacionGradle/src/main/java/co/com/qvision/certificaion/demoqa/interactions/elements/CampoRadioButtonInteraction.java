package co.com.qvision.certificaion.demoqa.interactions.elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;


import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.RadioButtonPage.*;


public class CampoRadioButtonInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

               Click.on(RADIO_YES),
                Click.on(RADIO_IMPRESSIVE),
                Click.on(NO)



        );
    }

    public static CampoRadioButtonInteraction campoRadioButtonInteraction(){
        return Tasks.instrumented(CampoRadioButtonInteraction.class);
    }
}
