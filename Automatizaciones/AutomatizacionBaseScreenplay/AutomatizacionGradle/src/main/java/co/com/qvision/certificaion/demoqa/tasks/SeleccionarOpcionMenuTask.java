package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.forms.SeleccionarOpcionesInicialesInteraction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionMenuTask implements Task {

    String opcion;
    String opcion2;


    public SeleccionarOpcionMenuTask(String opcion, String opcion2){

        this.opcion = opcion;
        this.opcion2 = opcion2;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeleccionarOpcionesInicialesInteraction.menu(opcion, opcion2));
    }

    public static SeleccionarOpcionMenuTask menu(String opcion,String opcion2){
        return instrumented(SeleccionarOpcionMenuTask.class,opcion,opcion2);
    }

}