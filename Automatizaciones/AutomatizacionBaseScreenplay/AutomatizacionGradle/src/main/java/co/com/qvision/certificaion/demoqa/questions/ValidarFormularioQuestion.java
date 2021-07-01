package co.com.qvision.certificaion.demoqa.questions;

import co.com.qvision.certificaion.demoqa.models.FormData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPage.TABLE;

public class ValidarFormularioQuestion implements Question<FormData> {

    public String textoNombre(Actor actor, int pos){
        return Text.of(TABLE.of("1","2")).viewedBy(actor).asString().split(" ")[pos];
    }

    public String textoCorreo(Actor actor){
        return Text.of(TABLE.of("2","2")).viewedBy(actor).asString();
    }

    public String textoGenero(Actor actor){
        return Text.of(TABLE.of("3","2")).viewedBy(actor).asString();
    }


    public String textoTelefono(Actor actor){
        return Text.of(TABLE.of("4","2")).viewedBy(actor).asString();
    }


    @Override
    public FormData answeredBy(Actor actor) {
        return new FormData(textoNombre(actor,0),textoNombre(actor,1),textoGenero(actor),textoCorreo(actor),textoTelefono(actor));
    }

    public static ValidarFormularioQuestion validar(){
        return new ValidarFormularioQuestion();
    }
}
