package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.models.FormData;
import co.com.certificacion.qvision.pages.userinterface.DemoQaFormUI;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class DemoQaFormInteraction extends DemoQaFormUI {



    public String setGenero(String genero){
        switch(genero){
            case ("Male"):
                return  "1";
            case ("Female"):
                return "2";
            default:
                return "3";
        }
    }

    public void enviarFormularioBase(FormData datos){
        nombre.sendKeys(datos.getNombre());
        apellido.sendKeys(datos.getApellido());
        telefono.sendKeys(datos.getTelefono());
        correo.sendKeys(datos.getCorreo());
        getGenero(setGenero(datos.getGenero())).click();
        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getCampoID("submit"), true);
        getCampoID("submit").click();
    }

    public FormData obtenerDatosTabla(){
        return new FormData(
                getCampoTabla("1","2").getText().split(" ")[0],
                getCampoTabla("1","2").getText().split(" ")[1],
                getCampoTabla("3","2").getText(),
                getCampoTabla("2","2").getText(),
                getCampoTabla("4","2").getText()
        );
    }
}

