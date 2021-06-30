package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.MenuIntereaction;
import co.com.qvision.certificaion.demoqa.interactions.elements.ValidarTextBoxInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class MenuTask implements Task {
    String opcion;
    String opcion2;

   public MenuTask(String opcion,String opcion2) {

       this.opcion = opcion;
       this.opcion2 = opcion2;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(MenuIntereaction.seleccionarOpcion(opcion,opcion2));
    }

    public static MenuTask seleccionarOpcion(String opcion,String opcion2){

        return instrumented(MenuTask.class,opcion,opcion2);
    }
}
