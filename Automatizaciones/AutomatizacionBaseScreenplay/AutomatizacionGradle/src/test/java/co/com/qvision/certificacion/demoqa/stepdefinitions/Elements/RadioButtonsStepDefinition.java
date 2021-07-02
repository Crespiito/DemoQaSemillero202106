package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.tasks.LlenarSoloTexto;
import co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionElementsTask;
import co.com.qvision.certificaion.demoqa.tasks.SelectOpElementsRBTask;
import co.com.qvision.certificaion.demoqa.tasks.SelectRadioButtonTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RadioButtonsStepDefinition {

    @Dado("que el usuario acceda al modulo Elements")
    public void queElUsuarioAccedaAlModuloElements() {
        System.out.println("entro al dado ");
    }

    @Cuando("despliegue la lista de Elements")
    public void despliegueLaListaDeElements() {
        System.out.println("entro al cuando");
    }

    @Entonces("valido que este presente el item Radio Button")
    public void validoQueEstePresenteElItemRadioButton() {
        System.out.println("entro al entonces");
    }

    @Dado("que el usuario ubique el item Radio Button en la lista de Elements")
    public void queElUsuarioUbiqueElItemRadioButtonEnLaListaDeElements() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOpElementsRBTask.seleccionarOpcion());
        //System.out.println("entro al dado ");
    }

    @Cuando("seleccione el item Radio Button")
    public void seleccioneElItemRadioButton() {
        System.out.println("entro al cuando");
    }

    @Entonces("se le mostrara el contenido de esa seccion")
    public void seLeMostraraElContenidoDeEsaSeccion() {
        System.out.println("entro al entonces");
    }

    @Dado("que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta")
    public void queElUsuarioHayaLeidoLaPreguntaTeGustaElSitioYDecidaEntreLasOpcionesDeRespuesta() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectRadioButtonTask.seleccionar());

       // System.out.println("entro al dado ");
    }

    @Cuando("marque la opcion {string}")
    public void marqueLaOpcion(String string) {
      //  OnStage.theActorInTheSpotlight().attemptsTo(SelectRadioButtonTask.seleccionar());
      //  System.out.println("entro al cuando");
    }

    @Entonces("podra ver un mensaje con la opcion seleccionada de la siguiente manera {string}")
    public void podraVerUnMensajeConLaOpcionSeleccionadaDeLaSiguienteManera(String string) {
        System.out.println("entro al entonces");
    }

    @Cuando("se ubique en la opcion No")
    public void seUbiqueEnLaOpcionNo() {
        System.out.println("entro al cuando");
    }

    @Entonces("podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion")
    public void podraVisualizarElSimboloDeProhibidoIndicandoleQueNoPuedeSeleccionarEsaOpcion() {
        System.out.println("entro al entonces");
    }



}
