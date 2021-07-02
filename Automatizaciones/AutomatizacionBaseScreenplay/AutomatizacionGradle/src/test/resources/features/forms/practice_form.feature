#language: es

Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correco funcionamiento

  @Test
  Esquema del escenario: Como usuario del modulo forms deseo confirmar el envio del formulario con los campos vacios


    Dado que el usuario ingresa al modulo <Tarjeta> y al submenu Seleccionando <Seleccionado>
      #|La Tarjeta|Seleccionado|
      #|<La Tarjeta>| <Seleccionado>|

    Cuando lleno el formulario

    Entonces confirmo si se registra el formulario


    Ejemplos:
      |Tarjeta|Seleccionado|
      |Forms     |Practice Form|

