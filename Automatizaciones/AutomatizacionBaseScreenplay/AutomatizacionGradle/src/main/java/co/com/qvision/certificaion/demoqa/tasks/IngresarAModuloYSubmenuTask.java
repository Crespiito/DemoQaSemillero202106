package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.SubMenuInteractions.seleccionarSubMenu;
import static co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalInteractions.tarjetaMenuPrincipal;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAModuloYSubmenuTask implements Task {

    String opcion;
    String submenu;

    public IngresarAModuloYSubmenuTask(String opcion, String submenu) {
        this.opcion = opcion;
        this.submenu = submenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                tarjetaMenuPrincipal(opcion),
                seleccionarSubMenu(submenu)

        );
    }

    public static IngresarAModuloYSubmenuTask seleccionarMenu(String opcion, String submenu){
        return instrumented (IngresarAModuloYSubmenuTask.class,opcion,submenu);
    }
}
