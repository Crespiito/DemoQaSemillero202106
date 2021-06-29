package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

import java.util.regex.PatternSyntaxException;

public class FormPage {

    public static final Target NOMBRE = Target.the("Campo nombre").locatedBy("//*[@id='firstName']");
    public static final Target APELLIDO = Target.the("Campo apellido").locatedBy("//*[@id='lastName']");
    public static final Target CORREO = Target.the("Campo correo").locatedBy("//*[@id='userEmail']");


    public static final Target GENDER = Target.the("Seleccion de Gender").locatedBy("//*[@for='gender-radio-2']");
    public static final Target NUMBER = Target.the("Campo de Mobile").locatedBy("//*[@id='userNumber']");
    public static final  Target SUBJECT = Target.the("Campo materias").locatedBy("//*[@id='subjectsInput']");


    public static final  Target HOBBIES = Target.the("Seleccionar hobbies").locatedBy("//*[@id='hobbiesWrapper']/div[2]/div[1]/label");
    public static final  Target CURRENT_ADRESS = Target.the("Digitar direccion").locatedBy("//*[@id='currentAddress']");

}
