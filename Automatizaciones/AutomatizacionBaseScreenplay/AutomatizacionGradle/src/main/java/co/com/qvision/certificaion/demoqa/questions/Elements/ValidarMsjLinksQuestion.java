package co.com.qvision.certificaion.demoqa.questions.Elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.LINK_MENSAJE;

public class ValidarMsjLinksQuestion implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LINK_MENSAJE).viewedBy(actor).asString();
    }

    public static ValidarMsjLinksQuestion validarMensajeLink(){
        return new ValidarMsjLinksQuestion();
    }
}
