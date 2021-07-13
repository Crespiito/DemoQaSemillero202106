package co.com.certificacion.qvision.stepdefinitions.services;

import co.com.certificacion.qvision.steps.BookStoreServicesSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BookStoreStepdefinitions {

    @Steps
    BookStoreServicesSteps bookStoreServicesSteps;

    @Dado("que quiero consumir el servicio de registro")
    public void queQuieroConsumirElServicioDeRegistro() {
        bookStoreServicesSteps.prepararServicioDemoQa();
    }


    @Cuando("consumo el servicio")
    public void consumoElServicio() {
        bookStoreServicesSteps.consumirServicioUser();
    }

    @Entonces("valido que en la respuesta el usuario exista")
    public void validoQueEnLaRespuestaElUsuarioExista() {
        bookStoreServicesSteps.validarRespuestaUser();

    }



}
