package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {



    public static final Target TARJETA_FORM = Target.the("tarjeta de la pagina principal home ").locatedBy("//h5[contains(text(),'Elements')]");


    public static final Target BTN_TARJETA = Target.the( "tarjeta Principal").locatedBy("//h5[contains(text(),'Forms')]");
}

