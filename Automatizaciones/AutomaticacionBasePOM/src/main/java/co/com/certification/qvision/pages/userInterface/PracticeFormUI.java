package co.com.certification.qvision.pages.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PracticeFormUI extends PageObject {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElementFacade nombre;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElementFacade apellido;
    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    public WebElementFacade correo;
    @FindBy(xpath = "//*[@id=\"userNumber\"]")
    public  WebElementFacade telefono;

    public WebElement getGenero(String genero){
        return getDriver().findElement(By.xpath("//label[@for='"+genero+"']"));
    }

    public WebElement getSubmit(String submit){
        return getDriver().findElement(By.xpath("//label[@for='"+submit+"']"));
    }

}
