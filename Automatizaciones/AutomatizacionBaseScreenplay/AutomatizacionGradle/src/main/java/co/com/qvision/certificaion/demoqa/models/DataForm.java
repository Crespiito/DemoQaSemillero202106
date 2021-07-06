package co.com.qvision.certificaion.demoqa.models;

public class DataForm {
    private String nombre;
    private String apellido;
    private String correo;
    private String mobil;
    private String genero;

    public DataForm(String nombre, String apellido, String correo, String mobil, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mobil = mobil;
        this.genero = genero;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correro) {
        this.correo = correro;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
