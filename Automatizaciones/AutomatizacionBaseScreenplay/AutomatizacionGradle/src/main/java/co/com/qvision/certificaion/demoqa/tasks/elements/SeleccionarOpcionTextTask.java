package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.CamposTextBoxInteraction;
import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarOpcionTextTask implements Task {

    TextBoxModel datosTB;

    public SeleccionarOpcionTextTask(TextBoxModel datosTB) {
        this.datosTB = datosTB;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CamposTextBoxInteraction.camposTextBoxInteraction(datosTB)
        );

    }

    public static SeleccionarOpcionTextTask seleccionarOpcionTextTask(TextBoxModel datosTB){

        return Tasks.instrumented(SeleccionarOpcionTextTask.class, datosTB);
    }
}
