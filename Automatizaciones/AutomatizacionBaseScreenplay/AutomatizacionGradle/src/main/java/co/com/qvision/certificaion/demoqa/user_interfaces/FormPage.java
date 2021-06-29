package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target NOMBRE = Target.the("campo nombre").locatedBy("//*[@id='firstName']");
    public static final Target APELLIDO = Target.the("campo apellido").locatedBy("//*[@id='lastName']");
    public static final Target CORREO = Target.the("campo correo").locatedBy("//*[@id='userEmail']");
    public static final Target GENERO = Target.the("campo Genero").locatedBy("//*[@for='gender-radio-2']");
    public static final Target FECHA = Target.the("campo FEcha").locatedBy("//*[@id='dateOfBirthInput']");


}
