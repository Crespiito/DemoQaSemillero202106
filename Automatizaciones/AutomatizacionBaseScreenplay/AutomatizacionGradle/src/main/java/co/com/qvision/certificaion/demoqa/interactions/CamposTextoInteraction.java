package co.com.qvision.certificaion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import co.com.qvision.certificaion.demoqa.models.FormData;
import net.serenitybdd.core.Serenity;


import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.SUBMIT;
import static co.com.qvision.certificaion.demoqa.user_interfaces.FormsUI.*;

public class CamposTextoInteraction implements Interaction {

    FormData datos;
    String genero;
    String hobbies;
//Case para seleccion de genero debido al tipo de seleccion y mapeo

    public void setGenero(){
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

    public void setHobbies(){
        switch(datos.getHobbies()){
            case ("Sports"):
                hobbies = "1";
                break;
            case ("Reading"):
                hobbies = "2";
                break;
            case ("Music"):
                hobbies= "3";
                break;
        }
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

//Paso de datos por manejo de modelo
        datos = actor.recall("datos");
        datos = Serenity.sessionVariableCalled("datos");
        setGenero();
        setHobbies();
        actor.attemptsTo(Enter.theValue(datos.getNombre()).into(NOMBRE),
                Enter.theValue(datos.getApellido()).into(APELLIDO),
                Enter.theValue(datos.getCorreo()).into(EMAIL),
                //Scroll.to(GENDER.of(genero)),
                Click.on(GENDER.of(genero)),
                Enter.theValue(datos.getTelefono()).into(MOBILE),
                Enter.theValue(datos.getSubjects()).into(SUBJECTS),
                Hit.the(Keys.ENTER).keyIn(SUBJECTS),
                Scroll.to(HOBBIES.of(hobbies)),
                Click.on(HOBBIES.of(hobbies)),
                Enter.theValue(datos.getAddress()).into(CURRENT_ADDRESS)
                //Scroll.to(SUBMIT).andAlignToTop(),
               // Click.on(SUBMIT)
        );

    //Pasar datos directamente para comparacion
     /*   actor.attemptsTo(

                Enter.theValue("juan").into(NOMBRE),
                Enter.theValue("bautista").into(APELLIDO),
                Enter.theValue("hola@queteimporta.com").into(EMAIL),
                Click.on(GENDER),
                Enter.theValue("1234567890").into(MOBILE),



                //Bloque para elegir fecha de cumpleaños
                Scroll.to(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).keyIn(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Enter.keyValues("12 jan 2000").into(DATE_BIRTH),
                Hit.the(Keys.ENTER).keyIn(DATE_BIRTH),

                Enter.theValue("English").into(SUBJECTS),
                Hit.the(Keys.ENTER).keyIn(SUBJECTS),

                Scroll.to(HOBBIES),
                Click.on(HOBBIES),

                Enter.theValue("abc 123 ").into(CURRENT_ADDRESS),

                Scroll.to(SELECT_STATE),
                Click.on(SELECT_STATE),
                Click.on(OPTION_STATE),
                Scroll.to(SELECT_CITY),
                Click.on(SELECT_CITY),
                Click.on(OPTION_CITY)

               // Scroll.to(SUBMIT),
                //Click.on(SUBMIT)
        );
*/
    }

    public static CamposTextoInteraction camposTextoInteraction(){
        return Tasks.instrumented(CamposTextoInteraction.class);
    }
}
