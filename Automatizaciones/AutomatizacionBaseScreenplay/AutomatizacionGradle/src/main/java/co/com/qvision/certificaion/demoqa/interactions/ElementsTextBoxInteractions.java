package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.LBL_LEFT_SUB_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElementsTextBoxInteractions implements Interaction {

    String submenu;

    public ElementsTextBoxInteractions(String submenu) {
        this.submenu = submenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LBL_LEFT_SUB_MENU.of(submenu)),
                Click.on(LBL_LEFT_SUB_MENU.of(submenu))
        );
    }

    public static ElementsTextBoxInteractions seleccionarTextBox(String submenu) {
        return instrumented(ElementsTextBoxInteractions.class, submenu);
    }
}
