package co.com.qvision.certificaion.demoqa.user_interfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_TARJETA = Target.the("Tarjeta Elements")
            .locatedBy("//h5[contains(text(), '{0}')]");


}

