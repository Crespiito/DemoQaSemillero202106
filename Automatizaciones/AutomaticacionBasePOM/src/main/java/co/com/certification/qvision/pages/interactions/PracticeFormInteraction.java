package co.com.certification.qvision.pages.interactions;

import co.com.certification.qvision.models.FormData;
import co.com.certification.qvision.pages.userInterface.PracticeFormUI;

public class PracticeFormInteraction extends PracticeFormUI {
    public void llenarCampos(FormData formData) {
        String genero = "";
        switch (formData.getGenero()) {
            case "Male":
                genero = "gender-radio-1";
                break;
            case "Female":
                genero = "gender-radio-2";
                break;
            case "other":
                genero = "gender-radio-3";
                break;
            default:
                break;
        }

        nombre.sendKeys(formData.getNombre());
        apellido.sendKeys(formData.getApellido());
        correo.sendKeys(formData.getCorreo());
        getGenero(genero);

    }

    public FormData obtenerDatosTabla(){

        return  new FormData("juan","bautista","correo@correo.com","123456789","Female");
    }
}
