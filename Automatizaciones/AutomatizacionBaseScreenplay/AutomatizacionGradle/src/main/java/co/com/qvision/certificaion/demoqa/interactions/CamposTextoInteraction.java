package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormsUI.*;

public class CamposTextoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("juan").into(NOMBRE),
                Enter.theValue("bautista").into(APELLIDO),
                Enter.theValue("hola@queteimporta.com").into(EMAIL),
                Click.on(GENDER),
                Enter.theValue("1234567890").into(MOBILE),



                //Bloque para elegir fecha de cumpleaños
                Scroll.to(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Enter.keyValues("12 jan 2000").into(DATE_BIRTH),
                Hit.the(Keys.ENTER).keyIn(DATE_BIRTH),

                Enter.theValue("English").into(SUBJECTS),
                Hit.the(Keys.ENTER).keyIn(SUBJECTS),

                Scroll.to(HOBBIES),
                Click.on(HOBBIES),

                Enter.theValue("abc 123 ").into(CURRENT_ADDRESS),

                Scroll.to(SELECT_STATE),
                Click.on(SELECT_STATE),
                Click.on(OPTION_STATE),
                Scroll.to(SELECT_CITY),
                Click.on(SELECT_CITY),
                Click.on(OPTION_CITY)

               // Scroll.to(SUBMIT),
                //Click.on(SUBMIT)









        );

    }

    public static CamposTextoInteraction camposTextoInteraction(){
        return Tasks.instrumented(CamposTextoInteraction.class);
    }
}
