package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    //MODULOS
    public static final Target LBL_LEFT_SUB_MENU = Target.the("label menu izquierdo").
            locatedBy("//span[contains(text(), '{0}')]");

    public static final Target LBL_LEFT_SUB_MENU_TEXT_BOX = Target.the("label menu izquierdo").
            locatedBy("//span[contains(text(), 'Text Box')]");

    //MODULO ELEMENTS

    // ELementos Text Box
    public static final Target TXT_FULL_NAME = Target.the("User name").
            locatedBy("//*[@id=\"userName\"]");
    public static final Target TXT_EMAIL = Target.the("User name").
            locatedBy("//*[@id=\"userEmail\"]");
    public static final Target TXT_CURRENT_ADDRESS = Target.the("User name").
            locatedBy("//*[@id=\"currentAddress\"]");
    public static final Target TXT_PERMANENT_ADDRESS = Target.the("User name").
            locatedBy("//*[@id=\"permanentAddress\"]");


    // Elementos Check Box

    // Elementos Radio Button

    // Elementos Web Tables

    // Elementos Buttons

    // Elementos Links

    // Elementos Broken Links

    // Elementos Upload Download

    // Elementos Dynamic Properties


    //MODULO FORM

    public static final Target LBL_LEFT_SUB_MENU_FORM = Target.the("label menu izquierdo").
            locatedBy("//span[contains(text(), 'Practice Form')]");

    public static final Target NOMBRE = Target.the("Campo nombre").
            locatedBy("//*[@id='firstName']");

    public static final Target APELLIDO = Target.the("Campo apellido").
            locatedBy("//*[@id='lastName']");

    public static final Target EMAIL = Target.the("Campo email").
            locatedBy("//*[@id='userEmail']");


    //MODULO ALERTS
}
