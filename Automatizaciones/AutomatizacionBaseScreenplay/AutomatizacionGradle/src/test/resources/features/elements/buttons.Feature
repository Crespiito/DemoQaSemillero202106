#language: es
# encoding: iso-8859-1

Característica: Como usuario deseo verificar los botones del elemento buttons

  Escenario: Verificar funcion de botone "click me"

    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
      |La Tarjeta|Seleccionado|
      |Elements|Buttons|
    Cuando : le doy click al boton
    Entonces : me debería mostrar un mensaje "You have done a dynamic click"

  Escenario: Verificar funcion de boton "Right click me"

    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
      |La Tarjeta|Seleccionado|
      |Elements|Buttons|
    Cuando : le doy click al boton
    Entonces : me debería mostrar un mensaje "You have done a right click"


  Escenario: Verificar funcion de boton "Double click me"

    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
      |La Tarjeta|Seleccionado|
      |Elements|Buttons|
    Cuando : le doy click al boton
    Entonces : me debería mostrar un mensaje "You have done a double click"
