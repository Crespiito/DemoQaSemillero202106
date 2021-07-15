package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import co.com.qvision.certificaion.demoqa.models.*;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTable {


    @DataTableType
    public OpcionMenuModel menuModel(Map<String, String> datos) {
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

//Tabla Text Box
    @DataTableType
    public TextBoxModel textBoxModel(Map<String, String> datos) {
        return new TextBoxModel(
                datos.get("nombre"),
                datos.get("email"),
                datos.get("currentAdress"),
                datos.get("permanentAdress")
        );
    }


 //Tabla Radio Button
    @DataTableType
    public RadioButtonModel radioButtonModel(Map<String, String> datos){
        return new RadioButtonModel(
                datos.get("button"),
                datos.get("message")
        );
    }

    //Tabla Buttons
    @DataTableType
    public ButtonModel buttonModel(Map<String, String> datos){
        return new ButtonModel(
                datos.get("boton"),
                datos.get("mensaje")
        );


    }


}
