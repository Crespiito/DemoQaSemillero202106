package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.tasks.Elements.Links.SelectLinkTask;
import co.com.qvision.certificaion.demoqa.tasks.Elements.Links.SelectOptionLinksTask;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class LinksStepDefinition {

    @Dado("que como usuario me encuentro en la pagina {}")
    public void queComoUsuarioMeEncuentroEnLaPagina(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectOptionLinksTask.selectOptionLinksTask()
        );
       // System.out.println("entro al dado ");
    }

    @Cuando("selecciono el link {}")
    public void seleccionoElLink(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectLinkTask.selectLinkTask()
        );
        //System.out.println("entro al cuando");
    }

    @Entonces("Me direcciona a la pagina inicial {}")
    public void meDireccionaALaPaginaInicial(String string) {
        System.out.println("entro al entonces");
    }

    @Entonces("Me deberia mostrar un mensaje que diga {}")
    public void meDeberiaMostrarUnMensajeQueDiga(String string) {
        System.out.println("entro al entonces");
    }



}
