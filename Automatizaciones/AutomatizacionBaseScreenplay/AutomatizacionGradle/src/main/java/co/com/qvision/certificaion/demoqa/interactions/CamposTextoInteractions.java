package co.com.qvision.certificaion.demoqa.interactions;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposTextoInteractions implements Interaction {

    FormDataModel opcion;

    public CamposTextoInteractions(FormDataModel opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(opcion.getNombre()).into(NOMBRE),
                Enter.keyValues(opcion.getApellido()).into(APELLIDO),
                Enter.keyValues(opcion.getEmail()).into(EMAIL),
                Scroll.to(MOBILE),
                Enter.keyValues(opcion.getMobile()).into(MOBILE),
                Scroll.to(SUBJECTS),
                Enter.keyValues(opcion.getSubject()).into(SUBJECTS),
                Hit.the(Keys.ENTER).keyIn(SUBJECTS),
                Scroll.to(CURRENT_ADDRESS),
                Enter.keyValues(opcion.getCurrentAddress()).into(CURRENT_ADDRESS)
        );
    }

    public static CamposTextoInteractions camposTextoInteractions(FormDataModel opcion) {
        return instrumented(CamposTextoInteractions.class,opcion);
    }

}
