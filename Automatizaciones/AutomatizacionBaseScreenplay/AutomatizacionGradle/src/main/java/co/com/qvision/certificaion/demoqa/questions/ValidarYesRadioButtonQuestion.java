package co.com.qvision.certificaion.demoqa.questions;

import co.com.qvision.certificaion.demoqa.models.RadioButtonModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.RadioButtonPage.*;


public class ValidarYesRadioButtonQuestion implements Question {


    public String prueba(Actor actor){
        return Text.of(BTNYES_SALIDA).viewedBy(actor).asString();
    }

    public String prueba2(Actor actor) {
        return Text.of(BTN_IMPRESSIVE).viewedBy(actor).asString();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return new RadioButtonModel(
                prueba(actor),
                prueba2(actor)

        );
    }

    public static ValidarYesRadioButtonQuestion valida(){
        return new ValidarYesRadioButtonQuestion();
    }



}
