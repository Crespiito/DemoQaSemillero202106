package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.qvision.certificaion.demoqa.tasks.HacerClickTask.hacerClickTask;
import static co.com.qvision.certificaion.demoqa.tasks.SeleccionarOpcionTask.seleccionarOpcion;

public class RadioButtonsStepDefinitions {


    @Cuando("despliegue la lista de Elements {}")
    public void despliegueLaListaDeElements(String boton) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                hacerClickTask(boton)
        );

    }

    @Entonces("valido que este presente el item Radio Button")
    public void validoQueEstePresenteElItemRadioButton() {

    }

    @Dado("que el usuario ubique el item Radio Button en la lista de Elements")
    public void queElUsuarioUbiqueElItemRadioButtonEnLaListaDeElements() {

    }

    @Cuando("seleccione el item Radio Button")
    public void seleccioneElItemRadioButton() {

    }

    @Entonces("se le mostrara el contenido de esa seccion")
    public void seLeMostraraElContenidoDeEsaSeccion() {

    }

    @Dado("que el usuario haya leido la pregunta Te gusta el sitio y decida entre las opciones de respuesta")
    public void queElUsuarioHayaLeidoLaPreguntaTeGustaElSitioYDecidaEntreLasOpcionesDeRespuesta() {

    }

    @Cuando("marque la opcion Afirmativo Si")
    public void marqueLaOpcionAfirmativoSi() {

    }

    @Entonces("podra ver un mensaje con la opcion seleccionada de la siguiente manera Has seleccionado Si")
    public void podraVerUnMensajeConLaOpcionSeleccionadaDeLaSiguienteManeraHasSeleccionadoSi() {

    }

    @Cuando("marque la opcion Impresionante")
    public void marqueLaOpcionImpresionante() {

    }

    @Entonces("podra ver un mensaje con la opcion seleccionada de la siguiente manera Has seleccionado Impresionante")
    public void podraVerUnMensajeConLaOpcionSeleccionadaDeLaSiguienteManeraHasSeleccionadoImpresionante() {

    }

    @Cuando("se ubique en la opcion No")
    public void seUbiqueEnLaOpcionNo(String boton) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                hacerClickTask(boton)
        );

    }

    @Entonces("podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion")
    public void podraVisualizarElSímboloDeProhibidoIndicandoleQueNoPuedeSeleccionarEsaOpcion() {

    }
}
