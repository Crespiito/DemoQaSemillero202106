#language: es

Característica: Como usuario deseo verificar los botones del elemento buttons

  @Test5
  Esquema del escenario: Validar que en la lista de Elements aparezca  el item Buttons

    Dado que como usuario accede al modulo Elements en el item Buttons

      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |

    Cuando  le doy click al boton
      | boton   |
      | <boton> |

    Entonces  verifico un mensaje You have done a double click
      | mensaje   |
      | <mensaje> |

    Ejemplos:
      | La Tarjeta | Seleccionado | boton           | mensaje                      |
      | Elements   | Buttons      | Double Click Me | You have done a double click |



