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
    public void enterTheDataAccountValid() {
        homePage.inputDataLogin();
    }

    @Step
    public void enterLogin() {
        homePage.clickButtonLogin();
    }

    @Step
    public void validationLogin() {
        boolean resultVisibleButton = homePage.validateResult();
        Assert.assertEquals(resultVisibleButton, true);
    }

}
