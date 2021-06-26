#language: es
#enconding: iso-8859-1
Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correco funcionamiento

  Antecedentes:
    Dado que como usuario en el modulo forms y en el item practices form

@Test
  Escenario:Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacios
    Cuando selecciono el boton submit
    Entonces confirmo si se registra el formulario con campos vacios


  Escenario:Como usuario del modulo form y el elemento practice form
  deseo confirmar el registro del formulario con todos los campos dilegenciados

    Cuando ingreso los datos validos en cada campo
    Entonces confirmo si el registro se realiza con exito

  Escenario:Como usuario del modulo form y el elemento practice form
  deseo confirmar el registro del formulario con todos los campos dilegenciados erroneamente

    Cuando ingreso datos invalidos en los campos vacios
    Entonces confirmo si el registro se realiza con exito
