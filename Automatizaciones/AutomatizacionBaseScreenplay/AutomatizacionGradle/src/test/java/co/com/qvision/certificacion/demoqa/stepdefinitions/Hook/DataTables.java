package co.com.qvision.certificacion.demoqa.stepdefinitions.Hook;

import co.com.qvision.certificaion.demoqa.models.*;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTables {
    @DataTableType
    public MenuModel menuModel(Map<String,String> menu){
        return new MenuModel(menu.get("La Tarjeta"),
                menu.get("Seleccionada"));
    }

    @DataTableType
    public DataForm dataForm(Map<String,String> datos) {


        return  new DataForm(
                datos.get("nombre"),
                datos.get("apellido"),
                datos.get("correo"),
                datos.get("mobil"),
                datos.get("genero")
        );
    }
    @DataTableType
    public TextBoxModel textBoxModel(Map<String,String> datos) {


        return  new TextBoxModel(
                datos.get("fullName"),
                datos.get("email"),
                datos.get("currentAdress"),
                datos.get("permantenAdress")
        );
    }

    @DataTableType
    public AlertModel alertModel(Map<String, String> datos) {
        return new AlertModel(datos.get("boton"),
                datos.get("mensaje"));
    }

    @DataTableType
    public RadioButtonModel radioButtonModel(Map<String, String> datos) {
        return new RadioButtonModel(datos.get("boton"),
                datos.get("mensaje"));
    }
    @DataTableType
    public ButtonModel buttonModel(Map<String, String> datos) {
        return new ButtonModel(datos.get("boton"),
                datos.get("mensaje"));
    }
}
