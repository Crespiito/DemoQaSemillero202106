package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementsUI {

//Text Box
    public static final Target BOTON_TEXTBOX =
            Target.the("Boton Text Box").
            locatedBy("//*[@id=\"item-0\"]/span[contains(text(),\"Text Box\")]");

    public static final Target BOTON_CHECKBOX =
            Target.the("Boton Check Box").
                    locatedBy("//*[@id=\"item-1\"]/span[contains(text(),\"Check Box\")]");

    public static final Target BOTON_RADIOBUTTON =
            Target.the("Boton Check Box").
                    locatedBy("//*[@id=\"item-2\"]/span[contains(text(),\"Radio Button\")]");

    public static final Target BOTON_WEBTABLES =
            Target.the("Boton Web Tables").
                    locatedBy("//*[@id=\"item-3\"]/span[contains(text(),\"Web Tables\")]");

    public static final Target BOTON_BUTTONS =
            Target.the("Boton Buttons").
                    locatedBy("//*[@id=\"item-4\"]/span[contains(text(),\"Buttons\")]");

    public static final Target BOTON_LINKS =
            Target.the("Boton Links").
                    locatedBy("//*[@id=\"item-5\"]/span[contains(text(),\"Links\")]");

    public static final Target BOTON_BROKENLINKSIMAGES =
            Target.the("Boton Broken Links").
                    locatedBy("//*[@id=\"item-6\"]/span[contains(text(),\"Broken Links - Images\")]");


    public static final Target BOTON_UPLOADDOWNLOAD =
            Target.the("Boton Upload and Download ").
                    locatedBy("//*[@id=\"item-7\"]/span[contains(text(),\"Upload and Download\")]");


    public static final Target BOTON_DYNAMICPROPERTIES =
            Target.the("Boton Dynamic Properties").
                    locatedBy("//*[@id=\"item-8\"]/span[contains(text(),\"Dynamic Properties\")]");


}
