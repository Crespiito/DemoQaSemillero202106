package co.com.qvision.certificaion.demoqa.interactions.elements;

import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPages.SUBMIT;
import static co.com.qvision.certificaion.demoqa.user_interfaces.TextBoxPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarTextBoxInteraction implements Interaction {
TextBoxModel textBoxModel;

    public ValidarTextBoxInteraction(TextBoxModel textBoxModel) {
        this.textBoxModel = textBoxModel;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

      actor.attemptsTo(
              Enter.theValue(textBoxModel.getFullName()).into(USERFISRTNAME),
              Enter.theValue(textBoxModel.getEmail()).into(USEREMAIL),
              Enter.theValue(textBoxModel.getCurrentAdress()).into(USERCURRENTADRESS),
              Scroll.to(USERCURRENTADRESS),
              Enter.theValue(textBoxModel.getPermantenAdress()).into(USERPERMANTENTADRESS),
              Click.on(SUBMIT)


      );

    }

    public static  ValidarTextBoxInteraction validarTextBoxInteraction(TextBoxModel textBoxModel){
        return instrumented(ValidarTextBoxInteraction.class,textBoxModel);
    }
}
