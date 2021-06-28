package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    //MODULO ELEMENTS
    // ELementos Text Box
    public static final Target LBL_LEFT_SUB_MENU = Target.the("label menu izquierdo").
            locatedBy("//span[contains(text(), '{0}')]");

    public static final Target TXT_FULL_NAME = Target.the("User name").
            locatedBy("//*[@id=\"userName\"]");


    // Elementos Check Box
    public static final Target LBL_LEFT_ELEMENTS_CHECK_BOX = Target.the("label menu izquierdo Check Box").
            locatedBy("//span[contains(text(), 'Check Box')]");
    // Elementos Radio Button
    public static final Target LBL_LEFT_ELEMENTS_RADIO_BUTTON = Target.the("label menu izquierdo Radio Button").
            locatedBy("//span[contains(text(), 'Radio Button')]");
    // Elementos Web Tables
    public static final Target LBL_LEFT_ELEMENTS_WEB_TABLES = Target.the("label menu izquierdo Web Table").
            locatedBy("//span[contains(text(), 'Web Tables')]");
    // Elementos Buttons
    public static final Target LBL_LEFT_ELEMENTS_BUTTONS = Target.the("label menu izquierdo Buttons").
            locatedBy("//span[contains(text(), 'Buttons')]");
    // Elementos Links
    public static final Target LBL_LEFT_ELEMENTS_LINKS = Target.the("label menu izquierdo Links").
            locatedBy("//span[contains(text(), 'Links')]");
    // Elementos Broken Links
    public static final Target LBL_LEFT_ELEMENTS_BROKEN_LINKS = Target.the("label menu izquierdo Broken Links").
            locatedBy("//span[contains(text(), 'Broken Links - Images')]");
    // Elementos Upload Download
    public static final Target LBL_LEFT_ELEMENTS_UPLOAD_DOWNLOAD = Target.the("label menu izquierdo Upload and Download").
            locatedBy("//span[contains(text(), 'Upload and Download')]");
    // Elementos Dynamic Properties
    public static final Target LBL_LEFT_ELEMENTS_DYNAMIC_PROPERTIES = Target.the("label menu izquierdo Dynamic Properties").
            locatedBy("//span[contains(text(), 'Dynamic Properties')]");

    //MODULO FORM
    public static final Target LBL_LEFT_FORM_PRACTICE_FORM = Target.the("Practice Form")
            .locatedBy("//span[contains(text(), 'Practice Form')]");




    //MODULO ALERTS
}
