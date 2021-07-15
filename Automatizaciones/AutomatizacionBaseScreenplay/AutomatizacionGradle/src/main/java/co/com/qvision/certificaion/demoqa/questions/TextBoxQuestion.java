package co.com.qvision.certificaion.demoqa.questions;

import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.TextBoxPage.*;


public class TextBoxQuestion implements Question<TextBoxModel> {

    public String textoNombre(Actor actor){
        return Text.of(NAME).viewedBy(actor).asString().split(":")[1];
    }

    public String textoEmail(Actor actor){
        return Text.of(EMAIL).viewedBy(actor).asString().split(":")[1];
    }

    public String textoCurrentAdress(Actor actor){
        return Text.of(CURRENTADRESS).viewedBy(actor).asString().split(":")[1];
    }

    public String textoPermanentAdress(Actor actor){
        return Text.of(PERMANTENTADRESS).viewedBy(actor).asString().split(":")[1];
    }


    @Override
    public TextBoxModel answeredBy(Actor actor) {
        return new
                TextBoxModel(textoNombre(actor),
                textoEmail(actor),
                textoCurrentAdress(actor),
                textoPermanentAdress(actor)
        );
    }

    public static TextBoxQuestion validar(){
        return new TextBoxQuestion();
    }
}
