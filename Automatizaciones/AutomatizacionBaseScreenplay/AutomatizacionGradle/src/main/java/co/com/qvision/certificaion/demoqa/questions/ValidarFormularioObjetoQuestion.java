package co.com.qvision.certificaion.demoqa.questions;

import co.com.qvision.certificaion.demoqa.models.FormDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.POSITION_TABLE;

public class ValidarFormularioObjetoQuestion implements Question<FormDataModel> {


    public String textoNombre(Actor actor, int pos) {
        return Text.of(POSITION_TABLE.of("1", "2")).viewedBy(actor).asString().split(" ")[pos];
    }

    public String textoGenero(Actor actor) {
        return Text.of(POSITION_TABLE.of("3","2")).viewedBy(actor).asString();
    }

    @Override
    public FormDataModel answeredBy(Actor actor) {
        return new FormDataModel(textoNombre(actor,0),textoNombre(actor,1),textoGenero(actor)) ;
    }

    public static ValidarFormularioObjetoQuestion validarFormularioObjetoQuestion() {
        return new ValidarFormularioObjetoQuestion();
    }
}
