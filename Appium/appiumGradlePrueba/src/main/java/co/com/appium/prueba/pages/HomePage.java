package co.com.appium.prueba.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // -------------- Elementos Calculadora -------------------- //
    @FindBy(id="com.android.calculator2:id/digit_0")
    WebElement digitoCero;

    @FindBy(id="com.android.calculator2:id/digit_1")
    WebElement digitoUno;

    @FindBy(id="com.android.calculator2:id/digit_2")
    WebElement digitoDos;

    @FindBy(id="com.android.calculator2:id/digit_3")
    WebElement digitoTres;

    @FindBy(id="com.android.calculator2:id/digit_4")
    WebElement digitoCuatro;

    @FindBy(id="com.android.calculator2:id/digit_7")
    WebElement digitoSiete;

    @FindBy(id="com.android.calculator2:id/digit_9")
    WebElement digitoNueve;

    @FindBy(id="com.android.calculator2:id/op_add")
    WebElement operacionSum;

    @FindBy(id="com.android.calculator2:id/op_sub")
    WebElement operacionSub;

    @FindBy(id="com.android.calculator2:id/op_mul")
    WebElement operacionMul;

    @FindBy(id="com.android.calculator2:id/op_div")
    WebElement operacionDiv;

    @FindBy(id="com.android.calculator2:id/eq")
    WebElement signoIgual;

    @FindBy(id="com.android.calculator2:id/formula")
    WebElement resultadoOperacion;

    // -------------- Metodos ---------------//

    public void operadorSuma() {
        digitoCuatro.click();
        operacionSum.click();
        digitoSiete.click();
        signoIgual.click();
    }

    public void operadorResta() {
        digitoNueve.click();
        operacionSub.click();
        digitoDos.click();
        signoIgual.click();
    }

    public void operadorMult() {
        digitoUno.click();
        digitoUno.click();
        operacionMul.click();
        digitoCuatro.click();
        signoIgual.click();
    }

    public void operadorDiv() {
        digitoTres.click();
        digitoCero.click();
        operacionDiv.click();
        digitoTres.click();
        signoIgual.click();
    }


    public String resultOperacion() {
        return resultadoOperacion.getText();
    }
}
