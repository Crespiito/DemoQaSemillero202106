package co.com.qvision.certificaion.demoqa.user_interfaces.elements;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxPage {

    public static final Target NOMBRES = Target.the("Campo nombre completo").locatedBy
            ("//input[@id='userName']");

    public static final Target CORREOS = Target.the("Campo correo").locatedBy
            ("//input[@id='userEmail']");

    public static final  Target CURRENT_ADRESS = Target.the("Digitar direccion").locatedBy
           ("//textarea[@id='currentAddress']");

    public static final  Target PERMANENT_AD = Target.the("Digitar direccion PEROMANENTE").locatedBy
            ("//textarea[@id='permanentAddress']");


    public static final Target NAME = Target.the("Resultado nombre").locatedBy("//*[@id='name']");
    public static final Target EMAIL = Target.the("Resultado email").locatedBy("//*[@id='email']");
    public static final Target CURRENTADRESS = Target.the("Resultado Current Adress").locatedBy("//p[contains(text(),'Current Address')]");
    public static final Target PERMANTENTADRESS = Target.the("DIRECCION PERMANENTE RECIBIDA").locatedBy("//p[contains(text(),'Permananet Address')]");



}
