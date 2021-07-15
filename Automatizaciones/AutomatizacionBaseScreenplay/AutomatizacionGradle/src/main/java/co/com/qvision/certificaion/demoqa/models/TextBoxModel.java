package co.com.qvision.certificaion.demoqa.models;

public class TextBoxModel {

    private String nombre;
    private String email;
    private String currentAdress;
    private String permanentAdress;

    public TextBoxModel(String nombre, String email, String currentAdress, String permanentAdress) {
        this.nombre = nombre;
        this.email = email;
        this.currentAdress = currentAdress;
        this.permanentAdress = permanentAdress;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentAdress() {
        return currentAdress;
    }

    public void setCurrentAdress(String currentAdress) {
        this.currentAdress = currentAdress;
    }

    public String getPermanentAdress() {
        return permanentAdress;
    }

    public void setPermanentAdress(String permanentAdress) {
        this.permanentAdress = permanentAdress;
    }
}
