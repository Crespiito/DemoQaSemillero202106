package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.SeleccionarOpcionesInicialesInteraction.seleccionarOpcionesInicialesInteraction;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class SeleccionarOpcionTask implements Task {

    String tarjeta;
    String subMenu;

    public SeleccionarOpcionTask(String tarjeta, String subMenu) {
        this.tarjeta = tarjeta;
        this.subMenu = subMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                seleccionarOpcionesInicialesInteraction(tarjeta,subMenu)
        );
    }

    public static SeleccionarOpcionTask seleccionarOpcion(String tarjeta, String subMenu) {
        return instrumented(SeleccionarOpcionTask.class,tarjeta,subMenu);
    }
}
