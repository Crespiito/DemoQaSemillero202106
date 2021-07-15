package co.com.qvision.certificaion.demoqa.user_interfaces.elements;


import net.serenitybdd.screenplay.targets.Target;

public class RadioButtonPage {

    public static final Target RADIO_YES = Target.the("Button Yes").locatedBy("//label[contains(@for,'yesRadio')]");

    public static final Target RADIO_IMPRESSIVE = Target.the("BUTTON IMPRESSIVE").locatedBy
            ("//label[contains(@for,'impressiveRadio')]");

   // public static final Target NO = Target.the("Pasar con el cursor en NO").locatedBy("//label[contains(@for,'noRadio')]");

    public static final Target BTNYES_SALIDA = Target.the("Respuesta al boton Yes").locatedBy("//span[contains(text(),'Yes')]");

    public static final Target BTN_IMPRESSIVE = Target.the("Respuesta del boton Impressive").locatedBy("//span[contains(text(),'Impressive')]");

}
