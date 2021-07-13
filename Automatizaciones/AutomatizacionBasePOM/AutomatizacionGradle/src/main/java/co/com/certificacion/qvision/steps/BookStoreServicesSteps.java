package co.com.certificacion.qvision.steps;

import co.com.certificacion.qvision.services.BookStoreService;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import static co.com.certificacion.qvision.services.BookStoreService.consumirServicioPost;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BookStoreServicesSteps {

    @Step
    public static void validarRespuestaUser() {
        Response response = Serenity.sessionVariableCalled("UserResponse");
        assertThat("el codigo de respuesta no es correcto",response.getStatusCode(),equalTo(406));
        assertThat("el Cuerpo de respuesta no conicide",response.body().asString(),equalTo("{\"code\":\"1204\",\"message\":\"User exists!\"}"));
    }

    @Step
    public void prepararServicioDemoQa(){
        Serenity.setSessionVariable("ServiceConf").to(BookStoreService.construirServicio());
    }

    @Step
    public void consumirServicioUser() {
        RequestSpecification request = Serenity.sessionVariableCalled("ServiceConf");
        request.basePath("Account/v1/User");
        request.body(
                "{\n" +
                        "    \"userName\": \"UsuarioQa\",\n" +
                        "    \"password\": \"Demo123*\"\n" +
                        "}\n"
        ).log().body();
        Serenity.setSessionVariable("UserResponse").to(consumirServicioPost(request));

    }
}
