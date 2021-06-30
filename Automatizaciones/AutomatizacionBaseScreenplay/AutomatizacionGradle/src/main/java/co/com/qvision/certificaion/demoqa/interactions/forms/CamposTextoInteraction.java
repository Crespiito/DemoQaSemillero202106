package co.com.qvision.certificaion.demoqa.interactions.forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPages.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class CamposTextoInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(

              Enter.theValue("Miguel").into(NOMBRE),
              Enter.theValue("Bautista").into(APELLIDO),
              Enter.theValue("angel@hotmail.com").into(CORREO),
              Click.on(GENERO),
              Enter.theValue("31332264545").into(MOVIL),
              Click.on(CUMPLE),
              DoubleClick.on(CUMPLE),
              Hit.the(Keys.DELETE).keyIn(CUMPLE),
              DoubleClick.on(CUMPLE),
              Hit.the(Keys.DELETE).keyIn(CUMPLE),
              DoubleClick.on(CUMPLE),
              Hit.the(Keys.DELETE).keyIn(CUMPLE),
              DoubleClick.on(CUMPLE),
              Hit.the(Keys.DELETE).keyIn(CUMPLE),
              DoubleClick.on(CUMPLE),
              Enter.keyValues("02 Jan 1993").into(CUMPLE),
              Hit.the(Keys.ENTER).keyIn(CUMPLE),
              Scroll.to(NOMBRE),
              //Enter.theValue("algo").into(SUBJECT),
              Click.on(READING),
              Click.on(MUSIC),
              Scroll.to(MUSIC),
              Enter.theValue("calle de queens").into(ADRESS),
              Scroll.to(ADRESS),
              Click.on(STATEDSELECT),
              Click.on(STATED),
              Click.on(CITYSELECT),
              Click.on(CITY),
              Click.on(SUBMIT)
      );
    }
    public static CamposTextoInteraction llenarFormularioInteraction(){

        return instrumented(CamposTextoInteraction.class);
    }
}
