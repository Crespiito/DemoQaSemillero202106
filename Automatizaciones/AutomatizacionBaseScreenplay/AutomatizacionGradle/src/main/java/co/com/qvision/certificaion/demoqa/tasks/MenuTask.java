package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.MenuIntereaction;
import co.com.qvision.certificaion.demoqa.interactions.elements.ValidarTextBoxInteraction;
import co.com.qvision.certificaion.demoqa.models.MenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class MenuTask implements Task {

    String modulo;
    String item;

    public MenuTask(String modulo, String item) {
        this.modulo = modulo;
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(MenuIntereaction.seleccionarOpcion(modulo,item));
    }

    public static MenuTask seleccionarOpcion(String modulo, String item){

        return instrumented(MenuTask.class,modulo,item);
    }
}
