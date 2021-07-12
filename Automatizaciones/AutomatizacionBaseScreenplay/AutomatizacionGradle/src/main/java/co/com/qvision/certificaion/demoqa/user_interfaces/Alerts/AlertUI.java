package co.com.qvision.certificaion.demoqa.user_interfaces.Alerts;

import net.serenitybdd.screenplay.targets.Target;

public class AlertUI {
    //Alerts
    public static final Target BOTON_ALERTS =
            Target.the("Boton Alerts").
                    locatedBy("//*[@id=\"item-1\"]/span[contains(text(),'Alerts')]");

    public static final Target BOTON_CLICKME =
            Target.the("Boton Click me- Alerta sencilla").
                    locatedBy("//*[@id=\"alertButton\"]");

    public static final Target BOTON_CLICKME_5 =
            Target.the("Boton Click me- Alerta 5 Segundos").
                    locatedBy("//*[@id=\"timerAlertButton\"]");

    public static final Target BOTON_CLICKME_CONFIRM =
            Target.the("Boton Click me- Alerta confirmar").
                    locatedBy("//*[@id=\"confirmButton\"]");

    public static final Target BOTON_CLICKME_TEXTO =
            Target.the("Boton Click me- Alerta Ingresar Texto").
                    locatedBy("//*[@id=\"promtButton\"]");

}
