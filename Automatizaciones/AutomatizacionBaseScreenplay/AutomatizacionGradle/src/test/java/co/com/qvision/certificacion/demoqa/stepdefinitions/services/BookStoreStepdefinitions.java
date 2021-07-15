package co.com.qvision.certificacion.demoqa.stepdefinitions.services;

import co.com.qvision.certificaion.demoqa.tasks.servicios.PrepararServicioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class BookStoreStepdefinitions {

    @Dado("que quiero consumir el servicio de registro")
    public void queQuieroConsumirElServicioDeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(PrepararServicioTask.prepararServicio());
    }

    @Cuando("consumo el servicio")
    public void consumoElServicio() {

    }

    @Entonces("Valido que en la respuesta el usuario exista")
    public void validoQueEnLaRespuestaElUsuarioExista() {
        OnStage.theActorInTheSpotlight().should(seeThatResponse("descripcion",response -> response.statusCode(406)));
    }

}
