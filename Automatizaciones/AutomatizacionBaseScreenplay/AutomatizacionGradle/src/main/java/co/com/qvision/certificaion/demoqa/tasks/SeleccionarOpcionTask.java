package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalnteraction;
import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionTask implements Task {

    OpcionesMenuModel opciones;


    public SeleccionarOpcionTask(OpcionesMenuModel opciones) {
        this.opciones = opciones;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(TarjetaPrincipalnteraction.seleccion(opciones));
    }


    public static SeleccionarOpcionTask menu(OpcionesMenuModel opciones){
        return instrumented(SeleccionarOpcionTask.class,opciones);
    }



}
