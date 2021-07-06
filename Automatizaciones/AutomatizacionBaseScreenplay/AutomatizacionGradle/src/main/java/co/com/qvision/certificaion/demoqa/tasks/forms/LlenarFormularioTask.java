package co.com.qvision.certificaion.demoqa.tasks.forms;

import co.com.qvision.certificaion.demoqa.interactions.forms.CamposTextoInteraction;
import co.com.qvision.certificaion.demoqa.models.DataForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LlenarFormularioTask implements Task {

     DataForm dataForm;

    public LlenarFormularioTask(DataForm dataForm) {
        this.dataForm = dataForm;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(CamposTextoInteraction.llenarFormularioInteraction(dataForm));

    }
    public static LlenarFormularioTask llenarFormularioTask(DataForm dataForm){

        return instrumented(LlenarFormularioTask.class,dataForm);
    }
}
