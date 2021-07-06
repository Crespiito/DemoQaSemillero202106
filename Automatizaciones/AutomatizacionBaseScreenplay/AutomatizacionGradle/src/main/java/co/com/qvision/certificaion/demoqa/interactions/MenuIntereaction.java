package co.com.qvision.certificaion.demoqa.interactions;

import co.com.qvision.certificaion.demoqa.models.MenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.qvision.certificaion.demoqa.user_interfaces.NewMenuPage.btn_FORM;
import static co.com.qvision.certificaion.demoqa.user_interfaces.NewMenuPage.btn_LATERAl;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class MenuIntereaction implements Interaction {

   String modulo;
   String item;

    public MenuIntereaction(String modulo, String item) {
        this.modulo = modulo;
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(btn_FORM.of(modulo)),
                Click.on(btn_FORM.of(modulo)),
                Scroll.to(btn_LATERAl.of(item)),
                Click.on(btn_LATERAl.of(item))
        );


    }
    public static MenuIntereaction seleccionarOpcion(String modulo, String item){
        return instrumented(MenuIntereaction.class,modulo,item);
    }
}
