package co.com.qvision.certificaion.demoqa.interactions;

import co.com.qvision.certificaion.demoqa.models.FormData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPage.*;

public class CamposTextoInteraction implements Interaction {

    FormData datos;
    String genero;


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

    @Override
    public <T extends Actor> void performAs(T actor) {
        datos = actor.recall("datos");
        datos = Serenity.sessionVariableCalled("datos");
        setGenero();
        actor.attemptsTo(Enter.theValue(datos.getNombre()).into(NOMBRE),
                Enter.theValue(datos.getApellido()).into(APELLIDO),
                Enter.theValue(datos.getCorreo()).into(CORREO),
                Click.on(GENERO.of(genero)),
                Enter.theValue(datos.getTelefono()).into(NUMERO)
                );
    }

    public static CamposTextoInteraction camposTextoInteraction(){
        return Tasks.instrumented(CamposTextoInteraction.class);
    }
}
