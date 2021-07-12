package co.com.qvision.certificaion.demoqa.interactions.Forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.qvision.certificaion.demoqa.user_interfaces.FormsUI.CAMPO_POR_ID;

public class EnviarFormulario implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].scrollIntoView(arguments[1]);", CAMPO_POR_ID.of("submit").resolveFor(actor), true);
        CAMPO_POR_ID.of("submit").resolveFor(actor).click();

    }

    public static EnviarFormulario enviarFormulario() {
        return Tasks.instrumented(EnviarFormulario.class);

    }
}
