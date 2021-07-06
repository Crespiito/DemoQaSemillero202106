#language: es


Característica: Como usuario deseo verificar del modulo "Alerts, Frame y Windows" la funcionalidad "Browser Windows"
  @TestAlerts
  Escenario: Como usuario en el modulo Alerts, frame y windows deseo comprobar la funcionalidad de los botones Small modal y Large modal
    Dado que como usuario del modulo Alerts, frame y windows
    Cuando selecciono cada boton
    Entonces verifico los mensajes en los alerts
