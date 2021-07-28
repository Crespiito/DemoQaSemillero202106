package co.com.qvision.eribank.userinterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class LoginToTheApp implements Task {
    private String userName;
    private String userPassword;

    public LoginToTheApp(String userName, String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;

    }
    @Step("{0} entry a user data into LoginToTheApp")
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(userName).into(LoginPage.NAME_USER),
                (Enter.theValue(userPassword).into(LoginPage.PASS_USER)),
                (Click.on(LoginPage.BUTTON_LOGIN))
        );
    }

    public static LoginToTheApp withUserData(String userName, String userPassword){
        return Tasks.instrumented(LoginToTheApp.class, userName, userPassword);
    }

}