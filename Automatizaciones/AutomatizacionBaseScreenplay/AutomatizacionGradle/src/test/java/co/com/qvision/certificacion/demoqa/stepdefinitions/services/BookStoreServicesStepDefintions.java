package co.com.qvision.certificacion.demoqa.stepdefinitions.services;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static co.com.qvision.certificaion.demoqa.tasks.services.PrepararServicioTask.prepararServicioTask;

public class BookStoreServicesStepDefintions {

    @Dado("que quiero consumir el servicio de registro")
    public void queQuieroConsumirElServicioDeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                prepararServicioTask()
        );

    }

    @Cuando("consumo el servicio")
    public void consumoElServicio() {

    }

    @Entonces("Valido que en la respuesta el usuario exista")
    public void validoQueEnLaRespuestaElUsuarioExista() {
        OnStage.theActorInTheSpotlight().should(
                ResponseConsequence.seeThatResponse("description",
                        response -> response.statusCode(406))
        );
    }
}
