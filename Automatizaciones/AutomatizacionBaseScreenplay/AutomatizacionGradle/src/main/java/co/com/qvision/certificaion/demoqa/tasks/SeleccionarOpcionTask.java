package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalInteraction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionTask implements Task {

    private static SeleccionarOpcionTask instrumented;

    String opcion;

    public SeleccionarOpcionTask(String opcion){

        this.opcion = opcion;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((TarjetaPrincipalInteraction.seleccion(opcion)));


    }


    public static SeleccionarOpcionTask menu(String opcion){

        return instrumented(SeleccionarOpcionTask.class,opcion);
    }

}