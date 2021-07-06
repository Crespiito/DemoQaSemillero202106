package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class NewMenuPage {
    public static  final Target btn_FORM = the("primera iteraccion en el modulo {0}").locatedBy("//h5[contains(text(),'{0}')]");
    public static  final Target btn_LATERAl = the("ingresar a {0}").locatedBy("//span[contains(text(),'{0}')]");
}
