package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormsUI {

    public static final Target BOTON_PRACTICEFORM =
            Target.the("Boton Practice Form").
            locatedBy("//*[@id=\"item-0\"]/span[contains(text(),'Practice Form')]");

    public static final Target NOMBRE =
            Target.the("Campo Nombre").
            locatedBy("//*[@id=\"firstName\"]");

    public static final Target APELLIDO =
            Target.the("Campo Apellido").
            locatedBy("//*[@id=\"lastName\"]");

    public static final Target EMAIL =
            Target.the("Campo Email").
            locatedBy("//*[@id=\"userEmail\"]");

    public static final Target MOBILE =
            Target.the("Campo Mobile Number").
                    locatedBy("//*[@id=\"userNumber\"]");

    public static final Target SUBJECTS =
            Target.the("Campo Subjects").
                    locatedBy("//*[@id=\"subjectsInput\"]");

    public static final Target CURRENT_ADDRESS =
            Target.the("Campo Current Address").
                    locatedBy("//*[@id=\"currentAddress\"]");

    //Solo para opcion male
    public static final Target GENDER =
            Target.the("Campo Gender Male").
                    locatedBy("//label[@class='custom-control-label']");

    //Solo para opcion sports
    public static final Target HOBBIES =
            Target.the("Campo Hobbies Sports").
                    locatedBy("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label");


    public static final Target DATE_BIRTH =
            Target.the("Campo Date of Birth").
                    locatedBy("//*[@id=\"dateOfBirthInput\"]");

    public static final Target SELECT_STATE =
            Target.the("Campo Select State").
                    locatedBy("//*[@id=\"state\"]/div[1]/div[1]/div[1] ");

    public static final Target OPTION_STATE =
            Target.the("Campo Select State").
                    locatedBy("//*[@id=\"react-select-3-option-1\"]");

    public static final Target SELECT_CITY =
            Target.the("Campo Select State").
                    locatedBy("//div[text() = 'Select City']");

    public static final Target OPTION_CITY =
            Target.the("Campo Select State").
                    locatedBy("//*[@id='react-select-4-option-1']");


    public static final Target SUBMIT =
            Target.the("Campo Submit").
                    locatedBy("//*[@id='submit']");













}
