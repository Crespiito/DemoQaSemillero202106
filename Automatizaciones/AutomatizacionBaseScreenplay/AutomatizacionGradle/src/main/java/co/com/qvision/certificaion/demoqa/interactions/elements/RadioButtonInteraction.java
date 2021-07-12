package co.com.qvision.certificaion.demoqa.interactions.elements;

import co.com.qvision.certificaion.demoqa.models.RadioButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.qvision.certificaion.demoqa.user_interfaces.RadioButtonPage.RB_YES;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class RadioButtonInteraction implements Interaction {

RadioButtonModel radioButtonModel;

    public RadioButtonInteraction(RadioButtonModel radioButtonModel) {
        this.radioButtonModel = radioButtonModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(RB_YES.of(radioButtonModel.getBoton()))

        );
    }

    public  static RadioButtonInteraction radioButtonSelect(RadioButtonModel radioButtonModel){
        return instrumented(RadioButtonInteraction.class,radioButtonModel);
    }
}
