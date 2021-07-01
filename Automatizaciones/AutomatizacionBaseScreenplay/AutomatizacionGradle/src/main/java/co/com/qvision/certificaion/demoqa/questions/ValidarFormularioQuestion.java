package co.com.qvision.certificaion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarFormularioQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return "nul";

    }

    public static ValidarFormularioQuestion validar(){
        return new ValidarFormularioQuestion();
    }
}
