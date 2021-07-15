package co.com.certification.qvision.steps;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import co.com.certification.qvision.services.BookStoreService;
import static co.com.certification.qvision.services.BookStoreService.consumirServicioPost;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookStoreServicesSteps {

    @Step
    public void prepararServiciosDemoQA()
    {
        Serenity.setSessionVariable("RequestService").to(BookStoreService.contruirServicio());
    }

    @Step
    public void consumirServicioUser() {
        RequestSpecification request = Serenity.sessionVariableCalled("RequestService");
        request.basePath("Account/v1/User");
        request.body(
                "{ \n" +
                        "\"userName\": \"Thor\",\n" +
                        "\"password\": \"Thor1234*\"\n" +
                        "}"
        );

        Serenity.setSessionVariable("UserResponse").to(consumirServicioPost(request));
    }

    @Step
    public void validarRespuestaUser() {
        Response response = Serenity.sessionVariableCalled("UserResponse");
        assertThat("codigo de respuesta no coincide", response.getStatusCode(),equalTo(406));
        assertThat("body de respuesta no coincide", response.body().asString() ,equalTo(
                "{\"code\":\"1204\",\"message\":\"User exists!\"}"
        ));

        // expect().that().statusCode(200).and().body("code",equalTo("1204"));

    }
}
