package co.com.certificacion.qvision.pages.userinterface;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemoQaGeneralUI extends PageObject {

//Header
    @FindBy(xpath =  "//*[@id=\"app\"]/div/div/div[1]/div")
    public WebElementFacade tituloTarjeta;


    public WebElement getTarjetaForms(String dato){
       return  getDriver().findElement(By.xpath("//h5[contains(text(),'"+dato+"')]"));
    }

    public List<WebElement> getTarjetas() {
        return getDriver().findElements(By.xpath("//h5"));
    }

    public WebElement getCampoID(String dato) {
        return getDriver().findElement(By.xpath("//*[@id='"+dato+"']"));
    }









    @FindBy(xpath = "//h5[contains(text(),'Elements')]")
    public WebElementFacade tarjetaElements;

    @FindBy(xpath = "//h5[contains(text(),'Widgets')]")
    public WebElementFacade tarjetaWidgets;

    @FindBy(xpath = "//h5[contains(text(),'Alerts')]")
    public WebElementFacade tarjetaAlertsFrameWindows;
}
