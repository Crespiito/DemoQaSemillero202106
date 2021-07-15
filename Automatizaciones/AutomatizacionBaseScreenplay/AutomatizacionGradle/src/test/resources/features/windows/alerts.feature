#language: es

Característica: Como usuario deseo verificar la funcionalidad de los botones del elemento Alerts,Frame y Windows del submenu Alerts

  @Test3
  Esquema del escenario: Funcionalidad de botones


    Dado que el usuario ingresa al modulo de La Tarjeta y al submenu Seleccionando
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |

    Cuando seleccione el boton click me


    Entonces se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar


    Ejemplos:
      | La Tarjeta              | Seleccionado |
      | Alerts, Frame & Windows | Alerts       |

