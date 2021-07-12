package co.com.qvision.certificaion.demoqa.interactions.Elements.Links;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.*;
import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ELEMENTS;

public class SelectLinkInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LINK_HOME),
                Click.on(LINK_HOME),

                Scroll.to(LINK_HOME_DINAMIC),
                Click.on(LINK_HOME_DINAMIC),

                Scroll.to(LINK_CREATED),
                Click.on(LINK_CREATED),

                Scroll.to(LINK_NOCONTENT),
                Click.on(LINK_NOCONTENT),

                Scroll.to(LINK_MOVED),
                Click.on(LINK_MOVED),

                Scroll.to(LINK_BADREQUEST),
                Click.on(LINK_BADREQUEST),

                Scroll.to(LINK_UNAUTHORIZED),
                Click.on(LINK_UNAUTHORIZED),

                Scroll.to(LINK_FORBIDDEN),
                Click.on(LINK_FORBIDDEN),

                Scroll.to(LINK_NOTFOUND),
                Click.on(LINK_NOTFOUND)

                );

    }

    public static SelectLinkInteraction selectLinkInteraction(){
        return Tasks.instrumented(SelectLinkInteraction.class);
    }
}
