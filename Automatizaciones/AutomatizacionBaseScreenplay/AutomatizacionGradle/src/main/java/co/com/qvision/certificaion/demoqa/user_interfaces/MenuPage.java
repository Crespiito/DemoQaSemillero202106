package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    public static final Target BTN_LATERAL = Target.the(" MENU LATERAL ").locatedBy("//span[contains(text(),'Practice Form')] ");

    public static final Target BTN_FORM = Target.the("Opcion lateral de la pagina principal").locatedBy("//h5[contains(text(),'Forms')] ");



}


