package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.forms.SeleccionarOpcionesInicialesInteraction;

import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionMenuTask implements Task {

    OpcionMenuModel opciones;

    public SeleccionarOpcionMenuTask(OpcionMenuModel opciones) {
        this.opciones = opciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeleccionarOpcionesInicialesInteraction.menu(opciones));
    }

    public static SeleccionarOpcionMenuTask menu(OpcionMenuModel opciones){
        return instrumented(SeleccionarOpcionMenuTask.class, opciones);
    }

}