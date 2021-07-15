package co.com.certificacion.qvision.stepdefinitions.services;

import co.com.certification.qvision.steps.BookStoreServicesSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BookStoreServiceStepDefinitions {

    @Steps
    BookStoreServicesSteps bookStoreServicesSteps;

    @Dado("que como ususario quiero consumir el servicio del registro")
    public void queComoUsuarioQuieroConsumirElServicioDelRegistro()
    {
        bookStoreServicesSteps.prepararServiciosDemoQA();
    }

    @Cuando("Consumo el servicio")
        public void ConsumoElServicio(){

        bookStoreServicesSteps.consumirServicioUser();
        }

    @Entonces("valido que en la respuesta el ususario exista")
    public void validoQueEnLaRespuestaElUsusarioExista() {
        bookStoreServicesSteps.validarRespuestaUser();
    }

    }



