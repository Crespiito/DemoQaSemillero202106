package co.com.qvision.certificaion.demoqa.tasks.Forms;

import co.com.qvision.certificaion.demoqa.interactions.Forms.CamposTextoInteraction;
import co.com.qvision.certificaion.demoqa.interactions.Forms.EnviarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.qvision.certificaion.demoqa.models.Forms.FormData;
import net.serenitybdd.core.Serenity;

public class LlenarFormulario implements Task {

    FormData datos;

    public LlenarFormulario(FormData datos) {

        this.datos = datos;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember("datos",datos);
        Serenity.setSessionVariable("datos").to(datos);
        actor.attemptsTo(

               //CampoSeleccionUnica.campoSeleccionUnica(),
                CamposTextoInteraction.camposTextoInteraction(),
                EnviarFormulario.enviarFormulario()
        );

    }

//Para paso de datos por modelo
    public static LlenarFormulario llenarFormulario(FormData datos) {
        return Tasks.instrumented(LlenarFormulario.class, datos);
    }

//Para paso de datos quemados
  /*  public static LlenarFormulario llenarFormulario(){
        return Tasks.instrumented(LlenarFormulario.class);
    }
    */

}
