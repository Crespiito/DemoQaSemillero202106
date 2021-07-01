package co.com.qvision.certificaion.demoqa.models;

public class FormDataModel {

    String Nombre;
    String Apellido;
    String genero;

    public FormDataModel(String nombre, String apellido, String genero) {
        Nombre = nombre;
        Apellido = apellido;
        this.genero = genero;
    }
}
