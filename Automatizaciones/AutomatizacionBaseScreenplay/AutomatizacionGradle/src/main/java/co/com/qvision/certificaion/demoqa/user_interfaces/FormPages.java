package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class FormPages {
    public static final Target NOMBRE = Target.the("nombre a ingresar").locatedBy("//*[@id='firstName']");
    public static final Target APELLIDO = Target.the("apellido a ingresar").locatedBy("//*[@id='lastName']");
    public static final Target CORREO = Target.the("correo a ingresar").locatedBy("//*[@id='userEmail']");
    public static final Target GENERO = Target.the("Genero").locatedBy("//*[@for='gender-radio-{0}']");
    public static final Target MOVIL = Target.the("Number Movil").locatedBy("//*[@id='userNumber']");
    public static final Target CUMPLE = Target.the("Fecha de naicimiento").locatedBy("//*[@id='dateOfBirthInput']");
    public static final Target SUBJECT = Target.the("ELEMENTO SUBJECT").locatedBy("//*[@id='subjectsContainer']/div/div[1]");
    public static final Target READING = Target.the("CHECK READING").locatedBy("//*[@id='hobbiesWrapper']/div[2]/div[2]/label");
    public static final Target MUSIC = Target.the("CHECK MUSIC").locatedBy("//*[@id='hobbiesWrapper']/div[2]/div[3]/label");
    public static final Target ADRESS = Target.the("ADRESS").locatedBy("//*[@id='currentAddress']");
    public static final Target STATED = Target.the("OPTION STATED").locatedBy("//*[@id='react-select-3-option-1']");
    public static final Target STATEDSELECT = Target.the("SELECTOR STATED").locatedBy("//div[text() = 'Select State']");
    public static final Target CITY = Target.the("OPTION STATED").locatedBy("//*[@id='react-select-4-option-1']");
    public static final Target CITYSELECT = Target.the("SELECTOR STATED").locatedBy("//div[text() = 'Select City']");
    public static final Target SUBMIT = Target.the("OPTION CITY").locatedBy("//*[@id='submit']");
    public static final Target RESULTFORM = Target.the("i  frame").locatedBy("//*[@id='example-modal-sizes-title-lg']");
    public static final Target TABLA = Target.the("campo en la posicion {0} {1}").locatedBy("//table/tbody/tr[{0}]/td[{1}]");


}
