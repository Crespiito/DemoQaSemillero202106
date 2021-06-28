package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormsUI {

    public static final Target BOTON_PRACTICEFORM =
            Target.the("Boton Practice Form").
                    locatedBy("//*[@id=\"item-0\"]/span[contains(text(),'Practice Form')]");
}
