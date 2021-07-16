package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.pages.userinterface.DemoQaFormUI;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.Keys;

public class DemoQaFormInteraction extends DemoQaFormUI {

    public void enviarFormulario(FormDataModel option) {
        nombre.sendKeys(option.getNombre());
        apellido.sendKeys(option.getApellido());
        email.sendKeys(option.getEmail());
        getGender(setGenero(option.getGenero())).click();
        mobile.sendKeys(option.getMobile());
        subject.sendKeys(option.getSubject());
        subject.sendKeys(Keys.ENTER);
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
