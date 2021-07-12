package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.pages.userinterface.DemoQaGeneralUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://demoqa.com/")
public class DemoQaGeneralInteraction extends DemoQaGeneralUI {

    public void selectTarjetaForms(){
           //Scroll
        JavascriptExecutorFacade js = new JavascriptExecutorFacade((getDriver()));
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",tarjetaForms, true);

        tarjetaForms.click();
    }

    public void selectTarjetaElements(){
     /*   //mapeo multiples elementos
        List<WebElement> lista = getTarjetaForms();
        JavascriptExecutorFacade js = new JavascriptExecutorFacade((getDriver()));
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",tarjetaForms, true);
        getTarjetaForms("Forms").click();
*/
       //mapeo un elemento
        JavascriptExecutorFacade js = new JavascriptExecutorFacade((getDriver()));
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",tarjetaElements, true);
        tarjetaElements.click();

    }

    //
    public String ObtenerTituloSeleccionado(){
        return tituloTarjeta.getText();
        //return new Titulo(tituloTarjeta.getText());
    }
}
