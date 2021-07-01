#language: es


Característica: Como usuario deseo verificar la funcionalidad del item Radio Button del modulo Elements

  @test12
  Esquema del escenario: Validar que en la lista de Elements aparezca el item Radio Button
    Dado que el usuario ingresa a la opcion de <La Tarjeta> y el submenu <Seleccionado>
    Cuando despliegue la lista de Elements <Boton>
    Entonces valido que este presente el item Radio Button
    Ejemplos:
      | La Tarjeta | Seleccionado | Boton           |
      | Elements   | Radio Button | impressiveRadio |
      | Elements   | Radio Button | yesRadio        |


  Esquema del escenario: Quiera marcar que no le gusto el sitio
    Dado que el usuario ingresa a la opcion de <La Tarjeta> y el submenu <Seleccionado>
    Cuando despliegue la lista de Elements <Boton>
    Entonces podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion
    Ejemplos:
      | La Tarjeta | Seleccionado | Boton   |
      | Elements   | Radio Button | noRadio |