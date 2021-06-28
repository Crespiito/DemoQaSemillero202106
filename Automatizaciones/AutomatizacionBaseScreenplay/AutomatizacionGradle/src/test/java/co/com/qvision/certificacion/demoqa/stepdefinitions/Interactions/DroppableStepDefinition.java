package co.com.qvision.certificacion.demoqa.stepdefinitions.Interactions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class DroppableStepDefinition {

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee dentro de toda la pantalla")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeDentroDeTodaLaPantalla(String string) {
        System.out.println("entro al entonces");
    }

    @Cuando("Seleccione y mueva el item {string} y lo suelte en el recuadro {string}")
    public void seleccioneYMuevaElItemYLoSuelteEnElRecuadro(String string, String string2) {
        System.out.println("entro al cuando");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee y al soltarlo en el recuadro {string} este cambie de color y se visualice el mensaje {string}")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeYAlSoltarloEnElRecuadroEsteCambieDeColorYSeVisualiceElMensaje(String string, String string2, String string3) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee dentro de toda la pantalla y al soltarlo en el recuadro {string} este cambie de color y se visualice el mensaje {string}")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeDentroDeTodaLaPantallaYAlSoltarloEnElRecuadroEsteCambieDeColorYSeVisualiceElMensaje(String string, String string2, String string3) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee dentro de toda la pantalla y al soltarlo en el recuadro {string} este no cambie de color ni cambie el mensaje {string}")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeDentroDeTodaLaPantallaYAlSoltarloEnElRecuadroEsteNoCambieDeColorNiCambieElMensaje(String string, String string2, String string3) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros {string} cambian de color a verde oscuro,al pasarlo sobre los recuadros se pone verde claro y al soltarlo en el recuadro {string} superior este y el cuadro interior {string}  cambie de color a azul y se visualice el mensaje {string} en el recuadro exterior")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeEnTodaLaPantallaAlArrastrarloLosCuadrosCambianDeColorAVerdeOscuroAlPasarloSobreLosRecuadrosSePoneVerdeClaroYAlSoltarloEnElRecuadroSuperiorEsteYElCuadroInteriorCambieDeColorAAzulYSeVisualiceElMensajeEnElRecuadroExterior(String string, String string2, String string3, String string4, String string5) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros {string} cambian de color a verde oscuro, al pasarlo sobre los recuadros se pone verde claro  y al soltarlo en el recuadro {string} superior, este y el recuadro exterior cambie de color a azul y se visualice el mensaje {string} en el recuadro interior")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeEnTodaLaPantallaAlArrastrarloLosCuadrosCambianDeColorAVerdeOscuroAlPasarloSobreLosRecuadrosSePoneVerdeClaroYAlSoltarloEnElRecuadroSuperiorEsteYElRecuadroExteriorCambieDeColorAAzulYSeVisualiceElMensajeEnElRecuadroInterior(String string, String string2, String string3, String string4) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros {string} cambian de color a verde oscuro,al pasarlo sobre el recuadro {string} inferior se pone verde claro al soltarlo en el mismo cambie de color a azul y se visualice el mensaje {string} en el recuadro exterior")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeEnTodaLaPantallaAlArrastrarloLosCuadrosCambianDeColorAVerdeOscuroAlPasarloSobreElRecuadroInferiorSePoneVerdeClaroAlSoltarloEnElMismoCambieDeColorAAzulYSeVisualiceElMensajeEnElRecuadroExterior(String string, String string2, String string3, String string4) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros {string} cambian de color a verde oscuro,al pasarlo sobre el recuadro {string} inferior se pone verde claro al soltarlo en el mismo cambie de color a azul y se visualice el mensaje {string} en el recuadro interior")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeEnTodaLaPantallaAlArrastrarloLosCuadrosCambianDeColorAVerdeOscuroAlPasarloSobreElRecuadroInferiorSePoneVerdeClaroAlSoltarloEnElMismoCambieDeColorAAzulYSeVisualiceElMensajeEnElRecuadroInterior(String string, String string2, String string3, String string4) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee en toda la pantalla, al arrastrarlo el cuadro {string} cambian de color a verde oscuro,al pasarlo sobre el recuadro {string} se pone verde claro y al soltarlo en el mismo, cambia de color a azul y se visualice el mensaje {string} y el cuadro {string} regresara a su posicion inicial")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeEnTodaLaPantallaAlArrastrarloElCuadroCambianDeColorAVerdeOscuroAlPasarloSobreElRecuadroSePoneVerdeClaroYAlSoltarloEnElMismoCambiaDeColorAAzulYSeVisualiceElMensajeYElCuadroRegresaraASuPosicionInicial(String string, String string2, String string3, String string4, String string5) {
        System.out.println("entro al entonces");
    }

    @Entonces("Visualice que el item {string} se mueve segun el usuario desee en toda la pantalla, al arrastrarlo el cuadro {string} cambian de color a verde oscuro,al pasarlo sobre el recuadro {string} se pone verde claro y al soltarlo en el mismo, cambia de color a azul y se visualice el mensaje {string} y el cuadro {string} se queda dentro del cuadro {string}")
    public void visualiceQueElItemSeMueveSegunElUsuarioDeseeEnTodaLaPantallaAlArrastrarloElCuadroCambianDeColorAVerdeOscuroAlPasarloSobreElRecuadroSePoneVerdeClaroYAlSoltarloEnElMismoCambiaDeColorAAzulYSeVisualiceElMensajeYElCuadroSeQuedaDentroDelCuadro(String string, String string2, String string3, String string4, String string5, String string6) {
        System.out.println("entro al entonces");
    }

}
