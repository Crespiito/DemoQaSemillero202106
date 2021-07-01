package co.com.qvision.certificaion.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MoverMouseA implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static MoverMouseA moverMouseA(){
        return instrumented(MoverMouseA.class);
    }
}
