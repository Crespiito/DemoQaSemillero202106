package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementsUI {

//Text Box
    public static final Target BOTON_TEXTBOX =
            Target.the("Boton Text Box").
            locatedBy("//*[@id=\"item-0\"]/span[contains(text(),\"Text Box\")]");

    public static final Target FULL_NAME =
            Target.the("Campo Full Name").
                    locatedBy("//*[@id='userName']");

    public static final Target EMAIL =
            Target.the("Campo Email").
                    locatedBy("//*[@id=\"userEmail\"]");

    public static final Target CURRENT_ADDRESS =
            Target.the("Campo Current Address").
                    locatedBy("//*[@id=\"currentAddress\"]");

    public static final Target PERMANENT_ADDRESS =
            Target.the("Campo Permanent Address").
                    locatedBy("//*[@id=\"permanentAddress\"]");


    public static final Target SUBMIT =
            Target.the("Campo Submit").
                    locatedBy("//*[@id=\"submit\"]");




    // Check Box
    public static final Target BOTON_CHECKBOX =
            Target.the("Boton Check Box").
                    locatedBy("//*[@id=\"item-1\"]/span[contains(text(),\"Check Box\")]");

// Desplegar carpetas
    public static final Target DESPLEGAR_HOME =
            Target.the("Flecha para despegar carpeta Home").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/span/button");

    public static final Target DESPLEGAR_DESKTOP=
            Target.the("Flecha para despegar carpeta Desktop").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button");

    public static final Target DESPLEGAR_DOCUMENTS=
            Target.the("Flecha para despegar carpeta Documents").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button/svg");

    public static final Target DESPLEGAR_WORKSPACE=
            Target.the("Flecha para despegar carpeta WorkSpace").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button/svg");

    public static final Target DESPLEGAR_OFFICE=
            Target.the("Flecha para despegar carpeta Office").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button/svg");

    public static final Target DESPLEGAR_DOWNLOADS=
            Target.the("Flecha para despegar carpeta Downloads").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button/svg");

   //Seleccionar carpetas

   public static final Target SELECCIONAR_HOME =
           Target.the("Campo para seleccionar carpeta Home").
                   locatedBy("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]/svg");

    public static final Target SELECCIONAR_DESKTOP =
            Target.the("Campo para seleccionar carpeta Desktop").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]/svg");

    public static final Target SELECCIONAR_DOCUMENTS =
            Target.the("Campo para seleccionar carpeta Documents").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]/svg");

    public static final Target SELECCIONAR_WORKSPACE=
            Target.the("Campo para seleccionar carpeta WorkSpace").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]/svg");

    public static final Target SELECCIONAR_REACT =
            Target.the("Campo para seleccionar carpeta React").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]/svg");

    public static final Target SELECCIONAR_ANGULAR =
            Target.the("Campo para seleccionar carpeta Angular").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]/svg");


    public static final Target SELECCIONAR_VUE =
            Target.the("Campo para seleccionar carpeta Vue").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]/svg");




    public static final Target SELECCIONAR_OFFICE =
            Target.the("Campo para seleccionar carpeta Office").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]/svg");

    public static final Target SELECCIONAR_PUBLIC =
            Target.the("Campo para seleccionar carpeta Public").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]/svg");


    public static final Target SELECCIONAR_PRIVATE =
            Target.the("Campo para seleccionar carpeta Private").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]/svg");


    public static final Target SELECCIONAR_CLASSIFIED =
            Target.the("Campo para seleccionar carpeta Classified").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]/svg");


    public static final Target SELECCIONAR_GENERAL =
            Target.the("Campo para seleccionar carpeta General").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]/svg");


    public static final Target SELECCIONAR_DOWNLOADS =
            Target.the("Campo para seleccionar carpeta Downloads").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]/svg");


    public static final Target SELECCIONAR_WORD_FILE =
            Target.the("Campo para seleccionar carpeta Word File").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]/svg");


    public static final Target SELECCIONAR_EXCEL_FILE =
            Target.the("Campo para seleccionar carpeta Excel File").
                    locatedBy("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]/svg");





//Radio Button
    public static final Target BOTON_RADIOBUTTON =
            Target.the("Boton Radio Button").
                    locatedBy("//*[@id=\"item-2\"]/span[contains(text(),\"Radio Button\")]");

    public static final Target OPCION_YES_RADIOBUTTON =
            Target.the("Opcion Yes Radio Button").
                    locatedBy("//*[@id=\"yesRadio\"]");

    public static final Target OPCION_NO_RADIOBUTTON =
            Target.the("Opcion No Radio Button").
                    locatedBy("//*[@id=\"noRadio\"]");

    public static final Target OPCION_IMPRESSIVE_RADIOBUTTON =
            Target.the("Opcion Impressive Radio Button").
                    locatedBy("//*[@id=\"impressiveRadio\"]");



//Web Tables
    public static final Target BOTON_WEBTABLES =
            Target.the("Boton Web Tables").
                    locatedBy("//*[@id=\"item-3\"]/span[contains(text(),\"Web Tables\")]");



//Boton Buttons
    public static final Target BOTON_BUTTONS =
            Target.the("Boton Buttons").
                    locatedBy("//*[@id=\"item-4\"]/span[contains(text(),\"Buttons\")]");

    public static final Target DOUBLECLICKME =
            Target.the("Opcion Double Click Me").
                    locatedBy("//*[@id=\"doubleClickBtn\"]");

    public static final Target RIGHTCLICKME =
            Target.the("Opcion Right Click Me").
                    locatedBy("//*[@id=\"rightClickBtn\"]");

    public static final Target CLICKME =
            Target.the("Opcion Click Me").
                    locatedBy("//*[@id=\"yAtQn\"]");




//Boton Links
    public static final Target BOTON_LINKS =
            Target.the("Boton Links").
                    locatedBy("//*[@id=\"item-5\"]/span[contains(text(),\"Links\")]");



//Boton Broken Links
    public static final Target BOTON_BROKENLINKSIMAGES =
            Target.the("Boton Broken Links").
                    locatedBy("//*[@id=\"item-6\"]/span[contains(text(),\"Broken Links - Images\")]");


//Boton Upload and Download
    public static final Target BOTON_UPLOADDOWNLOAD =
            Target.the("Boton Upload and Download").
                    locatedBy("//*[@id=\"item-7\"]/span[contains(text(),\"Upload and Download\")]");



//Boton Dynamic Properties
    public static final Target BOTON_DYNAMICPROPERTIES =
            Target.the("Boton Dynamic Properties").
                    locatedBy("//*[@id=\"item-8\"]/span[contains(text(),\"Dynamic Properties\")]");


}
