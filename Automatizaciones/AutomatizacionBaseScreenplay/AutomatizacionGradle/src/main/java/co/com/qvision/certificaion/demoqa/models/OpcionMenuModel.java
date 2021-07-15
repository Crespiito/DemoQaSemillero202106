package co.com.qvision.certificaion.demoqa.models;

public class OpcionMenuModel {

    private String opciones;
    private String submenu;

    public OpcionMenuModel(String opcion, String submenu) {
        this.opciones = opcion;
        this.submenu = submenu;
    }

    public String getOpcion() {
        return opciones;
    }

    public void setOpcion(String opcion) {
        this.opciones = opcion;
    }

    public String getSubmenu() {
        return submenu;
    }

    public void setSubmenu(String submenu) {
        this.submenu = submenu;
    }
}


