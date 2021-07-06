package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import co.com.qvision.certificaion.demoqa.models.FormData;
import co.com.qvision.certificaion.demoqa.models.OpcionMenuModel;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Hooks {

    @Before("@Test")

    public void abrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));

    }

    @DataTableType
    public OpcionMenuModel menuModel(Map<String,String> datos){
        return new OpcionMenuModel(datos.get("La Tarjeta"), datos.get("Seleccionado"));

    }

    @DataTableType
    public FormData formData(Map<String, String> datos){
        return new FormData(
                datos.get("nombre"),
                datos.get("apellido"),
                datos.get("correo"),
                datos.get("telefono"),
                datos.get("genero")

        );
    }

    }



   /* @Before("@Test1")

    public void abrirNavegadorforms(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/automation-practice-form"));

    }
*/


