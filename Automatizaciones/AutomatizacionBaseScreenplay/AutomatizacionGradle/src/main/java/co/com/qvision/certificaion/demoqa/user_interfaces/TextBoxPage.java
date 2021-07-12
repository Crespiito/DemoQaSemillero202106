package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxPage {
    public static final Target USERFISRTNAME = Target.the("PRIMER NOMBRE ENVIADO").locatedBy("//*[@id='userName']");
    public static final Target USERPERMANTENTADRESS = Target.the("DIRECCION PERMANENTE ENVIADA").locatedBy("//*[@id='permanentAddress']");
    public static final Target USEREMAIL = Target.the("EMAIL ENVIADO").locatedBy("//*[@id=\"userEmail\"]");
    public static final Target USERCURRENTADRESS = Target.the("DIRECCION ACTUAL ENVIADA").locatedBy("//*[@id=\"currentAddress\"]");
    public static final Target NAME = Target.the("NOMBRE RECIBIDO").locatedBy("//*[@id=\"name\"]");
    public static final Target EMAIL = Target.the("CORREO RECIBIDO").locatedBy("//*[@id=\"email\"]");
    public static final Target CURRENTADRESS = Target.the("DIRECCION ACTUAL RECIBIDA").locatedBy("//p[contains(text(),'Current Address')]");
    public static final Target PERMANTENTADRESS = Target.the("DIRECCION PERMANENTE RECIBIDA").locatedBy("//p[contains(text(),'Permananet Address')]");
    //p[@id="name"]
}
