package co.com.qvision.certificaion.demoqa.interactions.Elements.Links;

import co.com.qvision.certificaion.demoqa.models.Elements.Links.LinksData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.LINK_POR_ID;

public class SetLinkCaseInteraction implements Interaction {

    LinksData datos;
    String link;
   // String mensaje;

    //Case para seleccion de link debido al tipo de seleccion y mapeo
    public void setLink(){
        switch(datos.getLink()){
            case ("Home"):
                link = "simpleLink";
                break;
            case ("HomeROugE"):
                link = "dynamicLink";
                break;
            case ("Created"):
                link ="created" ;
                break;
            case ("No Content"):
                link = "no-content";
                break;
            case ("Moved"):
                link = "moved";
                break;
            case ("Bad Request"):
                link = "bad-request";
                break;
            case ("Unauthorized"):
                link ="unauthorized" ;
                break;
            case ("Forbidden"):
                link = "forbidden";
                break;
            case ("Not Found"):
                link ="invalid-url" ;
                break;


        }
    }






    @Override
    public <T extends Actor> void performAs(T actor) {
        datos = actor.recall("datos");
        datos = Serenity.sessionVariableCalled("datos");
        setLink();
        actor.attemptsTo(
                Scroll.to(LINK_POR_ID.of(link)),
                Click.on(LINK_POR_ID.of(link))
        );

    }

    public static SetLinkCaseInteraction setLinkCaseInteraction(){
        return Tasks.instrumented(SetLinkCaseInteraction.class);
    }
}
