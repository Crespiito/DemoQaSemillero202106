package co.com.qvision.certificaion.demoqa.interactions.elements;

import co.com.qvision.certificaion.demoqa.models.ButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.DoubleClick;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.interactions.Actions;




import static co.com.qvision.certificaion.demoqa.user_interfaces.ButtonPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ButtonInteraction implements Interaction {
  ButtonModel buttonModel;






    public ButtonInteraction(ButtonModel buttonModel) {
        this.buttonModel = buttonModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       switch (buttonModel.getBoton()){

           case ("Double Click Me"):
               actor.attemptsTo(DoubleClick.on(BTN_DOUBLE));
               break;
           case ("Right Click Me"):

               Actions a = new Actions(BrowseTheWeb.as(actor).getDriver());
               a.contextClick(BrowseTheWeb.as(actor).getDriver().findElement(By.xpath("//*[@id=\"rightClickBtn\"]"))).perform();
               break;
           case ("Click Me"):
               actor.attemptsTo(Click.on(BTN_CLICK));
               break;
           default:
               break;

       }

    }
    public  static  ButtonInteraction buttonInteraction(ButtonModel buttonModel){
        return instrumented(ButtonInteraction.class,buttonModel);
    }
}
