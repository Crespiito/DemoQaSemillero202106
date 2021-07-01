package co.com.qvision.certificaion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.VALIDACION_NAME;

public class ValidarFormularioQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_NAME).viewedBy(actor).asString();
    }

    public static ValidarFormularioQuestion validarFormularioQuestion() {
        return new ValidarFormularioQuestion();
    }
}
