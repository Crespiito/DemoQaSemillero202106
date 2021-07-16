package co.com.certificacion.qvision.models;

public class FormDataModel {
    String nombre;
    String apellido;
    String email;
    String genero;
    String mobile;
    String subject;
    String currentAddress;


    public FormDataModel() {
    }

    public FormDataModel(String nombre, String apellido, String email, String genero, String mobile, String subject, String currentAddress) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.mobile = mobile;
        this.genero = genero;
        this.subject = subject;
        this.currentAddress = currentAddress;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
}
