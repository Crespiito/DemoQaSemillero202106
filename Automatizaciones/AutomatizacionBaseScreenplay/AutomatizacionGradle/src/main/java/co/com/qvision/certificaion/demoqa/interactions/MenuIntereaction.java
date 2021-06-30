package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.qvision.certificaion.demoqa.user_interfaces.NewMenuPage.btn_FORM;
import static co.com.qvision.certificaion.demoqa.user_interfaces.NewMenuPage.btn_LATERAl;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class MenuIntereaction implements Interaction {

    public MenuIntereaction(String opcion, String opcion2) {
        this.opcion = opcion;
        this.opcion2 = opcion2;
    }

    String opcion;
    String opcion2;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(btn_FORM.of(opcion)),
                Click.on(btn_FORM.of(opcion)),
                Click.on(btn_LATERAl.of(opcion2))
        );


    }
    public static MenuIntereaction seleccionarOpcion(String opcion,String opcion2){
        return instrumented(MenuIntereaction.class,opcion,opcion2);
    }
}
