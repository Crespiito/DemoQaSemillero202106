package co.com.qvision.certificaion.demoqa.user_interfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_TARJETA_ELEMENTS = Target.the("Tarjeta Elements")
            .locatedBy("//h5[contains(text(), 'Elements')]");
    public static final Target BTN_TARJETA_FORMS = Target.the("Tarjeta Elements")
            .locatedBy("//h5[contains(text(), 'Forms')]");
    public static final Target BTN_TARJETA_ALERTS = Target.the("Tarjeta Elements")
            .locatedBy("//h5[contains(text(), 'Alerts, Frame & Windows')]");

}
<h5>Alerts, Frame &amp; Windows</h5>