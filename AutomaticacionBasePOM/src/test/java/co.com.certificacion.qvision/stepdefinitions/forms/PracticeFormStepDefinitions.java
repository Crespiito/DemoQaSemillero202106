package co.com.certificacion.qvision.stepdefinitions.forms;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class PracticeFormStepDefinitions {

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        System.out.println("dado");;
    }



    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        System.out.println("Adasf");;
    }
    @Entonces("confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario() {
        System.out.println("ASFaf");;
    }

}
