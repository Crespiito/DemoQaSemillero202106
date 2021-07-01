package co.com.qvision.certificaion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTextBox implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        //Text.of(CAMPO_POR_ID)
        return null;
    }

    public static ValidarTextBox validarTextBox(){

        return new ValidarTextBox();
    }
}
