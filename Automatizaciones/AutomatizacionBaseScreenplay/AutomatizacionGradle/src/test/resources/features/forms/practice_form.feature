#language: es

Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correco funcionamiento

  @Test1
  Esquema del escenario: Como usuario del modulo forms deseo confirmar el envio del formulario con los campos vacios


    Dado que el usuario ingresa al modulo Forms y al submenu Seleccionando Practice Form

     # |La Tarjeta|Seleccionado|
       # |<La Tarjeta>| <Seleccionado>|

    Cuando lleno el formulario

    Entonces como ususario envio el formulario con el boton submit


    Ejemplos:
      |La Tarjeta|Seleccionado|
      |Forms     |Practice Form|

