#language: es

@Test3
Característica: Como usuario deseo verificar la funcionalidad de los botones Haz clic en mi de acuerdo a su referencia
Esquema del escenario: Verificacion de los mensajes en alerts

  Dado que el usuario del modulo Alert y windows en el item Alerts
    | La Tarjeta   | Seleccionada   |
    | <La Tarjeta> | <Seleccionada> |
  Cuando selecciono el primer boton alert button
    | boton   |
    | <boton> |
  Entonces  verifico el mensaje You clicked a button
    | mensaje   |
    | <mensaje> |
  Ejemplos:
    | La Tarjeta              | Seleccionada | boton            | mensaje                             |

    | Alerts, Frame & Windows | Alerts       | timerAlertButton | This alert appeared after 5 seconds |
    | Alerts, Frame & Windows | Alerts       | alertButton      | You clicked a button                |
    | Alerts, Frame & Windows | Alerts       | confirmButton    | Do you confirm action?              |

