package co.com.qvision.certificacion.demoqa.stepdefinitions.services;

import co.com.qvision.certificaion.demoqa.tasks.services.PrepararServicioTask;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class BookStoreServicesStepDefinitions {

    @Dado("que como ususario quiero consumir el servicio del registro")
    public void queComoUsusarioQuieroConsumirElServicioDelRegistro() {

       OnStage.theActorInTheSpotlight().attemptsTo(PrepararServicioTask.prepararServicio());




        /*OnStage.theActorInTheSpotlight()
                .attemptsTo(Get.resource("Account/v1/User/{id}")
                .with(request -> request
                        .pathParam("id", 1)));
    */
    }

    @Cuando("Consumo el servicio")
    public void consumoElServicio() {
        System.out.println("Aasfd");
    }

    @Entonces("valido que en la respuesta el ususario exista")
    public void validoQueEnLaRespuestaElUsusarioExista() {
        OnStage.theActorInTheSpotlight()
                .should(seeThatResponse("Description", response ->response.statusCode(406)));
    }

}
