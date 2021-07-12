package co.com.qvision.certificaion.demoqa.questions.Elements;

import co.com.qvision.certificaion.demoqa.models.Elements.Links.LinksData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.LINK_MENSAJE;
import static co.com.qvision.certificaion.demoqa.user_interfaces.ElementsUI.LINK_POR_ID;

public class ValidarLinksQuestion implements Question <LinksData>{

    public String textoLink(Actor actor){
        return Text.of(LINK_POR_ID).viewedBy(actor).asString();
    }

    public String textoMensaje(Actor actor){
        return Text.of(LINK_MENSAJE).viewedBy(actor).asString();
    }

    @Override
    public LinksData answeredBy(Actor actor) {
        //return null;
        return new LinksData(textoLink(actor),textoMensaje(actor) );
    }



    public static ValidarLinksQuestion validarLink(){
        return new ValidarLinksQuestion();
    }
}
