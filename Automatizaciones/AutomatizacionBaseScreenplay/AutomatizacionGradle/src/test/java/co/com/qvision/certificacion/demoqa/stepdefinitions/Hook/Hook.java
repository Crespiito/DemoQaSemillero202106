package co.com.qvision.certificacion.demoqa.stepdefinitions.Hook;
import co.com.qvision.certificaion.demoqa.models.DataForm;
import co.com.qvision.certificaion.demoqa.models.MenuModel;
import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actions.Open;

import  net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class Hook {


    @Before()
    public void abrirNavegador(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Miguel");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }


}
