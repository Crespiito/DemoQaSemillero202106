#language: es

Característica: Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correcto funcionamiento
  @Test1
  Esquema del escenario: Escenario:Como usuario del modulo form deseo confirmar el envio del formulario con los campos vacíos
    Dado que el usuario ingresa a la opcion de <La Tarjeta> y el submenu <Seleccionado>

    Cuando lleno el formulario
      |nombre|apellido|correo|genero|telefono|subjects|hobbies|address|
      |<nombre>|<apellido>|<correo>|<genero>|<telefono>|<subjects>|<hobbies>|<address>|

    Entonces confirmo si se registra el formulario con campos vacios
      |nombre|apellido|correo|genero|telefono|subjects|hobbies|address|
      |<nombre>|<apellido>|<correo>|<genero>|<telefono>|<subjects>|<hobbies>|<address>|
    Ejemplos:
      |La Tarjeta|Seleccionado|nombre|apellido|correo|genero|telefono|subjects|hobbies|address|
      |Forms     |Practice Form|juan|bautista|correo@correo.es|Male|1234567891|English|Sports|123 ABC|
      |Forms     |Practice Form|juan|bautista2|correo@gmail.es|Female|1234567891|Maths|Reading|ABC 123|
      |Forms     |Practice Form|juan|bautista3|correo@hotmial.es|Male|1234567892|Physics|Sports|123 ABC|
      |Forms     |Practice Form|juan|bautista4|correo@randomnose.es|Male|1234567840|Arts|Music|123 ABC|
      |Forms     |Practice Form|juan|bautista5|correo@yahoo.es|Male|1234567890|Hindi|Music|123 ABC|








