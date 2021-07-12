package co.com.certificacion.qvision.stepdefinitions;

import co.com.certificacion.qvision.models.FormData;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class Hooks {

    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;

    @Before()
    public void abrirNavegador(){
        demoQaGeneralSteps.abrirPaginaDemoQa();
    }

    @DataTableType
    public OpcionesMenuModel opcionesMenu(Map<String,String> datos){
        return new OpcionesMenuModel(datos.get("La Tarjeta"),datos.get("Seleccionado"));
    }


    @DataTableType
    public FormData datosFormulario(Map<String,String> datos){
        return new FormData(
                datos.get("nombre"),
                datos.get("apellido"),
                datos.get("genero"),
                datos.get("correo"),
                datos.get("telefono")

        );
    }
}
