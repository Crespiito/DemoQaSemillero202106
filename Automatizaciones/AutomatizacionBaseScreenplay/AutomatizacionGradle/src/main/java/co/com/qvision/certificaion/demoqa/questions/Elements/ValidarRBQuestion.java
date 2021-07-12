package co.com.qvision.certificaion.demoqa.questions.Elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.MENSAJE_RADIOBUTTON;

public class ValidarRBQuestion implements Question <String>{


    @Override
    public String answeredBy(Actor actor) {
       return Text.of(MENSAJE_RADIOBUTTON).viewedBy(actor).asString();
       // return ;
    }

    public static ValidarRBQuestion validarRBQuestion(){
        return new ValidarRBQuestion();
    }
}
