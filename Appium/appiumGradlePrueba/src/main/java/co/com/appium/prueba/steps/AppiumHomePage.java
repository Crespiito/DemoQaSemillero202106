package co.com.appium.prueba.steps;

import co.com.appium.prueba.pages.HomePage;
import co.com.appium.prueba.utils.MyDriver;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AppiumHomePage {

    HomePage homePage;

    @Step
    public void openDriverAppium() {
        MyDriver.abrirApp();
        homePage = new HomePage(MyDriver.getDriver());
    }


    @Step
    public void testOperationSum() {
        homePage.operadorSuma();
    }

    @Step
    public void testOperationSub() {
        homePage.operadorResta();
    }

    @Step
    public void testOperationMul() {
        homePage.operadorMult();
    }

    @Step
    public void testOperationDiv() {
        homePage.operadorDiv();
    }

    @Step
    public void validationResultSum() {
        Assert.assertEquals(homePage.resultOperacion(), "11");
    }

    @Step
    public void validationResultSub() {
        Assert.assertEquals(homePage.resultOperacion(), "7");
    }

    @Step
    public void validationResultMul() {
        Assert.assertEquals(homePage.resultOperacion(), "44");
    }

    @Step
    public void validationResultDiv() {
        Assert.assertEquals(homePage.resultOperacion(), "10");
    }
}
