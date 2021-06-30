package co.com.qvision.certificaion.demoqa.user_interfaces.elements;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxPage {

    public static final Target NOMBRES = Target.the("Campo nombre completo").locatedBy
            ("//*[@id='userName']");

    public static final Target CORREOS = Target.the("Campo correo").locatedBy
            ("//*[@id='userEmail']");

    public static final  Target CURRENT_ADRESS = Target.the("Digitar direccion").locatedBy
           ("//*[@id='currentAddress']");

    public static final  Target PERMANENT_AD = Target.the("Digitar direccion PEROMANENTE").locatedBy
            ("//*[@id='currentAddress']");


}
