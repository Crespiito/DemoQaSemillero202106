package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.ElementsTextBoxInteractions.seleccionarTextBox;
import static co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalElementsInteractions.tarjetaMenuPrincipalElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAModuloYSubmenu implements Task {

    String opcion;
    String submenu;

    public IngresarAModuloYSubmenu(String opcion, String submenu) {
        this.opcion = opcion;
        this.submenu = submenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                tarjetaMenuPrincipalElements(opcion),
                seleccionarTextBox(submenu)

        );
    }

    public static IngresarAModuloYSubmenu seleccionarMenu(String opcion, String submenu){
        return instrumented (IngresarAModuloYSubmenu.class,opcion,submenu);
    }
}
