package co.com.qvision.certificaion.demoqa.interactions.services;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PrepararServiceInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("Account/v1/User").with(request->request.contentType("application/json").body(
                "{\n" +
                "  \"userName\": \"Ana\",\n" +
                "  \"password\": \"Ana1234*\"\n" +
                "}")
        ));
    }


    public static PrepararServiceInteraction prepararService(){
        return Tasks.instrumented(PrepararServiceInteraction.class);
    }
}
