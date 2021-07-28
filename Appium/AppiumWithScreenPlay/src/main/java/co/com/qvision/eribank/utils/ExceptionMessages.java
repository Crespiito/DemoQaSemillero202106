package co.com.qvision.eribank.utils;

public enum ExceptionMessages {

    EXCEPTION_AL_BUSCAR_ELEMENTO("No se encoentro el elemento"),
    EXCEPTION_AL_CERRAR_INGRESO_CLAVE("No cerro sesion en ingreso calve"),
    EXCEPTION_AL_ESPERAR("No se espero el tiempo indicado"),
    EXCEPTION_AL_HACER_SCROLL("Error al hacer scroll"),
    EXCEPTION_AL_OCULTAR_TECLADO("Error añ ocultar teclado"),
    EXCEPTION_AL_REFRESCAR_PANTALLA("Error al refrescar la pantalla"),
    EXCEPTION_AL_SELECCIONAR_UN_MES("Error al convertir numero de mes a nombre"),
    EXCEPTION_AL_SELECCIONAR_UN_TIPO_DOCUMENTO("Error al completar el numero de documetno para IOS"),
    EXCEPTION_ERRORAL_PRESIONAR_BOTON("Error al presionar un boton"),
    EXCEPTION_ERROR_LEER_ARCHIVO("Error al abrir el archivo"),
    EXCEPTION_NO_CREATE_DRIVER("Error al crear el driver"),
    EXCEPTION_NO_SE_ENCONTRO_PLATAFORMA("Error al encontrar la plataforma a ejectar");

    private final String mensaje;

    private ExceptionMessages(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return this.mensaje;
    }
}
