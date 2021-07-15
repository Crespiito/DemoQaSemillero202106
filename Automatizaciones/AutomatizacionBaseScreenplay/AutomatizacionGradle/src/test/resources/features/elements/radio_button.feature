#language: es


Característica: Como usuario deseo verificar la funcionalidad del ítem Radio Button del modulo Elements

  @Test4
  Esquema del escenario: Validar que en la lista de Elements aparezca  el item Radio Button

    Dado que el usuario accede al modulo Elements en el item Radio Button
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |

    Cuando selecciona el radio button Yes

    |button|
    |<button>|

    Entonces el sistema muestra mensaje You have selected Yes

    |message |
    |<message>|

    Ejemplos:
      | La Tarjeta | Seleccionado |button|message|
      | Elements   | Radio Button |Yes  | Yes|
     # |Elements    |Radio Button  |Impressive |Impressive|

