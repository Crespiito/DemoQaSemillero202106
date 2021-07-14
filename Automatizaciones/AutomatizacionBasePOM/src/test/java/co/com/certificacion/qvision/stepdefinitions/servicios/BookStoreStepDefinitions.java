package co.com.certificacion.qvision.stepdefinitions.servicios;

import co.com.certificacion.qvision.steps.BookStoreServiceSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BookStoreStepDefinitions {

    @Steps
    BookStoreServiceSteps bookStoreServiceSteps;

    //Se hace la preparacion
    @Dado("que quiero consumir el servicio del registro")
    public void queQuieroConsumirElServicioDelRegistro() {
        bookStoreServiceSteps.prepararServicioDemoQA();

    }


    //Se hace el consumo
    @Cuando("consumo el servicio")
    public void consumoElServicio() {
        bookStoreServiceSteps.consumirServicioUser();
    }


    //Se hace las validaciones
    @Entonces("valido que en la respuesta el usuario exista")
    public void validoQueEnLaRespuestaElUsuarioExista() {

    }
}
