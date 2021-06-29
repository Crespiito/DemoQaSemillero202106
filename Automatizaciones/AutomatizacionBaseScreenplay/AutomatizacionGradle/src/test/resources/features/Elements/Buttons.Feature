#language: es

Característica: Como usuario deseo verificar los botones del elemento buttons
  @TestElements

  Escenario: Verificar funcion de boton "click me"

    Dado que deseo probar el boton click me
    Cuando  le doy click al boton
    Entonces  me deberia mostrar un mensaje "You have done a dynamic click"

  Escenario: Verificar funcion de boton "Right click me"

    Dado que deseo probar el boton "Rigth click me"
    Cuando  le doy click al boton
    Entonces  me deberia mostrar un mensaje "You have done a right click"


  Escenario: Verificar funcion de boton "Double click me"

    Dado que deseo probar el boton "Double click me"
    Cuando le doy click al boton
    Entonces  me deberia mostrar un mensaje "You have done a double click"
