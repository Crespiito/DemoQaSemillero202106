package co.com.qvision.certificacion.demoqa.stepdefinitions;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.qvision.certificaion.demoqa.tasks.IngresarAModuloYSubmenu.seleccionarMenu;

public class AccederModuloElements {
    @Dado("Yo como usuario ingrese a la Tarjeta y el submenu Seleccionado")
    public void yoComoUsuarioIngreseALaTarjetaYElSubmenuSeleccionado(OpcionesMenuModel opciones) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                seleccionarMenu(opciones.getOpcion(),opciones.getSubmenu())
        );
    }

    @Cuando("Selecciono el submenu Text_Box")
    public void seleccionoElSubmenuTextBox() {

    }

    @Entonces("Se visualizara su contenido")
    public void seVisualizaraSuContenido() {

    }


}
