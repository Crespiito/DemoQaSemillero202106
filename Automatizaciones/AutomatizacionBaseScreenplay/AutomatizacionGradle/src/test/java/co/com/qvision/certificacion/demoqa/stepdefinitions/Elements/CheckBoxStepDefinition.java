package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import co.com.qvision.certificaion.demoqa.tasks.Elements.CheckBox.SelectCheckBoxCBTask;
import co.com.qvision.certificaion.demoqa.tasks.Elements.CheckBox.SelectOptionCheckBoxTask;
import co.com.qvision.certificaion.demoqa.tasks.Elements.CheckBox.SelectToggleCBTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CheckBoxStepDefinition {

//Escenario de ingreso a submodulo Check Box
    @Dado("Yo como usuario ingrese al modulo {}")
    public void yoComoUsuarioIngreseAlModulo(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptionCheckBoxTask.seleccionarOpcion());
       // System.out.println("entro al dado ");
    }

    @Cuando("Seleccione {}")
    public void seleccione(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCheckBoxCBTask.selectCheckBoxCBTask());
        //OnStage.theActorInTheSpotlight().attemptsTo(SelectToggleCBTask.selectToggleCBTask());
        //System.out.println("entro al cuando");
    }

    @Entonces("Visualice {}")
    public void visualice(String string) {
        System.out.println("entro al entonces");
    }


//Probar seleccionar-desplegar (Toggle) en check Box

    @Dado("Yo como usuario este en la funcionalidad {}")
    public void yoComoUsuarioEsteEnLaFuncionalidad(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptionCheckBoxTask.seleccionarOpcion());
        //System.out.println("entro al dado ");
    }

    @Cuando("Seleccione el Toggle o listar de {}")
    public void seleccioneElToggleOListarDe(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectToggleCBTask.selectToggleCBTask());
       // System.out.println("entro al cuando");
    }

    @Entonces("Se desplegara las carpetas que contiene {}")
    public void seDesplegaraLasCarpetasQueContiene(String string){
        System.out.println("entro al entonces");
    }



//Validar que funciones el check box

    @Cuando("Seleccione el check box o desplegar de{}")
    public void seleccioneElCheckBoxODesplegar(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCheckBoxCBTask.selectCheckBoxCBTask());
      //  System.out.println("entro al cuando");
    }

    @Entonces("Visualice el siguiente mensaje {}")
    public void visualiceElSiguienteMensaje(String string) {
        System.out.println("entro al entonces");
    }


//validar checkbox anidado

    @Dado("Yo como usuario tenga seleccionado el check box de {}")
    public void yoComoUsuarioTengaSeleccionadoElCheckBoxDe(String string) {
        System.out.println("entro al dado ");
    }
    //Y
    @Dado("desplegado el Toggle {}")
    public void desplegadoElToggle(String string){
        System.out.println("entro al dado ");
    }

    @Cuando("Deselecciono {}")
    public void deselecciono(String string) {
        System.out.println("entro al cuando");
    }
    //Y
    @Cuando("Selecciono el Toggle de {}")
    public void seleccionoElToggleDe(String string){
        System.out.println("entro al cuando");
    }

    @Entonces("{} y las carpetas en su interior se deseleccionan")
    public void YLasCarpetasEnSuInteriorSeDeseleccionan(String string) {
        System.out.println("entro al entonces");
    }



  //#Expandir y contraer todas las carpetas
     @Dado("se haya seleccionado el evento {}")
     public void seHayaSeleccionadoElEvento(String string) {
      System.out.println("entro al dado ");
  }


    @Cuando("Seleccione el evento {}")
    public void seleccioneElEvento(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualizare toda las carpetas que se encuentran al interior de {}")
    public void visualizareTodaLasCarpetasQueSeEncuentranAlInteriorDe(String string) {
        System.out.println("entro al entonces");
    }


    @Entonces("Visualizare que todas las carpetas desaparecen excepto {}")
    public void visualizareQueTodasLasCarpetasDesaparecenExcepto(String string) {
        System.out.println("entro al entonces");
    }

}
