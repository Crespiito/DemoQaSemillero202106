package co.com.qvision.certificaion.demoqa.interactions.forms;

import co.com.qvision.certificaion.demoqa.models.FormData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.forms.FormPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposTextInteraction implements Interaction {

    FormData datos;
    String genero;

    public CamposTextInteraction(FormData datos) {
        this.datos = datos;
    }

    private void setGenero() {
        switch(datos.getGenero()){
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

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            setGenero();

            actor.attemptsTo(
                Enter.theValue(datos.getNombre()).into(NOMBRE),

                Enter.theValue(datos.getApellido()).into(APELLIDO),

                Enter. theValue(datos.getCorreo()).into(CORREO),

                Click.on(GENDER.of(genero)),

                Enter.theValue(datos.getTelefono()).into(NUMBER),

                    Scroll.to(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Hit.the(Keys.DELETE).keyIn(FECHA),
                    DoubleClick.on(FECHA),
                    Enter.keyValues("24 Aug 1963").into(FECHA),
                    Hit.the(Keys.ENTER).keyIn(FECHA),

                    Scroll.to(SUBJECT),
                    Enter.theValue("English").into(SUBJECT),
                    Hit.the(Keys.ENTER).keyIn(SUBJECT),

                    Click.on(HOBBIES),

                    Enter.theValue("AV CARRERA 30 #5 A 17").into(CURRENT_ADRESS),


                    Click.on(STATEDSELECT),
                    Click.on(STATED),
                    Click.on(CITYSELECT),
                    Click.on(CITY),
                    Click.on(SUBMIT)


        );
    }



    public static CamposTextInteraction camposTextInteraction(FormData datos){
        return instrumented(CamposTextInteraction.class, datos);
    }
}
