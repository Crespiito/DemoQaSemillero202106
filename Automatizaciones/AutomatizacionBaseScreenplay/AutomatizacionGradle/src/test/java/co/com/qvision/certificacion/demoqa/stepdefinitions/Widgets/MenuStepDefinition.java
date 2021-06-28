package co.com.qvision.certificacion.demoqa.stepdefinitions.Widgets;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class MenuStepDefinition {

    @Dado("Yo como usuario ubico la opcion {string}")
    public void yoComoUsuarioUbicoLaOpcion(String string) {
        System.out.println("entro al dado ");
    }

    @Cuando("Seleccione el item {string}")
    public void seleccioneElItem(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item seleccionado cambie de color")
    public void visualiceQueElItemSeleccionadoCambieDeColor() {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione el item {string} o uno de sus sub items")
    public void seleccioneElItemOUnoDeSusSubItems(String string) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item seleccionado cambie de color y me despliegue un listado bajo el")
    public void visualiceQueElItemSeleccionadoCambieDeColorYMeDespliegueUnListadoBajoEl() {
        System.out.println("entro al entonces");
    }

}
