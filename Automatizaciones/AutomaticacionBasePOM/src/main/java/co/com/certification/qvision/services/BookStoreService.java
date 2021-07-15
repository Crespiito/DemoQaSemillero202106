package co.com.certification.qvision.services;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class BookStoreService{

    public static RequestSpecification contruirServicio(){
        return SerenityRest.given()
                .baseUri("https://demoqa.com/")
                .contentType("application/json")
                .header("charset","=utf-8");
    }


    public static Response consumirServicioPost(RequestSpecification requestSpecification){
        return requestSpecification.when().post();
    }
}
