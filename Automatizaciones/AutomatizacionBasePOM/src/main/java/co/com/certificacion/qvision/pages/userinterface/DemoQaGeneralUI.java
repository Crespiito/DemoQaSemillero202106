package co.com.certificacion.qvision.pages.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQaGeneralUI extends PageObject {

    @FindBy(xpath = "//h5[contains(text(),'Forms')]")
    public WebElementFacade tarjetaForms;


//Header
    @FindBy(xpath =  "//*[@id=\"app\"]/div/div/div[1]/div")
    public WebElementFacade tituloTarjeta;


/*
    public WebElementFacade getTarjetaForms(String data){
       return  getDriver().findElement(By.xpath("//h5[contains(text(),'"+dato+"')]"));
    }
*/


    @FindBy(xpath = "//h5[contains(text(),'Elements')]")
    public WebElementFacade tarjetaElements;

    @FindBy(xpath = "//h5[contains(text(),'Widgets')]")
    public WebElementFacade tarjetaWidgets;

    @FindBy(xpath = "//h5[contains(text(),'Alerts')]")
    public WebElementFacade tarjetaAlertsFrameWindows;
}
