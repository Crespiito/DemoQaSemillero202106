package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class BrokenLinksStepDefinition {

    @Dado("que el usuario ingresa al modulo Broken Links -Image")
    public void queElUsuarioIngresaAlModuloBrokenLinksImage() {

    }

    @Cuando("el usuario observa una imagen valida")
    public void elUsuarioObservaUnaImagenValida() {

    }

    @Entonces("valido que se observe una imagen valida correctamente cargada")
    public void validoQueSeObserveUnaImagenValidaCorrectamenteCargada() {
        ;
    }

    @Cuando("el usuario observa una imagen rota")
    public void elUsuarioObservaUnaImagenRota() {

    }

    @Entonces("valido que no se observe una imagen correctamente cargada y aparezca el icono broken image en lugar de la imagen")
    public void validoQueNoSeObserveUnaImagenCorrectamenteCargadaYAparezcaElIconoBrokenImageEnLugarDeLaImagen() {

    }

    @Cuando("el usuario accede al item  Click Here for Valid Link")
    public void elUsuarioAccedeAlItemClickHereForValidLink() {

    }

    @Entonces("valido que el navegador sea re dirigido a la pagina principal demoqa")
    public void validoQueElNavegadorSeaReDirigidoALaPaginaPrincipalHttpsDemoqaCom() {

    }

    @Cuando("el usuario accede al item Click Here for Broken Link")
    public void elUsuarioAccedeAlItemClickHereForBrokenLink() {

    }

    @Entonces("valido que el navegador no muestre ninguna pagina valida y se visualice un mensaje de error")
    public void validoQueElNavegadorNoMuestreNingunaPaginaValidaYSeVisualiceUnMensajeDeError() {

    }


}
