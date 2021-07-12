package co.com.qvision.certificaion.demoqa.questions.elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ButtonPage.MENSAJE_RESULT_RIGTH;

public class ButtonQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MENSAJE_RESULT_RIGTH).viewedBy(actor).asString();
    }
    public  static ButtonQuestion buttonQuestion(){
        return new ButtonQuestion();
    }
}
