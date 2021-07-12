package co.com.qvision.certificaion.demoqa.models;

public class AlertModel {
    private String boton;
    private String mensaje;

    public AlertModel(String boton, String mensaje) {
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
