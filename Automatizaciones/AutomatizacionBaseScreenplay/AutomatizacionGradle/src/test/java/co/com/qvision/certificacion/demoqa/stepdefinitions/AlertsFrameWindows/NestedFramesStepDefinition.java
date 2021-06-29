package co.com.qvision.certificacion.demoqa.stepdefinitions.AlertsFrameWindows;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class NestedFramesStepDefinition {
    @Dado("que el usuario ingresa al modulo Nested Frames y ubica un marco dentro de otro marco, delimitados.")
    public void queElUsuarioIngresaAlModuloNestedFramesYUbicaUnMarcoDentroDeOtroMarcoDelimitados() {
        System.out.println("entro al dado ");
    }

    @Entonces("valido que existan {int} marcos, uno dentro de otro, y que cada uno este delimitado y separado entre si.")
    public void validoQueExistanMarcosUnoDentroDeOtroYQueCadaUnoEsteDelimitadoYSeparadoEntreSi(Integer int1) {
        System.out.println("entro al entonces");
    }


}
