package co.com.qvision.certificaion.demoqa.interactions.elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPages.*;
import static co.com.qvision.certificaion.demoqa.user_interfaces.TextBoxPage.FISRTNAME;
import static co.com.qvision.certificaion.demoqa.user_interfaces.TextBoxPage.PERMANTENTADRESS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarTextBoxInteraction implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

      actor.attemptsTo(
         Enter.theValue("Angel").into(FISRTNAME),
              Enter.theValue("miguel@hotmail.com").into(CORREO),
              Enter.theValue("tokio").into(ADRESS),
              Scroll.to(ADRESS),
              Enter.theValue("USMEKISTAN").into(PERMANTENTADRESS),
              Click.on(SUBMIT)


      );

    }

    public static  ValidarTextBoxInteraction validarTextBoxInteraction(){
        return instrumented(ValidarTextBoxInteraction.class);
    }
}
