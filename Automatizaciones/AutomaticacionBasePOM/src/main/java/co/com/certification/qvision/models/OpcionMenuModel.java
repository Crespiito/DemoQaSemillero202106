package co.com.certification.qvision.models;

public class OpcionMenuModel  {

    private String opcion;
    private String submenu;

    public OpcionMenuModel(String opcion, String submenu) {
        this.opcion = opcion;
        this.submenu = submenu;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getSubmenu() {
        return submenu;
    }

    public void setSubmenu(String submenu) {
        this.submenu = submenu;
    }
}
