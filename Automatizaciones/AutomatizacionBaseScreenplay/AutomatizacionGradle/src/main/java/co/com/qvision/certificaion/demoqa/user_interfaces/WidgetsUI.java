package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WidgetsUI {

    public static final Target BOTON_ACCORDIAN =
            Target.the("Boton Accordian").
                    locatedBy("//*[@id=\"item-0\"]/span[contains(text(),'Accordian')]");

    public static final Target BOTON_AUTOCOMPLETE =
            Target.the("Boton Auto Complete").
                    locatedBy("//*[@id=\"item-1\"]/span[contains(text(),'Auto Complete')]");


    public static final Target BOTON_DATEPICKER =
            Target.the("Boton Date Picker").
                    locatedBy("//*[@id=\"item-2\"]/span[contains(text(),'Date Picker')]");

    public static final Target BOTON_SLIDER =
            Target.the("Boton Slider").
                    locatedBy("//*[@id=\"item-3\"]/span[contains(text(),'Slider')]");

    public static final Target BOTON_PROGRESSBAR =
            Target.the("Boton Progress Bar").
                    locatedBy("//*[@id=\"item-4\"]/span[contains(text(),'Progress Bar')]");

    public static final Target BOTON_TABS =
            Target.the("Boton Tabs").
                    locatedBy("//*[@id=\"item-5\"]/span[contains(text(),'Tabs')]");

    public static final Target BOTON_TOOLTIPS =
            Target.the("Boton Tool Tips").
                    locatedBy("//*[@id=\"item-6\"]/span[contains(text(),'Tool Tips')]");

    public static final Target BOTON_MENU =
            Target.the("Boton Menu").
                    locatedBy("//*[@id=\"item-7\"]/span[contains(text(),'Menu')]");

    public static final Target BOTON_SELECTMENU =
            Target.the("Boton Select Menu").
                    locatedBy("//*[@id=\"item-8\"]/span[contains(text(),'Select Menu')]");

}
