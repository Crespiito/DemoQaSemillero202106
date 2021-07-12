package co.com.qvision.certificaion.demoqa.tasks.Elements.TextBox;

import co.com.qvision.certificaion.demoqa.interactions.Elements.TextBox.CamposSoloTextoInteractionTB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LlenarSoloTexto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CamposSoloTextoInteractionTB.camposSoloTextoInteraction()
        );
    }

    public static LlenarSoloTexto llenarSoloTexto(){
        return Tasks.instrumented(LlenarSoloTexto.class);
    }
}
