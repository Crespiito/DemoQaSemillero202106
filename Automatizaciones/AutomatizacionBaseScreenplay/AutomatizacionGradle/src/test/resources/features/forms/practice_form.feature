#language: es

Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correco funcionamiento

  Antecedentes:
    Dado que como usuario en el modulo forms y en el item practices form

  @test2
  Escenario:Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos
    Cuando selecciono el boton submit
    Entonces confirmo si se registra el formulario con campos vacios

  @test2
  Escenario:Como usuario del modulo form y el elemento practice form
  deseo confirmar el registro del formulario con todos los campos dilegenciados

    Cuando ingreso los datos validos en cada campo
    Entonces confirmo si el registro se realiza con exito

  @test2
  Escenario:Como usuario del modulo form y el elemento practice form
  deseo confirmar el registro del formulario con todos los campos dilegenciados erroneamente

    Cuando ingreso datos invalidos en los campos
    Entonces confirmo si el registro se realiza con exito
