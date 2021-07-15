package co.com.qvision.certificaion.demoqa.interactions.servicios;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PrepararServicioInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Post.to("Account/v1/User").with(request -> request.contentType("application/json").body(
               "{\n" +
               "  \"userName\": \"Usuario2\",\n" +
               "  \"password\": \"Contra123.*\"\n" +
               "}")));
    }

    public static PrepararServicioInteraction prepararServicio(){
        return Tasks.instrumented(PrepararServicioInteraction.class);
    }
}
