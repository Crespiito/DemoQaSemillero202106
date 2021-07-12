package co.com.certificacion.qvision.pages.userinterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQaGeneralUI extends PageObject {

    @FindBy(xpath = "//h5[contains(text(),'Elements')]")
    public WebElementFacade tarjeta;
}
