package co.com.qvision.certificaion.demoqa.user_interfaces.elements;

import net.serenitybdd.screenplay.targets.Target;

public class ButtonPage {

    public static final Target DOUBLE_BUTTON =Target.the("Seleccionar doble vez boton").locatedBy("//*[contains(@id,'doubleClick')]");


    public static final Target SALIDA_DoubleBTN= Target.the("Mensaje Doble Button").locatedBy("//*[contains(@id,'doubleClickMessage')]");
}
