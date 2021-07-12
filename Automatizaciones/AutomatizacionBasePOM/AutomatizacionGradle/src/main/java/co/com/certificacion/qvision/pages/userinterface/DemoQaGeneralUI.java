package co.com.certificacion.qvision.pages.userinterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class DemoQaGeneralUI extends PageObject {

    @FindBy(xpath = "//div[@class='main-header']")
    public WebElementFacade titulo;

    public WebElement getTarjeta(String dato) {
        return getDriver().findElement(By.xpath("//h5[contains(text(),'"+dato+"')]"));
    }

    public WebElement getCapoID(String dato) {
        return getDriver().findElement(By.xpath("//*[@id='"+dato+"']"));
    }
    public List<WebElement> getTarjetas() {
        return getDriver().findElements(By.xpath("//h5"));
    }
}
