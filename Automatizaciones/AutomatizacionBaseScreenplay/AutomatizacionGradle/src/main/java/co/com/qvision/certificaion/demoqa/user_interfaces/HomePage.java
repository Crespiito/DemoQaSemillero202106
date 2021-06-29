package co.com.qvision.certificaion.demoqa.user_interfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target TARJETA_FORM = Target.the("terjeta de formularios de la pagina principal").locatedBy("//h5[contains(text(),'{0}')]");

    public static final Target BTN_TARJETA = Target.the("tarjeta principal").locatedBy("//h5[contains(text(),'Forms')]");



}
