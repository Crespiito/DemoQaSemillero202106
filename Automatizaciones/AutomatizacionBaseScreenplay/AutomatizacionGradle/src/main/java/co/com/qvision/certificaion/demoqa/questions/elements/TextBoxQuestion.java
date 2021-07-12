package co.com.qvision.certificaion.demoqa.questions.elements;

import co.com.qvision.certificaion.demoqa.models.TextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.TextBoxPage.*;

public class TextBoxQuestion implements Question {


    public String textNombre(Actor actor) {

        return Text.of(NAME).viewedBy(actor).asString().split(":")[1];

    }

    public String txtEmail(Actor actor) {

        return Text.of(EMAIL).viewedBy(actor).asString().split(":")[1];

    }

    public String txtCurrentAddress(Actor actor) {

        return Text.of(CURRENTADRESS).viewedBy(actor).asString().split(":")[1];

    }

    public String txtPermanentAdress(Actor actor) {

        return Text.of(PERMANTENTADRESS).viewedBy(actor).asString().split(":")[1];

    }




    @Override
    public Object answeredBy(Actor actor) {
        return new TextBoxModel(
                textNombre(actor),
                txtEmail(actor),
                txtCurrentAddress(actor),
                txtPermanentAdress(actor));
    }

    public static TextBoxQuestion textBoxQuestion(){
        return new TextBoxQuestion();
    }
}
