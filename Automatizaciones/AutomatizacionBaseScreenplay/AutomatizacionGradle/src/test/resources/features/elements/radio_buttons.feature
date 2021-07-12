#language: es


Característica: Como usuario deseo verificar la funcionalidad del ítem Radio Button del módulo Elements

  @Test4
  Esquema del escenario: Como usuario de demoQA deseo verificar la correcta funcionalidad de los radio botones
  del submodulo Radio Button del modulo Elements

    Dado que el usuario en el modulo Elements y submodulo Radio Button
      | La Tarjeta   | Seleccionada   |
      | <La Tarjeta> | <Seleccionada> |
    Cuando selecciona los botones
      | boton   |
      | <boton> |
    Entonces valida que el mensaje mostrado sea el deseado
      | mensaje   |
      | <mensaje> |
    Ejemplos:
      | La Tarjeta | Seleccionada | boton      | mensaje    |
      | Elements   | Radio Button | Yes        | Yes        |
     # | Elements   | Radio Button | Impressive | Impressive |
