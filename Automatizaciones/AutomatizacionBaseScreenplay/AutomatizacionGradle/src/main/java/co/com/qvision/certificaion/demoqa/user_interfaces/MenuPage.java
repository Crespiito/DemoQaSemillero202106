package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {


    public static final Target BTN_FORM = Target.the("Opcion lateral de la pagina principal").locatedBy
            ("//h5[contains(text(),'{0}')] ");


    public static final Target BTN_ITEMLATERAL = Target.the("Seleccionar item menu").locatedBy("//span[contains(text(),'{0}')]");

}


