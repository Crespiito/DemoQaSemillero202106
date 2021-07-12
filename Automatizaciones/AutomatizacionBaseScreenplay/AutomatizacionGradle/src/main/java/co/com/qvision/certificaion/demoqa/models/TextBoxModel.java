package co.com.qvision.certificaion.demoqa.models;

public class TextBoxModel {
    public String fullName;
    public String email;
    public String currentAdress;
    public String permantenAdress;

    public TextBoxModel(String fullName, String email, String currentAdress, String permantenAdress) {
        this.fullName = fullName;
        this.email = email;
        this.currentAdress = currentAdress;
        this.permantenAdress = permantenAdress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getPermantenAdress() {
        return permantenAdress;
    }

    public void setPermantenAdress(String permantenAdress) {
        this.permantenAdress = permantenAdress;
    }
}
