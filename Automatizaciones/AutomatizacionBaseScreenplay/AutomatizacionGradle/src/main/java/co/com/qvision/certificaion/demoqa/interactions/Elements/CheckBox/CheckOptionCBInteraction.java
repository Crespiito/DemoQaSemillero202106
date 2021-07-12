package co.com.qvision.certificaion.demoqa.interactions.Elements.CheckBox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.*;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ELEMENTS;

public class CheckOptionCBInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_ELEMENTS),
                Scroll.to(TARJETA_ELEMENTS),
                Click.on(TARJETA_ELEMENTS),
                Scroll.to(BOTON_CHECKBOX),
                Click.on(BOTON_CHECKBOX),

                Scroll.to(SELECCIONAR_HOME),
                Click.on(SELECCIONAR_HOME),

                Scroll.to(SELECCIONAR_DESKTOP),
                Click.on(SELECCIONAR_DESKTOP),

                Scroll.to(SELECCIONAR_DOCUMENTS),
                Click.on(SELECCIONAR_DOCUMENTS),

                Scroll.to(SELECCIONAR_WORKSPACE),
                Click.on(SELECCIONAR_WORKSPACE),


                Scroll.to(SELECCIONAR_REACT),
                Click.on(SELECCIONAR_REACT),
                Scroll.to(SELECCIONAR_ANGULAR),
                Click.on(SELECCIONAR_ANGULAR),
                Scroll.to(SELECCIONAR_VUE),
                Click.on(SELECCIONAR_VUE),


                Scroll.to(SELECCIONAR_OFFICE),
                Click.on(SELECCIONAR_OFFICE),

                Scroll.to(SELECCIONAR_PUBLIC),
                Click.on(SELECCIONAR_PUBLIC),
                Scroll.to(SELECCIONAR_PRIVATE),
                Click.on(SELECCIONAR_PRIVATE),
                Scroll.to(SELECCIONAR_CLASSIFIED),
                Click.on(SELECCIONAR_CLASSIFIED),
                Scroll.to(SELECCIONAR_GENERAL),
                Click.on(SELECCIONAR_GENERAL),


                Scroll.to(SELECCIONAR_DOWNLOADS),
                Click.on(SELECCIONAR_DOWNLOADS),

                Scroll.to(SELECCIONAR_WORD_FILE),
                Click.on(SELECCIONAR_WORD_FILE),
                Scroll.to(SELECCIONAR_EXCEL_FILE),
                Click.on(SELECCIONAR_EXCEL_FILE)
                );
    }


    public static CheckOptionCBInteraction checkCBInteraction(){
        return Tasks.instrumented(CheckOptionCBInteraction.class);
    }
}
