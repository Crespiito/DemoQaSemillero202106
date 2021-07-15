package co.com.certificacion.qvision.pages.userinterface;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQaGeneralUI extends PageObject {

    public WebElement getTarjeta(String dato) {
        return getDriver().findElement(By.xpath("//h5[contains(text(),'" + dato + "')]"));
    }

    public List<WebElement> getTarjetas() {
        return getDriver().findElements(By.xpath("//h5"));
    }

}
