package co.com.qvision.certificaion.demoqa.interactions.Forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormsUI.BOTON_PRACTICEFORM;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_FORMS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarjetaPrincipalInteraction implements Interaction {


    //Llenar Formulario en Forms - Practice forms
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_FORMS),
                Click.on(TARJETA_FORMS),
                Click.on(BOTON_PRACTICEFORM)
        );
    }


    public static TarjetaPrincipalInteraction seleccion() {
        return instrumented(TarjetaPrincipalInteraction.class);
    }
}


