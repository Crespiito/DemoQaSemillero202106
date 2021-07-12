#language: es

@Test5
Característica: Como usuario deseo verificar los botones del elemento buttons

Esquema del escenario:  verificar la funcionalidad de los botones del sub modulo Buttons mendiante
                         la validacion de mensajes

    Dado que como usuario en el modulo Elements y el submodulo Buttons
      | La Tarjeta   | Seleccionada   |
      | <La Tarjeta> | <Seleccionada> |
     Cuando Selecciona los botones
      | boton   |
      | <boton> |

    Entonces  verifico los mensajes que muestra
      | mensaje   |
      | <mensaje> |
  Ejemplos:
      | La Tarjeta | Seleccionada | boton           | mensaje                       |
      #| Elements   | Buttons      | Double Click Me | You have done a double click  |
      | Elements   | Buttons      | Right Click Me  | You have done a right click   |
      #| Elements   | Buttons      | Click Me        | You have done a dynamic click |


