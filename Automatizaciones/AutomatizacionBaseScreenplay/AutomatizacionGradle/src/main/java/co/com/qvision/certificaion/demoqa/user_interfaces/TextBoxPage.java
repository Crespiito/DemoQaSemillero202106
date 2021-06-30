package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxPage {
    public static final Target FISRTNAME = Target.the("PRIMER NOMBRE").locatedBy("//*[@id='userName']");
    public static final Target PERMANTENTADRESS = Target.the("DIRECCION PERMANENTE").locatedBy("//*[@id='permanentAddress']");

}
