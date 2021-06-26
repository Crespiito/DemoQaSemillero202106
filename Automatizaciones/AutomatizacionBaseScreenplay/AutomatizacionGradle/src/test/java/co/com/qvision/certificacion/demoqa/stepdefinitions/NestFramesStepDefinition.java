package co.com.qvision.certificacion.demoqa.stepdefinitions;


import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class NestFramesStepDefinition {

    @Dado("que el usuario ingresa al modulo Nested Frames y ubica un marco dentro de otro marco, delimitados.")
    public void que_el_usuario_ingresa_al_modulo_nested_frames_y_ubica_un_marco_dentro_de_otro_marco_delimitados() {
        System.out.println("Entro al Entonces");
    }

    @Entonces("valido que existan {int} marcos, uno dentro de otro, y que cada uno este delimitado y separado entre si.")
    public void valido_que_existan_marcos_uno_dentro_de_otro_y_que_cada_uno_este_delimitado_y_separado_entre_si(Integer int1) {
        System.out.println("Entro al Entonces");
    }

    @Dado("que el usuario ingresa al modulo Nested Frames y ubica el marco exterior {string}")
    public void que_el_usuario_ingresa_al_modulo_nested_frames_y_ubica_el_marco_exterior(String string) {
        System.out.println("Entro al Entonces");
    }

    @Entonces("valido que exista un marco  exterior {string}")
    public void valido_que_exista_un_marco_exterior(String string) {
        System.out.println("Entro al Entonces");
    }

    @Dado("que el usuario ingresa al modulo Nested Frames y ubica el marco interior {string}")
    public void que_el_usuario_ingresa_al_modulo_nested_frames_y_ubica_el_marco_interior(String string) {
        System.out.println("Entro al Entonces");
    }

    @Entonces("valido que exista un marco interior {string}")
    public void valido_que_exista_un_marco_interior(String string) {
        System.out.println("Entro al Entonces");
    }

}
