package co.com.qvision.certificaion.demoqa.interactions;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposListasInteraction implements Interaction {

    FormDataModel opcion;

    public CamposListasInteraction(FormDataModel opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DEPARTAMENTOS),
                Click.on(DEPARTAMENTOS),
                Click.on(SELECCIONAR_DEPARTAMENTOS),


                Scroll.to(CITY),
                Click.on(CITY),
                Click.on(SELECCIONAR_CITY)

        );
    }

    public static CamposListasInteraction camposListasInteraction(FormDataModel opcion) {
        return instrumented(CamposListasInteraction.class,opcion);
    }
}
