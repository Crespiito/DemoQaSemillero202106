package co.com.qvision.certificaion.demoqa.questions;


import co.com.qvision.certificaion.demoqa.models.FormData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormsUI.TABLE;

//Para validar directamente en el stepDef, envio String como parametro en Question<String>

public class ValidarFormularioQuestion implements Question<FormData> {
//Validar ventana emergente (al llenar el formulario exitosamente) y campos en ella, recorro cada campo en la tabla

    public String textoNombre(Actor actor, int pos){
        return Text.of(TABLE.of ("1","2")).viewedBy(actor).asString().split(" ")[pos];
        }

    public String textoCorreo(Actor actor){
        return Text.of(TABLE.of ("2","2")).viewedBy(actor).asString();
    }

    public String textoGenero(Actor actor){
        return Text.of(TABLE.of ("3","2")).viewedBy(actor).asString();
       }

    public String textoTelefono(Actor actor){
        return Text.of(TABLE.of ("4","2")).viewedBy(actor).asString();
    }

    public String textoSubjects(Actor actor){
        return Text.of(TABLE.of ("6","2")).viewedBy(actor).asString();
    }

    public String textoHobbies(Actor actor){
        return Text.of(TABLE.of ("7","2")).viewedBy(actor).asString();
    }

    public String textoAddress(Actor actor){
        return Text.of(TABLE.of ("9","2")).viewedBy(actor).asString();
    }




//Para validar directamente en el stepDef, envio String como tipo de dato en  public String answeredBy
    @Override
    public FormData answeredBy(Actor actor) {
//validacion question simple en campos del step, usando el matcher
        // return "null";

//Validacion para los campos de la tabla de la ventana emergente
        return new FormData(textoNombre(actor, 0),textoNombre(actor,1),textoCorreo(actor), textoGenero(actor), textoTelefono(actor), textoSubjects(actor), textoHobbies(actor),textoAddress(actor));

    }

    public static ValidarFormularioQuestion validar(){
        return new ValidarFormularioQuestion();
    }
}
