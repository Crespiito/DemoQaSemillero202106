package co.com.qvision.certificaion.demoqa.user_interfaces.Alerts;

import net.serenitybdd.screenplay.targets.Target;

public class AlertsFrameWindowsUI {

    public static final Target BOTON_BROWSERWINDOWS =
            Target.the("Boton Browser Windows").
                    locatedBy("//*[@id=\"item-0\"]/span[contains(text(),'Browser Windows')]");

//Alerts
    public static final Target BOTON_ALERTS =
            Target.the("Boton Alerts").
                    locatedBy("//*[@id=\"item-1\"]/span[contains(text(),'Alerts')]");

    public static final Target BOTON_CLICKME =
            Target.the("Boton Click me- Alerta sencilla").
                    locatedBy("");

    public static final Target BOTON_CLICKME_5 =
            Target.the("Boton Click me- Alerta 5 Segundos").
                    locatedBy("");

    public static final Target BOTON_CLICKME_CONFIRM =
            Target.the("Boton Click me- Alerta confirmar").
                    locatedBy("");

    public static final Target BOTON_CLICKME_TEXTO =
            Target.the("Boton Click me- Alerta Ingresar Texto").
                    locatedBy("");





    public static final Target BOTON_FRAMES =
            Target.the("Boton Frames").
                    locatedBy("//*[@id=\"item-2\"]/span[contains(text(),'Frames')]");


    public static final Target BOTON_NESTEDFRAMES =
            Target.the("Boton  Nested Frames").
                    locatedBy("//*[@id=\"item-3\"]/span[contains(text(),'Nested Frames')]");


    public static final Target BOTON_MODALDIALOGS =
            Target.the("Boton Modal Dialogs").
                    locatedBy("//*[@id=\"item-4\"]/span[contains(text(),'Modal Dialogs')]");


}
