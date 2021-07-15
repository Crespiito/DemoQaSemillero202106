package co.com.certification.qvision.pages.userInterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQaSubMenuUI extends PageObject {


    public WebElement getSubmenu(String dato){
        return getDriver().findElement(By.xpath("//span[contains(text(),'"+dato+"')]"));
    }


    public WebElement getTarjeta(String dato){
        return getDriver().findElement(By.xpath("//h5[contains(text(),'"+dato+"')]"));
    }
}
