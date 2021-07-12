package co.com.qvision.certificaion.demoqa.models.Elements.Links;

public class LinksData {

    String link;
    String mensaje;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    public LinksData(String link, String mensaje){
        this.link = link;
        this.mensaje= mensaje;
    }


}
