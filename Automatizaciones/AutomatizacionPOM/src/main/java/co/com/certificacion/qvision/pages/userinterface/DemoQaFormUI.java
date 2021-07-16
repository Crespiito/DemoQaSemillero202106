package co.com.certificacion.qvision.pages.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQaFormUI extends PageObject {

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElementFacade nombre;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElementFacade apellido;

    @FindBy(xpath = "//*[@id='userEmail']")
    public WebElementFacade email;

    @FindBy(xpath = "//*[@id='userNumber']")
    public WebElementFacade mobile;

    public WebElement getGender(String dato) {
        return getDriver().findElement(By.xpath("//*[@for='gender-radio-" + dato + "']"));
    }

    @FindBy(xpath = "//*[@id='subjectsInput']")
    public WebElementFacade subject;

    @FindBy(xpath = "//*[@id='currentAddress']")
    public WebElementFacade currentAddress;

    public WebElement getCampoTabla(String dato1, String dato2) {
        return getDriver().findElement(By.xpath(" //table/tbody/tr[" + dato1 + "]/td[" + dato2 + "]"));
    }

    public WebElement getCampoID(String dato) {
        return getDriver().findElement(By.xpath("//*[@id='" + dato + "']"));
    }

}


