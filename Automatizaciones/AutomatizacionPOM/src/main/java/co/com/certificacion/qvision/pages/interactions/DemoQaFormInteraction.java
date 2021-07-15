package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.pages.userinterface.DemoQaFormUI;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class DemoQaFormInteraction extends DemoQaFormUI {

    public void enviarFormulario(FormDataModel option) {
        nombre.sendKeys(option.getNombre());
        apellido.sendKeys(option.getApellido());
        // Enter.keyValues(option.getEmail()).into(email);
        email.sendKeys(option.getEmail());
        mobile.sendKeys(option.getMobile());
        getGender("1").click();
        Enter.keyValues(option.getSubject()).into(subject);
        currentAddress.sendKeys(option.getCurrentAddress());


        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getCampoID("submit"), true);
        getCampoID("submit").click();
    }

    public FormDataModel obtenerDatosTabla() {
        return new FormDataModel(
                getCampoTabla("1", "2").getText().split(" ")[0],
                getCampoTabla("1", "2").getText().split(" ")[1],
                getCampoTabla("2", "2").getText(),
                getCampoTabla("3", "2").getText(),
                getCampoTabla("4", "2").getText(),
                getCampoTabla("6", "2").getText(),
                getCampoTabla("9", "2").getText()
        );
    }

    public String setGenero(String genero) {
        switch (genero) {
            case ("Male"):
                return "1";
            case ("Female"):
                return "2";
            default:
                return "3";
        }
    }
}
