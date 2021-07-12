package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.tasks.Elements.RadioButton.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RadioButtonsStepDefinition {

//Escenario de ingreso a submodulo Radio Button

    @Dado("que el usuario acceda al modulo Elements")
    public void queElUsuarioAccedaAlModuloElements(){
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOpElementsRBTask.seleccionarOpcion());
        //System.out.println("entro al dado ");
    }

    @Cuando("seleccione el item Radio Button")
    public void seleccioneElItemRadioButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectRadioButtonTask.seleccionar());
       // System.out.println("entro al cuando");
    }


    @Entonces("se le mostrara el contenido de esa seccion")
    public void seLeMostraraElContenidoDeEsaSeccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectRadioButtonTask.seleccionar());
        //System.out.println("entro al entonces");
    }

/*
// Respuestas si

    @Dado("que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta")
    public void queElUsuarioHayaLeidoLaPreguntaTeGustaElSitioYDecidaEntreLasOpcionesDeRespuesta() {
       // System.out.println("entro al dado ");
       OnStage.theActorInTheSpotlight().attemptsTo(SelectRadioButtonTask.seleccionar());

    }

    @Cuando("marque la opcion Si")
    public void marqueLaOpcionSi(String string) {
       OnStage.theActorInTheSpotlight().attemptsTo(
               SelectYesRBTask.seleccionarYes()
       );
        //System.out.println("entro al cuando");
    }



    @Entonces("podra ver un mensaje con la opcion seleccionada de la siguiente manera {}")
    public void podraVerUnMensajeConLaOpcionSeleccionadaDeLaSiguienteManera(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectRadioButtonTask.seleccionar());
        //System.out.println("entro al entonces");
    }

//Respuesta Impressive

    @Cuando("marque la opcion Imp")
    public void marqueLaOpcionImp(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectImpRBTask.selectImp()
        );
        //System.out.println("entro al cuando");
    }




// Respuesta NO

    @Cuando("se ubique en la opcion No")
    public void seUbiqueEnLaOpcionNo(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectNoRBTask.selectNo()
        );
        //System.out.println("entro al cuando");
    }

    @Entonces("podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion")
    public void podraVisualizarElSimboloDeProhibidoIndicandoleQueNoPuedeSeleccionarEsaOpcion() {
        System.out.println("entro al entonces");
    }






//Otros escenarios


    @Cuando("despliegue la lista de {} ")
    public void despliegueLaListaDe(String string){
        System.out.println("entro al cuando");
    }

    @Entonces("valido que este presente el item {} ")
    public void validoQueEstePresenteElItem(String string) {
        System.out.println("entro al entonces");
    }

    @Dado("que el usuario ubique el item {} en la lista de {}")
    public void queElUsuarioUbiqueElItemEnLaListaDe(String string, String strings) {
        //OnStage.theActorInTheSpotlight().attemptsTo(SelectOpElementsRBTask.seleccionarOpcion());
        System.out.println("entro al dado ");
    }
*/

}
