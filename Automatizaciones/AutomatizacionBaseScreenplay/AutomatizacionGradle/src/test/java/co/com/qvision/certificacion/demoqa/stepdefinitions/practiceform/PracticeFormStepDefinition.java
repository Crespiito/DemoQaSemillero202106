package co.com.qvision.certificacion.demoqa.stepdefinitions.practiceform;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class PracticeFormStepDefinition {


    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
        System.out.println("entro al cuando");
    }


    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        System.out.println("entro al entonces");

    }



}
