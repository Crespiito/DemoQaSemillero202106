package co.com.qvision.certificaion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.ButtonPage.SALIDA_DoubleBTN;

public class ValidarButtonQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SALIDA_DoubleBTN).viewedBy(actor).asString() ;
    }


    public static ValidarButtonQuestion validar(){
        return new ValidarButtonQuestion();
    }
}
