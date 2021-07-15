package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.models.FormDataModel;
import co.com.certificacion.qvision.models.OpcionesMenuModel;
import co.com.certificacion.qvision.pages.userinterface.DemoQaGeneralUI;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;


@DefaultUrl("https://www.demoqa.com/")
public class DemoQaGeneralInteractions extends DemoQaGeneralUI {

    public void seleccionarTarjeta(String option) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getTarjeta(option), true);
        getTarjeta(option).click();

    }

    public FormDataModel ObtenerTituloSeleccionado(){
        return new FormDataModel();
    }
}
