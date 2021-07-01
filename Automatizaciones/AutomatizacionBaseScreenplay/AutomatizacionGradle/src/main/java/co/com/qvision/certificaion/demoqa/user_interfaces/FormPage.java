package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target NOMBRE = Target.the("campo nombre").locatedBy("//*[@id='firstName']");
    public static final Target APELLIDO = Target.the("campo apellido").locatedBy("//*[@id='lastName']");
    public static final Target CORREO = Target.the("campo correo").locatedBy("//*[@id='userEmail']");
    public static final Target GENERO = Target.the("campo genero").locatedBy("//*[@for='gender-radio-{0}']");
    public static final Target FECHA = Target.the("campo fecha").locatedBy("//*[@id='dateOfBirthInput']");
    public static final Target NUMERO = Target.the("campo numero").locatedBy("//*[@id='userNumber']");
    public static final Target CAMPO_POR_ID = Target.the("campo {0}").locatedBy("//*[@id='{0}']");
    public static final Target TABLE = Target.the("campo tabla en posiciones {0} {1}").locatedBy(" //table/tbody/tr[{0}]/td[{1}]");


    //table/tbody/tr[1]/td[2]


}
