package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InteractionsUI {
    //SORTABLE
    public static final Target BOTON_SORTABLE =
            Target.the("Boton Sortable").
                    locatedBy("//*[@id=\"item-0\"]/span[contains(text(),'Sortable')]");

    //SELECTABLE
    public static final Target BOTON_SELECTABLE =
            Target.the("Boton Selectable").
                    locatedBy("//*[@id=\"item-1\"]/span[contains(text(),'Selectable')]");

    //RESIZABLE
    public static final Target BOTON_RESIZABLE =
            Target.the("Boton Resizable").
                    locatedBy("//*[@id=\"item-2\"]/span[contains(text(),'Resizable')]");

    //DROPPABLE
    public static final Target BOTON_DROPPABLE =
            Target.the("Boton Droppable").
                    locatedBy("//*[@id=\"item-3\"]/span[contains(text(),'Droppable')]");

    //DRAGABBLE
    public static final Target BOTON_DRAGABBLE =
            Target.the("Boton Dragabble").
                    locatedBy("//*[@id=\"item-4\"]/span[contains(text(),'Dragabble')]");

}
