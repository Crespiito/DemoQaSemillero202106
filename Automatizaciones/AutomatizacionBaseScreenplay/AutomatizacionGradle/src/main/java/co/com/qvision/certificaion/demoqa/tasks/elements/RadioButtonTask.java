package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.CampoRadioButtonInteraction;
import co.com.qvision.certificaion.demoqa.models.RadioButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class RadioButtonTask implements Task {

    public RadioButtonModel datosRB;

    public RadioButtonTask(RadioButtonModel datosRB) {
        this.datosRB = datosRB;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CampoRadioButtonInteraction.campoRadioButtonInteraction(datosRB));
    }

    public static RadioButtonTask radioButtonTask(RadioButtonModel datosRB){
        return Tasks.instrumented(RadioButtonTask.class, datosRB);
    }
}
