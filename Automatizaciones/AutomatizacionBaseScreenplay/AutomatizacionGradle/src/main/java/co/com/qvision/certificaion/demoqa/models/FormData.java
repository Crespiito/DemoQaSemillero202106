package co.com.qvision.certificaion.demoqa.models;

public class FormData {
    String nombre;
    String apellido;
    String correo;
    String genero;
    String telefono;
    String subjects;
    String hobbies;
    String address;




    public FormData(String nombre, String apellido, String correo, String genero, String telefono, String subjects,String hobbies, String address) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.telefono = telefono;
        this.subjects = subjects;
        this.hobbies = hobbies;
        this.address = address;

    }
}
