package co.com.certificacion.qvision.services;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.core.Serenity;


public class BookStoreService {

    public static RequestSpecification contruirServicio(){
        return SerenityRest.given().baseUri("https://demoqa.com/").
                contentType("application/json").
                header("charset","UTF-8");
    }

    public static void consumirServicioPost(){

    }
}
