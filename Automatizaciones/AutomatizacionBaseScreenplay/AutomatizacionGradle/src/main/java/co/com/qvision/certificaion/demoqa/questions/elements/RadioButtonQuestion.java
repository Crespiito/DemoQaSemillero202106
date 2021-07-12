package co.com.qvision.certificaion.demoqa.questions.elements;

import co.com.qvision.certificaion.demoqa.models.RadioButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.RadioButtonPage.ME_YES;

public class RadioButtonQuestion implements Question {
    RadioButtonModel radioButtonModel;

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ME_YES).viewedBy(actor).asString();
    }
    public static RadioButtonQuestion radioButtonQuestion(){
        return new RadioButtonQuestion();
    }
}
