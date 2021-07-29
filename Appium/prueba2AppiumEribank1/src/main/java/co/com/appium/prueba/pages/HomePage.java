package co.com.appium.prueba.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    AppiumDriver<MobileElement> driver;

    public HomePage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }


    // -------------------- Elementos Interface login ---------------------- //

    @FindBy(id="com.experitest.ExperiBank:id/usernameTextField") // Campo ingreso nombre usuario
    WebElement usernameText;

    @FindBy(id="com.experitest.ExperiBank:id/passwordTextField") // Campo ingreso contraseña usuario
    WebElement passwordText;

    @FindBy(id="com.experitest.ExperiBank:id/loginButton") // Boton Login
    WebElement buttonLogin;

    // ---------------- Elementos Interface menu principal ------------------//

    @FindBy(id="com.experitest.ExperiBank:id/makePaymentButton") // Boton Make Payment
    WebElement buttonMakePayment;

    // ------------------ METODOS -------------------- //

    public void inputDataLogin() {
        usernameText.sendKeys("company");
        passwordText.sendKeys("company");
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public Boolean validateResult() {
        return buttonMakePayment.isDisplayed();
    }
}
