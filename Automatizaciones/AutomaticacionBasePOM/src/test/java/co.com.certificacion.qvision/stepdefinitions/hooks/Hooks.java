package co.com.certificacion.qvision.stepdefinitions.hooks;

import co.com.certification.qvision.models.FormData;
import co.com.certification.qvision.models.OpcionMenuModel;
import co.com.certification.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.DataTableType;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import java.util.Map;

public class Hooks {

    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;

    @Before
    public void abrirNavegador(){
        demoQaGeneralSteps.abrirPaginaDemoQa();;
    }

    @DataTableType
    public OpcionMenuModel menuModel(Map<String,String>datos) {
        return new OpcionMenuModel(datos.get("La Tarjeta"), datos.get("Seleccionado"));

    }

    //Tabla Practice Form
    @DataTableType
    public FormData formData(Map<String, String> datos) {
        return new FormData(
                datos.get("nombre"),
                datos.get("apellido"),
                datos.get("correo"),
                datos.get("telefono"),
                datos.get("genero")
        );
    }
}
