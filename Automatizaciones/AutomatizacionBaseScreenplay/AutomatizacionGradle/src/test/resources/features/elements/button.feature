#language: es

Característica: Como usuario deseo verificar los botones del elemento buttons


  Antecedentes:
    Dado que como usuario del elemento buttons

  @Test2
  Escenario: Verificar funcion de boton click me

    Cuando  le doy click al boton
    Entonces  verifico un mensaje You have done a dynamic click


  Escenario: Verificar funcion de boton Right click me

    Cuando  le doy click al boton
    Entonces  verifico un mensaje You have done a right click


  Escenario: Verificar funcion de boton Double click me

    Cuando  selecciono el boton click me
    Entonces  verifico un mensaje You have done a double click
