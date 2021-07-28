package co.com.qvision.eribank.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target NAME_USER = Target.the("Input text user name").located(By.id(""));
    public static final Target PASS_USER = Target.the("Input text user password").located(By.id(""));
    public static final Target BUTTON_LOGIN = Target.the("Boton de login").located(By.id(""));

}