package co.com.qvision.certificaion.demoqa.interactions.elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.qvision.certificaion.demoqa.user_interfaces.RadioButtonPage.RB_YES;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class RadioButtonInteraction implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(RB_YES),
                Click.on(RB_YES)

        );
    }

    public  static RadioButtonInteraction radioButtonSelect(){
        return instrumented(RadioButtonInteraction.class);
    }
}
