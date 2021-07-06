package co.com.qvision.certificaion.demoqa.interactions.forms;

import co.com.qvision.certificaion.demoqa.models.DataForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPages.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class CamposTextoInteraction implements Interaction {
String genero;
    DataForm dataForm;


    public CamposTextoInteraction(DataForm dataForm) {
        this.dataForm = dataForm;
    }


    public String defineGenero(){
        switch (dataForm.getGenero()){
            case ("Male"):
                genero = "1";
                break;
            case ("Female"):
                genero = "2";
                break;
            default:
                genero = "3";
                break;

        }
        return genero;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

              Enter.theValue(dataForm.getNombre()).into(NOMBRE),
              Enter.theValue(dataForm.getApellido()).into(APELLIDO),
              Enter.theValue(dataForm.getCorreo()).into(CORREO),
              Click.on(GENERO.of(defineGenero())),
              Enter.theValue(dataForm.getMobil()).into(MOVIL),
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
              Scroll.to(CUMPLE),
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
    public static CamposTextoInteraction llenarFormularioInteraction(DataForm dataForm){

        return instrumented(CamposTextoInteraction.class,dataForm);
    }
}
