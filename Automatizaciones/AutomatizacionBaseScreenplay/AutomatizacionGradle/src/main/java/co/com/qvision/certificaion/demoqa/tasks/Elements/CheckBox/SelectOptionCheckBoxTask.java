package co.com.qvision.certificaion.demoqa.tasks.Elements.CheckBox;


import co.com.qvision.certificaion.demoqa.interactions.Elements.CheckBox.SelectTarjetaCBInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectOptionCheckBoxTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectTarjetaCBInteraction.seleccionar());
    }

    public static SelectOptionCheckBoxTask seleccionarOpcion() {
        return Tasks.instrumented(SelectOptionCheckBoxTask.class);
    }
}
