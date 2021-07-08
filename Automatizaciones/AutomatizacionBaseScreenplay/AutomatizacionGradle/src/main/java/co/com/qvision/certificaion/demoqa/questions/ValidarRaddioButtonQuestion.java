package co.com.qvision.certificaion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarRaddioButtonQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of("//span[@class ='text-success']").
                viewedBy(actor).asString();
    }

    public static ValidarRaddioButtonQuestion validarRaddioButtonQuestion(){
        return new ValidarRaddioButtonQuestion();
    }
}
