package co.com.qvision.certificaion.demoqa.questions;

import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPage.VALIDACION_NAME;

public class ValidarFormularioQuestion implements Question<TextBoxModel> {

    public String textoNombre(Actor actor){
        return Text.of("//*[@id='name']").viewedBy(actor).asString();
    }

    public String textoMail(Actor actor){
        return Text.of("//*[@id='email']").viewedBy(actor).asString();
    }

    public String textoCurrent(Actor actor){
        return Text.of("//*[@id='currentAddress' and @class='mb-1']").viewedBy(actor).asString();
    }

    public String textoPermanent(Actor actor){
        return Text.of("//*[@id='permanentAddress' and @class='mb-1'] ").viewedBy(actor).asString();
    }

    @Override
    public TextBoxModel answeredBy(Actor actor) {
        return new TextBoxModel(
                textoNombre(actor),
                textoMail(actor),
                textoCurrent(actor),
                textoPermanent(actor)
        );
    }

    public static ValidarFormularioQuestion validarFormularioQuestion() {
        return new ValidarFormularioQuestion();
    }


}
