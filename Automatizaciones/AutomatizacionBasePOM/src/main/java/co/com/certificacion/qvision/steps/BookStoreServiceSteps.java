package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.services.BookStoreService;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BookStoreServiceSteps {

    @Step
    public void prepararServicioDemoQA(){
        Serenity.setSessionVariable("ServiceConf").to(BookStoreService.contruirServicio());
    }

    @Step
    public void consumirServicioUser(){
        RequestSpecification request = Serenity.sessionVariableCalled("ServiceConf");
        request.basePath("Account/v1/User");

    }
}
