package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RadioButtonPage {

    public static Target RB_YES = Target.the("primer boton de los alerts").locatedBy("//label[contains(text(),'{0}')]");
    public static Target ME_YES = Target.the("primer boton de los alerts").locatedBy("//label[contains(text(),'Yes')]");



}
