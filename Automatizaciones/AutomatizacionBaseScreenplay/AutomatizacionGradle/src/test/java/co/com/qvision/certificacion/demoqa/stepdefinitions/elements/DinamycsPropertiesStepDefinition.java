package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
public class DinamycsPropertiesStepDefinition {

    @Cuando("ingreso los datos validos en cada campo")
    public void ingresoLosDatosValidosEnCadaCampo() {
        System.out.println("entra por given");

    }

    @Entonces("confirmo si el registro se realiza con exito")
    public void confirmoSiElRegistroSeRealizaConExito() {
        System.out.println("entra por when");

    }

    @Cuando("ingreso datos invalidos en los campos")
    public void ingresoDatosInvalidosEnLosCampos() {
        System.out.println("entra por then");

    }
}
