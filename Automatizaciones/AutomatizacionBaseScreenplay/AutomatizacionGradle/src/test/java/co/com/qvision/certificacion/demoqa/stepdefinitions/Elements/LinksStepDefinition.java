package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.models.Elements.Links.LinksData;
import co.com.qvision.certificaion.demoqa.questions.Elements.ValidarLinksQuestion;
import co.com.qvision.certificaion.demoqa.questions.Elements.ValidarMsjLinksQuestion;
import co.com.qvision.certificaion.demoqa.questions.Elements.ValidarRBQuestion;
import co.com.qvision.certificaion.demoqa.questions.Forms.ValidarFormularioQuestion;
import co.com.qvision.certificaion.demoqa.tasks.Elements.Links.SelectLinkTask;
import co.com.qvision.certificaion.demoqa.tasks.Elements.Links.SelectOptionLinksTask;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

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
   // public void seleccionoElLink(LinksData datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
               // SelectLinkTask.selectLinkTask(datos)
                SelectLinkTask.selectLinkTask()
        );
        //System.out.println("entro al cuando");
    }

  //  @Entonces("Me direcciona a la pagina inicial {}")
    //public void meDireccionaALaPaginaInicial(String string) {

       // System.out.println("entro al entonces");


    //#Items parte Titulo 2 links

   /*
    @Entonces("Me deberia mostrar un mensaje de status")
    public void meDeberiaMostrarUnMensajeDeStatus(LinksData datos) {
        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.
                        seeThat("la validacion de mi prueba",
                                ValidarLinksQuestion.validarLink(),sameBeanAs(datos)));
        //System.out.println("entro al entonces");
    }

*/
   @Entonces("Me deberia mostrar un mensaje de status")
   public void meDeberiaMostrarUnMensajeDeStatus() {
       OnStage.theActorInTheSpotlight().
               should(GivenWhenThen.
                       seeThat("la validacion de mi prueba",
                               ValidarMsjLinksQuestion.validarMensajeLink(),
               Matchers.anyOf(
                       Matchers.is("has responded with stau and status text eated"),
                       Matchers.is("Lk has responded with staus 24 and status text Nntent"),
                      // Matchers.is("Lnk has responded with staus 301 and status text Moved Permanently"),
                     //  Matchers.is("Lk has responded with staus 400 and status text Bad Request"),
                     //  Matchers.is("Lins responded with staus 401 and status text Unauthorized"),
                      // Matchers.is("Linas responded with staus 403 and status text Forbidden"),
                       Matchers.is("Linponded with staus 4 and status text und")
               )));

   }

}
