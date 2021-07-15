package co.com.certification.qvision.pages.userInterface;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQaGeneralUI extends PageObject {

    public WebElement getTargeta(String dato){
        return getDriver().findElement(By.xpath("//h5[contains(text(),'"+dato+"')]"));
    }
    public WebElement getSubMenu(String dato){
        return getDriver().findElement(By.xpath("//span[contains(text(),'"+dato+"')]"));
    }

    public WebElement getSubmit(String  dato){
        return  getDriver().findElement(By.xpath("//*[@id='"+dato+"']"));
    }
}
