package co.com.qvision.certificacion.demoqa.stepdefinitions.Elements;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class BrokenLinksStepDefinition {


    @Dado("que el usuario ingresa al modulo Broken Links -Image")
    public void queElUsuarioIngresaAlModuloBrokenLinksImage() {
        System.out.println("entro al dado ");
    }

    @Cuando("el usuario accede al item  \"Click Here for Valid Link\"")
    public void elUsuarioAccedeAlItemClickHereForValidLink() {
        System.out.println("entro al cuando");
    }

    @Cuando("el usuario accede al item  \"Click Here for Broken Link\"")
    public void elUsuarioAccedeAlItemClickHereForBrokenLink() {
        System.out.println("entro al cuando");
    }

    @Entonces("valido que se observe una imagen valida correctamente cargada")
    public void validoQueSeObserveUnaImagenValidaCorrectamenteCargada() {
        System.out.println("entro al entonces");
    }

    @Entonces("valido que no se observe una imagen correctamente cargada y aparezca el icono broken image en lugar de la imagen")
    public void validoQueSeObserveUnaImagenCorrectamenteCargadayAparezcaElIconoBrokenImageEnLugarDeLaImagen() {
        System.out.println("entro al entonces");
    }

    @Entonces("valido que el navegador sea re dirigido a la pagina principal")
    public void validoQueElNavegadorSeaReDirigidoALaPaginaPrincipal() {
        System.out.println("entro al entonces");
    }

    @Entonces("valido que el navegador no muestre ninguna pagina valida y se visualice un mensaje de error")
    public void validoQueElNavegadorNoMuestreNingunaPaginaValidaySeVisualiceUnMensajeDeError() {
        System.out.println("entro al entonces");
    }

    }



