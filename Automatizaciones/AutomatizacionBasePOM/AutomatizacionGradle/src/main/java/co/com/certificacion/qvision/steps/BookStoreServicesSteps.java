package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.models.services.request.DataServiceModel;
import co.com.certificacion.qvision.models.services.responses.BodyUserResponse;
import co.com.certificacion.qvision.models.services.responses.DataServiceResponse;
import co.com.certificacion.qvision.services.BookStoreService;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import static co.com.certificacion.qvision.services.BookStoreService.consumirServicioPost;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BookStoreServicesSteps {



    @Step
    public void prepararServicioDemoQa(){
        Serenity.setSessionVariable("ServiceConf").to(BookStoreService.construirServicio());
    }

    @Step
    public void consumirServicioUser(DataServiceModel dataService) {
        RequestSpecification request = Serenity.sessionVariableCalled("ServiceConf");
        request.basePath("Account/v1/User");
        request.body(dataService).log().body();
        Serenity.setSessionVariable("UserResponse").to(consumirServicioPost(request));

    }

    @Step
    public static void validarRespuestaUser(BodyUserResponse dataService) {
        restAssuredThat(lastResponse -> lastResponse.body(sameBeanAs(dataService.toString())).and().statusCode(Integer.parseInt(dataService.getStatusCode())));
        Response response = Serenity.sessionVariableCalled("UserResponse");
        assertThat("el codigo de respuesta no es correcto",response.getStatusCode(),equalTo(Integer.parseInt(dataService.getStatusCode())));
        assertThat("el Cuerpo de respuesta no conicide",response.jsonPath().getObject("", BodyUserResponse.class),sameBeanAs(dataService).ignoring("statusCode"));

    }
}
