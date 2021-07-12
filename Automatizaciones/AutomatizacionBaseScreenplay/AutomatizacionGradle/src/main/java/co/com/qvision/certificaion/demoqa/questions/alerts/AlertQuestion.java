package co.com.qvision.certificaion.demoqa.questions.alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        BrowseTheWeb.as(actor).waitFor(ExpectedConditions.alertIsPresent());
        return BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
    }
    public  static AlertQuestion alertQuestion(){
        return new AlertQuestion();
    }
}
