package co.com.qvision.certificaion.demoqa.models;

public class ButtonModel {

    private String boton;
    private String mensaje;

    public ButtonModel(String boton, String mensaje) {
        this.boton = boton;
        this.mensaje = mensaje;
    }

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
