package co.com.qvision.certificaion.demoqa.models;

public class TextBoxModel {

    String name;
    String mail;
    String cuAdd;
    String peAdd;

    public TextBoxModel(String name, String mail, String cuAdd, String peAdd) {
        this.name = name;
        this.mail = mail;
        this.cuAdd = cuAdd;
        this.peAdd = peAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCuAdd() {
        return cuAdd;
    }

    public void setCuAdd(String cuAdd) {
        this.cuAdd = cuAdd;
    }

    public String getPeAdd() {
        return peAdd;
    }

    public void setPeAdd(String peAdd) {
        this.peAdd = peAdd;
    }
}
