package co.com.qvision.certificaion.demoqa.tasks.forms;

import co.com.qvision.certificaion.demoqa.interactions.forms.CamposTextInteraction;
import co.com.qvision.certificaion.demoqa.interactions.forms.EnviarFormuarioInteraction;
import co.com.qvision.certificaion.demoqa.models.FormData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class LlenarFormularioTask implements Task {

    FormData datos;

    public LlenarFormularioTask(FormData datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(CamposTextInteraction.camposTextInteraction(datos)

        );
    }
    public static LlenarFormularioTask llenarFormularioTask(FormData datos){
        return Tasks.instrumented(LlenarFormularioTask.class, datos);
    }

}
