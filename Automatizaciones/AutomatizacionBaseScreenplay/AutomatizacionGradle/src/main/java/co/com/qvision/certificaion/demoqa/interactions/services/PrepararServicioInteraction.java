package co.com.qvision.certificaion.demoqa.interactions.services;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrepararServicioInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("Account/v1/User").with(request -> request.contentType("application/json").body(
                        "{\n" +
                                "  \"userName\": \"pruebaJpahe\",\n" +
                                "  \"password\": \"Abcd1234.*\"\n" +
                                "}"
                        )
                )
        );
    }

    public static PrepararServicioInteraction prepararServicio() {
        return instrumented(PrepararServicioInteraction.class);
    }


}
