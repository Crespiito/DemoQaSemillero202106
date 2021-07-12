#language: es
#enconding: iso-8859-1
Característica: Como usuario del sistema ToolQA el elemento practice form del modulo Forms para confirmar
  su correcto funcionamiento


  @Test1
  Esquema del escenario: Escenario: como usuario del modulo form deseo confirmar el envio del formulario
    Dado que el usuario ingresa al modulo Forms en el item Practice Form
      | La Tarjeta   | Seleccionada       |
      | <La Tarjeta> | <Seleccionada> |

    Cuando lleno el formulario
      | nombre   | apellido   | correo   | mobil   | genero   |
      | <nombre> | <apellido> | <correo> | <mobil> | <genero> |

    Entonces confirmo si se envio el formulario
      | nombre   | apellido   | correo   | mobil   | genero   |
      | <nombre> | <apellido> | <correo> | <mobil> | <genero> |

    Ejemplos:
      | La Tarjeta | Seleccionada  | nombre | apellido | correo        | mobil      | genero |
      | Forms      | Practice Form | miguel | bautista | mb@hotmai.com | 3216549873 | Male   |
      | Forms      | Practice Form | angel  | moreno   | am@hotmai.com | 3216549873 | Female |
      #| Forms      |Practice Form  |abendrot| fallen   | af@hotmai.com |3216549873  | other   |