package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class CheckBoxStepDefinition {
    @Dado("Yo como usuario ingrese al modulo {string}")
    public void yoComoUsuarioIngreseAlModulo(String string) {
        System.out.println("entro al DAdo");
    }

    @Entonces("Visualice Home")
    public void visualiceHome() {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario este en la funcionalidad {string}")
    public void yoComoUsuarioEsteEnLaFuncionalidad(String string) {
        System.out.println("entro al dADO");
    }

    @Cuando("Seleccione Toggle Home")
    public void seleccioneToggleHome() {
        System.out.println("entro al CUANDO");
    }

    @Entonces("Se desplegara las carpetas que contiene Home")
    public void seDesplegaraLasCarpetasQueContieneHome() {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione el check box de Home")
    public void seleccioneElCheckBoxDeHome() {
        System.out.println("entro al Cuando");
    }

    @Entonces("Visualice el siguiente mensaje {string}")
    public void visualiceElSiguienteMensaje(String string) {
        System.out.println("entro al entonces");
    }

    @Dado("Yo como usuario tenga seleccionado el check box de Home")
    public void yoComoUsuarioTengaSeleccionadoElCheckBoxDeHome() {
        System.out.println("entro al DADO");
    }

    @Dado("desplegado el Toggle Home")
    public void desplegadoElToggleHome() {
        System.out.println("entro al Dado");
    }

    @Cuando("Deselecciono Documents")
    public void deseleccionoDocuments() {
        System.out.println("entro al Cuando");
    }

    @Cuando("Selecciono el Toggle de Documents")
    public void seleccionoElToggleDeDocuments() {
        System.out.println("entro al Cuando");
    }

    @Entonces("Documents y las carpetas en su interior se deseleccionan")
    public void documentsYLasCarpetasEnSuInteriorSeDeseleccionan() {
        System.out.println("entro al entonces");
    }


    @Cuando("selecciono el evento {string}")
    public void seleccionoElEvento(String string) {
        System.out.println("entro al Cuando");
    }

    @Entonces("Visualizare toda las carpetas que se encuentran al interior de {string}")
    public void visualizareTodaLasCarpetasQueSeEncuentranAlInteriorDe(String string) {
        System.out.println("entro al entonces");
    }

    @Dado("se haya seleccionado el evento {string}")
    public void seHayaSeleccionadoElEvento(String string) {
        System.out.println("entro al Dado");
    }

    @Cuando("Seleccione el evento {string}")
    public void seleccioneElEvento(String string) {
        System.out.println("entro al Cuando");
    }

    @Entonces("Visualizare que todas las carpetas desaparecen excepto {string}")
    public void visualizareQueTodasLasCarpetasDesaparecenExcepto(String string) {
        System.out.println("entro al entonces");
    }

}
