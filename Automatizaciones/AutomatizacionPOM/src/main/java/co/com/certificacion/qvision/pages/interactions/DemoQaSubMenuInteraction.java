package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.pages.userinterface.DemoQaSubMenuUI;
import org.openqa.selenium.JavascriptExecutor;

public class DemoQaSubMenuInteraction extends DemoQaSubMenuUI {

    public void seleccionarOpcionElements(String option){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getOption(option), true);
        getOption(option).click();
    }







}
