package co.com.qvision.certificaion.demoqa.questions;

import co.com.qvision.certificaion.demoqa.models.DataForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormPages.*;

public class PracticeFormTableQuestion implements Question<DataForm> {



    public String textNombreyApellido(Actor actor, int pos){

        return   Text.of(TABLA.of("1","2")).viewedBy(actor).asString().split(" ")[pos];

    }
    public String textCorreo(Actor actor){

        return   Text.of(TABLA.of("2","2")).viewedBy(actor).asString();

    }

    public String textMobil(Actor actor){

        return   Text.of(TABLA.of("4","2")).viewedBy(actor).asString();

    }
    public String textGenero(Actor actor){

        return   Text.of(TABLA.of("3","2")).viewedBy(actor).asString();

    }

    @Override
    public DataForm answeredBy(Actor actor) {
  DataForm data = new DataForm(textNombreyApellido(actor,0),
          textNombreyApellido(actor,1),
          textCorreo(actor),textMobil(actor),textGenero(actor));


        return new DataForm(textNombreyApellido(actor,0),
                textNombreyApellido(actor,1),
                textCorreo(actor),textMobil(actor),textGenero(actor));
    }
    public static PracticeFormTableQuestion practiceFormQuestion2(){
        return new PracticeFormTableQuestion();
    }
}
