package co.com.qvision.certificaion.demoqa.interactions.forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.forms.FormPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposTextInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                Enter.theValue("ana").into(NOMBRE),

                Enter.theValue("pedraza").into(APELLIDO),

                Enter. theValue("anamariap@correo.com").into(CORREO),
                Click.on(GENDER),

                Enter.theValue("3216549871").into(NUMBER),

                    Scroll.to(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Enter.keyValues("10 Jun 1990").into(FECHA),
                    Hit.the(Keys.ENTER).keyIn(FECHA),

                    Scroll.to(SUBJECT),
                    Enter.theValue("English").into(SUBJECT),
                    Hit.the(Keys.ENTER).keyIn(SUBJECT),

                    Click.on(HOBBIES),

                    Enter.theValue("AV CARRERA 30 #5 A 17").into(CURRENT_ADRESS),


                    Click.on(STATEDSELECT),
                    Click.on(STATED),
                    Click.on(CITYSELECT),
                    Click.on(CITY),
                    Click.on(SUBMIT)


        );
    }

    public static CamposTextInteraction camposTextInteraction(){
        return instrumented(CamposTextInteraction.class);
    }
}
