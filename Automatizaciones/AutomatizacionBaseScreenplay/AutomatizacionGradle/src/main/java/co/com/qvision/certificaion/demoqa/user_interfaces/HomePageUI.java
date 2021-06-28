package co.com.qvision.certificaion.demoqa.user_interfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {



    public static final Target TARJETA_ELEMENTS =
            Target.the("tarjeta Elements en Menu principal").
            locatedBy("//*/h5[contains(text(),'Elements')]");
            //locatedBy("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5[contains(text(),'Elements')]");


    public static final Target TARJETA_FORMS =
            Target.the("tarjeta Forms en Menu principal").
            locatedBy("//*/h5[contains(text(),'Forms')]");
           // locatedBy("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5[contains(text(),'Forms')]");


    public static final Target TARJETA_AlERTS =
            Target.the("tarjeta Alerts en Menu principal").
            // locatedBy("//*[@id="app"]/div/div/div[2]/div/div[3]/div/div[3]/h5[contains(text(),'Alerts')]");
            locatedBy("//*/h5[contains(text(),'Alert')]");


    public static final Target TARJETA_WIDGETS =
            Target.the("tarjeta Widgets en Menu principal").
            //locatedBy("//*[@id="app"]/div/div/div[2]/div/div[4]/div/div[3]/h5[contains(text(),'Widgets')])]");
            locatedBy("//*/h5[contains(text(),'Widgets')]");


    public static final Target TARJETA_INTERACTIONS =
            Target.the("tarjeta Interactions en Menu principal").
            //locatedBy("//*[@id="app"]/div/div/div[2]/div/div[5]/div/div[3]/h5[contains(text(),'Interactions')])]");
                    locatedBy("//*/h5[contains(text(),'Interactions')]");







}
