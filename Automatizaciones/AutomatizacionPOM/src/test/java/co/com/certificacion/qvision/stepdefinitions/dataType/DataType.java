package co.com.certificacion.qvision.stepdefinitions.dataType;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.steps.DemoQaGeneralSteps;
import io.cucumber.java.DataTableType;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class DataType {

    @Steps
    DemoQaGeneralSteps demoQaGeneralSteps;

    @DataTableType
    public OpcionesMenuModel opcionesMenu(Map<String, String> dato) {
        return new OpcionesMenuModel(dato.get("La Tarjeta"), dato.get("Seleccionado"));
    }

    @DataTableType
    public FormDataModel formDataModel(Map<String, String> dato) {
        return new FormDataModel(
                dato.get("nombre"),
                dato.get("apellido"),
                dato.get("correo"),
                dato.get("genero"),
                dato.get("telefono"),
                dato.get("subject"),
                dato.get("currentAddress")
        );
    }
}
