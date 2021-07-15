package co.com.qvision.certificaion.demoqa.models;

public class RadioButtonModel {

   private String button;
   private String message;

    public RadioButtonModel(String button, String message) {
        this.button = button;
        this.message = message;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
