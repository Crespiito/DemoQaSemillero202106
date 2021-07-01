package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.CamposTextoInteraction;
import co.com.qvision.certificaion.demoqa.interactions.EnviarFormulario;
import co.com.qvision.certificaion.demoqa.models.FormData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LlenarFormulario implements Task {
    FormData datos;

    public LlenarFormulario(FormData datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("datos",datos);
        Serenity.setSessionVariable("datos").to(datos);
        actor.attemptsTo(CamposTextoInteraction.camposTextoInteraction(),
                EnviarFormulario.enviarFormulario()
        );

    }

    public static LlenarFormulario llenarFormulario(FormData datos){
        return Tasks.instrumented(LlenarFormulario.class ,datos);
    }
}
