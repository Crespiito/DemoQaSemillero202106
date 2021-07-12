package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.models.FormData;
import co.com.certificacion.qvision.pages.userinterface.DemoQaGeneralUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.WebElement;

import java.util.List;


@DefaultUrl("https://demoqa.com/")
public class DemoQaGeneralInteractions extends DemoQaGeneralUI {

    public void seleccionarTarjetaElements(String opcion){
        //mapeo multiples elementos
        List<WebElement> lista = getTarjetas();
        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getTarjeta(opcion), true);
        getTarjeta(opcion).click();

    }


    public FormData ObtenerTituloSeleccionado(){
        return new FormData();
    }
}
