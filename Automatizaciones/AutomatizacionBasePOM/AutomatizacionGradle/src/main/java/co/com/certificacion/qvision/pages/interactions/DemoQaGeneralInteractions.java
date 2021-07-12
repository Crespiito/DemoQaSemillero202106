package co.com.certificacion.qvision.pages.interactions;

import co.com.certificacion.qvision.pages.userinterface.DemoQaGeneralUI;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class DemoQaGeneralInteractions extends DemoQaGeneralUI {

    public void seleccionarTarjetaElements(){
        tarjeta.click();
    }
}
