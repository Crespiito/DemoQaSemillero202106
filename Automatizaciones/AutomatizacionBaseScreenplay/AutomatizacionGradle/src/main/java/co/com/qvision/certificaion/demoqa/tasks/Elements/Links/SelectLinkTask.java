package co.com.qvision.certificaion.demoqa.tasks.Elements.Links;

import co.com.qvision.certificaion.demoqa.interactions.Elements.Links.SelectLinkInteraction;
import co.com.qvision.certificaion.demoqa.interactions.Elements.Links.SetLinkCaseInteraction;
import co.com.qvision.certificaion.demoqa.models.Elements.Links.LinksData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectLinkTask implements Task {

 /*   LinksData datos;

    public SelectLinkTask(LinksData datos) {
        this.datos = datos;
    }
*/
    @Override
    public <T extends Actor> void performAs(T actor) {
      //  actor.remember("datos", datos);
       // Serenity.setSessionVariable("datos").to(datos);
        actor.attemptsTo(

                SelectLinkInteraction.selectLinkInteraction()
               // SetLinkCaseInteraction.setLinkCaseInteraction()
        );

    }
/*
    public static SelectLinkTask selectLinkTask(LinksData datos) {
        return Tasks.instrumented(SelectLinkTask.class, datos);
        }
        }
*/

   public static SelectLinkTask selectLinkTask(){
        return Tasks.instrumented(SelectLinkTask.class);
    }

    }

