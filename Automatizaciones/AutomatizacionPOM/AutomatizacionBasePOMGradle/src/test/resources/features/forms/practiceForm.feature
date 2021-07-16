#language: es


Característica: Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correcto funcionamiento

  //Escenario: Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos

  Esquema del escenario: Escenario:Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos
    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
      |La Tarjeta|Seleccionado|
      |<La Tarjeta>| <Seleccionado>|

    Cuando lleno el formulario
      |nombre|apellido|correo|telefono|genero|
      |<nombre>|<apellido>|<correo>|<telefono>|<genero>|

    Entonces confirmo si se registra el formulario
      |nombre|apellido|correo|telefono|genero|
      |<nombre>|<apellido>|<correo>|<telefono>|<genero>|
    Ejemplos:
      |La Tarjeta|Seleccionado|nombre|apellido|correo|telefono|genero|
      |Forms     |Practice Form|juan|bautista|correo@correo.es|1234567891|Male|
      |Forms     |Practice Form|juan|bautista2|correo@gmail.es|1234567891|Female|
      |Forms     |Practice Form|juan|bautista3|correo@hotmial.es|1234567892|Male|
      |Forms     |Practice Form|juan|bautista4|correo@randomnose.es|1234567840|HelicopteroApache|
      |Forms     |Practice Form|juan|bautista5|correo@yahoo.es|1234567890|Male|