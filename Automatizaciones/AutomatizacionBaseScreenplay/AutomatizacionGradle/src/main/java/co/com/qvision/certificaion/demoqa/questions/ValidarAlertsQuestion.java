package co.com.qvision.certificaion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ValidarAlertsQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        BrowseTheWeb.as(actor).waitFor(ExpectedConditions.alertIsPresent());
        String texto = BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
        //Actions a = new Actions(BrowseTheWeb.as(actor).getDriver());
        //a.contextClick(BrowseTheWeb.as(actor).getDriver().findElement(By.xpath("//*[@id='rightClickBtn']"))).perform();
        return texto;
    }

    public static ValidarAlertsQuestion validarAlertsQuestion() {
        return new ValidarAlertsQuestion();
    }
}
