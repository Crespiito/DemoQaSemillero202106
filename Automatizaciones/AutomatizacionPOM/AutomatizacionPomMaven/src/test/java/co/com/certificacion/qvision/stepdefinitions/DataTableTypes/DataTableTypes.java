package co.com.certificacion.qvision.stepdefinitions.DataTableTypes;

import co.com.certificacion.qvision.models.services.request.DataServiceModel;
import co.com.certificacion.qvision.models.FormData;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.models.services.responses.BodyUserResponse;
import co.com.certificacion.qvision.models.services.responses.DataServiceResponse;
import co.com.certificacion.qvision.utils.CsvTransformer;
import io.cucumber.java.DataTableType;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DataTableTypes {

    @DataTableType
    public DataServiceModel dataServiceModel(Map<String,String> datos) throws IOException {
        List<Map<String, String>> map = CsvTransformer.getRowsCsv("service", datos.get("filtro")+","+datos.get("valor"));
        return new DataServiceModel(map.get(0).get("userName"),map.get(0).get("password"));
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

    @DataTableType
    public BodyUserResponse dataServiceResponse(Map<String,String> datos) throws IOException {
        List<Map<String, String>> dataMap = CsvTransformer.getRowsCsv("service", datos.get("filtro")+","+datos.get("valor"));
        return new BodyUserResponse(dataMap);
    }
}