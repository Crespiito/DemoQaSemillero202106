package co.com.qvision.certificaion.demoqa.models;

public class MenuModel {

    private String modulo;
    private String item;

    public MenuModel(String modulo, String item) {
        this.modulo = modulo;
        this.item = item;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        modulo = modulo;
    }

    public String getIntem() {
        return item;
    }

    public void setIntem(String intem) {
        this.item = intem;
    }
}
