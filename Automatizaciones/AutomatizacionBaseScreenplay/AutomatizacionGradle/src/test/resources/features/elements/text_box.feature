#language: es


Característica: Como usuario deseo verificar del modulo Elements las funcionalidad Text

  @Test2
  Esquema del escenario: Como ususario deseo diligenciar todos los campos del formulario text Box
    Dado Yo como usuario en el modulo elements en el formulario de Text Box
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |

    Cuando Diligencio cada uno de los campos
      | nombre   | email   | currentAdress   | permanentAdress   |
      | <nombre> | <email> | <currentAdress> | <permanentAdress> |
    Entonces Se visualizara el resumen de la informacion diligenciada
      | nombre   | email   | currentAdress   | permanentAdress|
      | <nombre> | <email> |<currentAdress>|<permanentAdress>|
    Ejemplos:
      | La Tarjeta | Seleccionado | nombre | email          | currentAdress   | permanentAdress |
      | Elements   | Text Box     | Bruno  | bruno@gmail.com | Time Square AV3 | Central Park AV |








