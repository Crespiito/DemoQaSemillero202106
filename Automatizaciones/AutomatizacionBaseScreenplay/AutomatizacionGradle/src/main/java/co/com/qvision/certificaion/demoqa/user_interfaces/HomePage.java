package co.com.qvision.certificaion.demoqa.user_interfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_TARJETA = Target.the("Tarjeta Elements")
            .locatedBy("//h5[contains(text(), '{0}')]");

    public static final Target BTN_TARJETA_ELEMENTS = Target.the("Tarjeta Elements")
            .locatedBy("//h5[contains(text(), 'Elements')]");

    public static final Target BTN_TARJETA2 = Target.the("Tarjeta Elements")
            .locatedBy("//h5[contains(text(), 'Forms')]");
}

