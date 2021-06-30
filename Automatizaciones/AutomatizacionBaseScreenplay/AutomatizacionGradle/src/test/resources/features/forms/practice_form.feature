#language: es
#enconding: iso-8859-1
Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correco funcionamiento

  @test1
  Esquema del escenario: Escenario:Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos
    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
    |La Tarjeta|Seleccionado|
    |<La Tarjeta>| <Seleccionado>|
    Cuando lleno el formulario
    Entonces confirmo si se registra el formulario
    Ejemplos:
      |La Tarjeta|Seleccionado|
      |Forms     |Practice Form|



