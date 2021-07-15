package co.com.certification.qvision.pages.interactions;

import co.com.certification.qvision.pages.userInterface.DemoQaSubMenuUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

@DefaultUrl("https://demoqa.com/")
public class DemoQaMenuInteraction extends DemoQaSubMenuUI {


    public void seleccionarTarjeta(String opcion){

        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",getTarjeta(opcion), true);
        getTarjeta(opcion).click();

    }

    public void seleccionarOpcionSubMenu(String opcion){

        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);",getSubmenu(opcion), true);
        getSubmenu(opcion).click();

    }
}
