package co.com.certificacion.qvision.stepdefinitions.services;

import co.com.certificacion.qvision.models.services.request.DataServiceModel;
import co.com.certificacion.qvision.models.services.responses.BodyUserResponse;
import co.com.certificacion.qvision.models.services.responses.DataServiceResponse;
import co.com.certificacion.qvision.steps.BookStoreServiceSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BookStoreStepDefinition {


    @Steps
    BookStoreServiceSteps bookStoreServiceSteps;

    @Dado("que quiero consumir el servicio de registro")
    public void queQuieroConsumirElServicioDeRegistro() {
        bookStoreServiceSteps.prepararServicioDemoQa();
    }


    @Cuando("consumo el servicio")
    public void consumoElServicio(DataServiceModel dataService) {
        bookStoreServiceSteps.consumirServicioUser(dataService);
    }

    @Entonces("valido que en la respuesta el usuario exista")
    public void validoQueEnLaRespuestaElUsuarioExista(BodyUserResponse dataService) {
        bookStoreServiceSteps.validarRespuestaUser(dataService);

    }



}