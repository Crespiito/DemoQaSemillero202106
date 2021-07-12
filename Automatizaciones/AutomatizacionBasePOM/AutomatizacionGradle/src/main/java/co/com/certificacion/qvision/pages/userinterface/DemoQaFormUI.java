package co.com.certificacion.qvision.pages.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQaFormUI extends PageObject {

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElementFacade nombre;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElementFacade apellido;

    @FindBy(xpath = "//*[@id='userEmail']")
    public WebElementFacade correo;

    @FindBy(xpath = "//*[@id='userNumber']")
    public WebElementFacade telefono;

    public WebElement getGenero(String dato) {
        return getDriver().findElement(By.xpath("//*[@for='gender-radio-"+dato+"']"));
    }

    public WebElement getCapoID(String dato) {
        return getDriver().findElement(By.xpath("//*[@id='"+dato+"']"));
    }

    public WebElement getCampoTabla(String dato1 ,String dato2) {
        return getDriver().findElement(By.xpath(" //table/tbody/tr["+dato1+"]/td["+dato2+"]"));
    }


}
