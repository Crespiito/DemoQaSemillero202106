package co.com.certificacion.qvision.pages.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQaSubMenuUI extends PageObject {


    public WebElement getOpcion(String dato) {
        return getDriver().findElement(By.xpath("//span[contains(text(),'"+dato+"')]"));
    }
}