package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.pages.userinterface.DemoQaSubMenuUI;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class DemoQaSubMenuPageInteraction extends DemoQaSubMenuUI {

    public void seleccionarOpcionSubMenu(String opcion){
        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getOpcion(opcion), true);
        getOpcion(opcion).click();
    }

}
