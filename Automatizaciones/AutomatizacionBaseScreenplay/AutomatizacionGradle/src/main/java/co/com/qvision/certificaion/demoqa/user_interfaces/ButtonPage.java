package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ButtonPage {
    public static final Target BTN_DOUBLE = Target.the("boton de doble click").locatedBy("//button[contains(text(),'Double Click Me')]");
    public static final Target BTN_RIGHT = Target.the("boton de doble click").locatedBy("//button[contains(text(),'Right Click Me')");
    public static final Target BTN_CLICK = Target.the("boton de doble click").locatedBy("//button[contains(text(),'Click Me')");
    public static final Target MENSAJE_RESULT_DOUBLE = Target.the("boton de doble click").locatedBy("//p[contains(text(),'You have done a double click')]");
    public static final Target MENSAJE_RESULT_RIGTH = Target.the("boton de doble click").locatedBy("//p[contains(text(),'You have done a right click')]");
    public static final Target MENSAJE_RESULT_CLICK = Target.the("boton de doble click").locatedBy("//p[contains(text(),'You have done a dynamic click')]");
}
