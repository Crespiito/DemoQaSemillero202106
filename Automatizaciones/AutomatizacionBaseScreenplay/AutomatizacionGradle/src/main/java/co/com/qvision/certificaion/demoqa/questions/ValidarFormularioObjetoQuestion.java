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
        return Text.of(POSITION_TABLE.of("3", "2")).viewedBy(actor).asString();
    }

    public String textoMobile(Actor actor) {
        return Text.of(POSITION_TABLE.of("4", "2")).
                viewedBy(actor).asString();
    }

    public String textoEmail(Actor actor) {
        return Text.of(POSITION_TABLE.of("2", "2")).
                viewedBy(actor).asString();
    }

    public String textoSubject(Actor actor) {
        return Text.of(POSITION_TABLE.of("6", "2")).
                viewedBy(actor).asString();
    }

    public String textoCurrentAddres(Actor actor) {
        return Text.of(POSITION_TABLE.of("9", "2")).
                viewedBy(actor).asString();
    }

    @Override
    public FormDataModel answeredBy(Actor actor) {
        return new FormDataModel(
                textoNombre(actor, 0),
                textoNombre(actor, 1),
                textoGenero(actor),
                textoMobile(actor),
                textoEmail(actor),
                textoSubject(actor),
                textoCurrentAddres(actor)
        );
    }

    public static ValidarFormularioObjetoQuestion validarFormularioObjetoQuestion() {
        return new ValidarFormularioObjetoQuestion();
    }
}
