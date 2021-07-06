package co.com.qvision.certificaion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPages.RESULTFORM;

public class PracriceFormStringQuestion implements Question<String> {



    @Override
    public String answeredBy(Actor actor) {


        return Text.of(RESULTFORM).viewedBy(actor).asString();

    }


    public static PracriceFormStringQuestion pracriceFormQuestion(){
        return new PracriceFormStringQuestion();
    }
}
