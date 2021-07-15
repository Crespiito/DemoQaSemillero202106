package co.com.certification.qvision.pages.interactions;

import co.com.certification.qvision.models.FormData;
import co.com.certification.qvision.pages.userInterface.PracticeFormUI;

public class DemoQaFormInteraction extends PracticeFormUI {

    public void EnviarFormulario(FormData data){

        nombre.sendKeys(data.getNombre());
        apellido.sendKeys(data.getApellido());
        correo.sendKeys(data.getCorreo());
        telefono.sendKeys(data.getTelefono());
        getGenero("1").click();
        getSubmit("submit").click();

    }

}
