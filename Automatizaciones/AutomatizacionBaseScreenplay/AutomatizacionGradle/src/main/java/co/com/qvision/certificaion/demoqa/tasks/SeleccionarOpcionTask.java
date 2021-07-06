package co.com.qvision.certificaion.demoqa.tasks;



import co.com.qvision.certificaion.demoqa.interactions.SeleccionarOpcionesInicialesInteraction;
import co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeleccionarOpcionesInicialesInteraction.seleccionar());

    }


    public static SeleccionarOpcionTask seleccionarOpcion(){
        return Tasks.instrumented(SeleccionarOpcionTask.class);
    }




}




