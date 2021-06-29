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
    public static final Target TXT_EMAIL = Target.the("Email").
            locatedBy("//*[@id=\"userEmail\"]");
    public static final Target TXT_CURRENT_ADDRESS = Target.the("Current Address").
            locatedBy("//*[@id=\"currentAddress\"]");
    public static final Target TXT_PERMANENT_ADDRESS = Target.the("Permanent Addres").
            locatedBy("//*[@id=\"permanentAddress\"]");
    public static final Target BTN_SUBMIT_ELEMENTS =Target.the("Botón submit en Text Box").
            locatedBy("//*[@id=\"submit\"]");




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

    public static final Target MOBILE = Target.the("User Number").
            locatedBy("//*[@id='userNumber']");

    public static final Target SUBJECTS = Target.the("Subjects").
            locatedBy("//*[@id='subjectsInput']");

    public static final Target CURRENT_ADDRESS = Target.the("Current Address").
            locatedBy("//*[@id='currentAddress']");

    public static final Target GENDER = Target.the("Gender").
            locatedBy("//label[contains(@for, 'gender-radio-1') and @class='custom-control-label']");

    public static final Target HOBBIES = Target.the("Hobbies").
            locatedBy("//label[contains(@for, 'hobbies-checkbox-1') and @class='custom-control-label']");

    public static final Target DEPARTAMENTOS = Target.the("Departamento").
            locatedBy("//div[text() = 'Select State']");

    public static final Target SELECCIONAR_DEPARTAMENTOS = Target.the("Departamento").
            locatedBy("//*[@id='react-select-3-option-2']");

    //*[text() = 'NCR']
    //div[text() = 'Select State']
    //*[@id="state"]
    //*[@id="react-select-9-input"]

    public static final Target CITY = Target.the("City").
            locatedBy("//div[text() = 'Select City']");

    public static final Target SELECCIONAR_CITY = Target.the("Ciudad").
            locatedBy("//*[@id='react-select-4-option-1']");

    public static final Target BTN_SUBMIT_FORM = Target.the("Submit form").
            locatedBy(" //*[@id='submit']");

    public static final Target FECHA = Target.the("Fecha").
            locatedBy("//*[@id='dateOfBirthInput']");



    //MODULO ALERTS
}
