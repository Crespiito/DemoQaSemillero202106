#language: es


Característica: Como usuario deseo verificar del módulo
  Elements las funcionalidad Text Box

  @Test2
    Esquema del escenario: Escenario: yo como usuario del modulo elements en el item Text Box deseo verificar funcionalidad de los campos
              de texto

    Dado que como usuario en el item Text Box del modulo elements
      | La Tarjeta   | Seleccionada   |
      | <La Tarjeta> | <Seleccionada> |
    Cuando ingreso datos en los campos de texto
      | fullName   | email   | currentAdress   | permantenAdress   |
      | <fullName> | <email> | <currentAdress> | <permantenAdress> |
    Entonces verifico que se guarden los datos
      | fullName   | email   | currentAdress   | permantenAdress   |
      | <fullName> | <email> | <currentAdress> | <permantenAdress> |
    Ejemplos:
      | La Tarjeta | Seleccionada | fullName | email            | currentAdress | permantenAdress |
      | Elements   | Text Box     | ana      | anap@gmail.com   | Santa Isabel  | Bogotá          |
      | Elements   | Text Box     | miguel   | miguel@gmail.com | El virrey     | Usme            |


