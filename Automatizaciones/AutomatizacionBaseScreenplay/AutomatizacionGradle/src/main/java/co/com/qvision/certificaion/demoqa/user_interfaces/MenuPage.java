package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {


    //span[contains(text(),'Practice Form')]

    public static final Target BTN_LATERAL = Target.the("Menu lateral").locatedBy("//span[contains(text(),'Practice Form')]");

    public static final Target LBL_LATERAL = Target.the("opcion lateral de la pagina").locatedBy("//span[contains(text(),'{0}')]");

}
