package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AlertsUI {

    public static final Target BOTON_TEXTBOX =
            Target.the("Boton Browser Windows").
                    locatedBy("//*[@id=\"item-0\"]/span[contains(text(),'Browser Windows')]");


    public static final Target BOTON_ALERTS =
            Target.the("Boton Alerts").
                    locatedBy("//*[@id=\"item-1\"]/span[contains(text(),'Alerts')]");


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
