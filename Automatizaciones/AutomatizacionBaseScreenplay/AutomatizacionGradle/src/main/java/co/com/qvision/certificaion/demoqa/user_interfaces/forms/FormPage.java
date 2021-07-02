package co.com.qvision.certificaion.demoqa.user_interfaces.forms;

import net.serenitybdd.screenplay.targets.Target;


public class FormPage {

    public static final Target NOMBRE = Target.the("Campo nombre").locatedBy
            ("//*[@id='firstName']");
    public static final Target APELLIDO = Target.the("Campo apellido").locatedBy
            ("//*[@id='lastName']");
    public static final Target CORREO = Target.the("Campo correo").locatedBy
            ("//*[@id='userEmail']");

    public static final Target GENDER = Target.the("Seleccion de Gender").locatedBy
            ("//*[@for='gender-radio-{0}']");
    public static final Target NUMBER = Target.the("Campo de Mobile").locatedBy
            ("//*[@id='userNumber']");
    public static final  Target SUBJECT = Target.the("Campo materias").locatedBy
            ("//*[@id='subjectsInput']");

    public static final  Target HOBBIES = Target.the("Seleccionar hobbies").locatedBy
            ("//*[@id='hobbiesWrapper']/div[2]/div[1]/label");
    public static final  Target CURRENT_ADRESS = Target.the("Digitar direccion").locatedBy
            ("//*[@id='currentAddress']");


    public static final Target FECHA = Target.the("Campo FECHA").locatedBy
            ("//*[@id='dateOfBirthInput']");


    public static final Target STATED = Target.the("OPTION STATED").locatedBy("//*[@id='react-select-3-option-1']");
    public static final Target STATEDSELECT = Target.the("SELECTOR STATED").locatedBy("//div[text() = 'Select State']");

    public static final Target CITY = Target.the("OPTION STATED").locatedBy("//*[@id='react-select-4-option-1']");
    public static final Target CITYSELECT = Target.the("SELECTOR STATED").locatedBy("//div[text() ='Select City']");

    public static final Target SUBMIT = Target.the("ClICK ENVIAR").locatedBy
            ("//*[@id='submit']");


    public static final Target CAMPO_POR_ID = Target.the("campo {0}").locatedBy
            ("//*[@id='{0}']");


    public static final Target TABLE = Target.the("campo en la posicion {0} {1}").locatedBy("//table/tbody/tr[{0}]/td[{1}]");



}
