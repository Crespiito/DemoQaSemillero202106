package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import javax.security.auth.Subject;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposTextInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Enter.theValue("ana").into(NOMBRE),
                Enter.theValue("pedraza").into(APELLIDO),
                Enter. theValue("anamariap@correo.com").into(CORREO),
                    Click.on(GENDER),
                    Enter.theValue("234325245").into(NUMBER),
                    Scroll.to(SUBJECT),
                    Enter.theValue("English").into(SUBJECT),
                    Hit.the(Keys.ENTER).keyIn(SUBJECT),
                    Click.on(HOBBIES),
                    Enter.theValue("Hello dude , we are try to run the system , bye").into(CURRENT_ADRESS)

        );


    }

    public static CamposTextInteraction camposTextInteraction(){
        return instrumented(CamposTextInteraction.class);
    }
}
