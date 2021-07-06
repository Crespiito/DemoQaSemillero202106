package co.com.qvision.certificaion.demoqa.interactions;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.GENDER;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.HOBBIES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CamposBinariosInteractions implements Interaction {

    FormDataModel opcion;
    String genero;

    public CamposBinariosInteractions(FormDataModel opcion) {
        this.opcion = opcion;
    }

    public void setGenero(){
        switch (opcion.getGenero()){
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
                Scroll.to(GENDER),
                Click.on(GENDER),
                Scroll.to(HOBBIES),
                Click.on(HOBBIES)
        );
    }

    public static CamposBinariosInteractions camposBinariosInteractions(FormDataModel opcion){
        return instrumented(CamposBinariosInteractions.class, opcion);
    }
}
