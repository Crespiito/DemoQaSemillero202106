package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.models.FormData;
import co.com.certificacion.qvision.pages.userinterface.DemoQaGeneralUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.WebElement;

import java.util.List;


@DefaultUrl("https://demoqa.com/")
public class DemoQaGeneralInteraction extends DemoQaGeneralUI {


    public void seleccionarTarjetaForms(String opcion){
        //mapeo multiples elementos
        List<WebElement> lista = getTarjetas();
        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getTarjetaForms(opcion), true);
        getTarjetaForms(opcion).click();

    }


    public FormData ObtenerTituloSeleccionado(){
        return new FormData();
    }
    /*
    public void selectTarjetaForms(){
           //Scroll
        JavascriptExecutorFacade js = new JavascriptExecutorFacade((getDriver()));
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",tarjetaForms, true);

        tarjetaForms.click();
    }

*/
   // public void selectTarjetaForms(){
        //mapeo multiples elementos - obteniendo tarjetas por listas
      /*/  List<WebElement> lista = getTarjetaForms();
        List<WebElement> lista = getTarjetas();
        JavascriptExecutorFacade js = new JavascriptExecutorFacade((getDriver()));
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",getTarjetaForms("Forms"), true);
        getTarjetaForms("Forms").click();

      /* //mapeo un elemento
        JavascriptExecutorFacade js = new JavascriptExecutorFacade((getDriver()));
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",tarjetaElements, true);
        tarjetaElements.click();
}
*/

    //
    /*
    public String ObtenerTituloSeleccionado(){
        //return tituloTarjeta.getText();
        return new tituloTarjeta(tituloTarjeta.getText());
    }
*/
}
