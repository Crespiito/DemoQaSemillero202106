package co.com.qvision.certificaion.demoqa.tasks;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.interactions.ClickEnBotonesInteractions.clickEnBotonesInteractions;
import static co.com.qvision.certificaion.demoqa.interactions.LlenarTextBoxInteractions.llenarTextBox;
import static co.com.qvision.certificaion.demoqa.interactions.SubMenuInteractions.seleccionarSubMenu;
import static co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalInteractions.tarjetaMenuPrincipal;
import static co.com.qvision.certificaion.demoqa.tasks.IngresarAModuloYSubmenuTask.seleccionarMenu;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePage.BTN_TARJETA_ELEMENTS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_SUB_MENU_TEXT_BOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarFormularioTextBoxTask implements Task {

     @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Directo de UserInterface
                Scroll.to(BTN_TARJETA_ELEMENTS),
                Click.on(BTN_TARJETA_ELEMENTS),
                Scroll.to(LBL_LEFT_SUB_MENU_TEXT_BOX),
                Click.on(LBL_LEFT_SUB_MENU_TEXT_BOX),
                llenarTextBox(),
                clickEnBotonesInteractions()
        );

    }

    public static DiligenciarFormularioTextBoxTask llenarFormularioTxtBox() {
        return instrumented(DiligenciarFormularioTextBoxTask.class);
    }
}
