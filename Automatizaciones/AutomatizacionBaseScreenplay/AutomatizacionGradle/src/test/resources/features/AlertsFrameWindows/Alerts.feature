#language: es


Característica: Como usuario deseo verificar la funcionalidad de los botones "Haz clic en mi" de acuerdo a su referencia
 //@TestAlerts

  #Click Button to see alert
  Escenario: Visualizacion de alerta
    Dado que el usuario quiera ver la alerta
    Cuando seleccione el boton "Click me" que corresponde a la alerta deseada
    Entonces se mostrara una ventana con el mensaje "You clicked a button" y para continuar debera dar click en el boton "Aceptar"


    #On button click, alert will appear after 5 seconds
  Escenario: Visualizacion de alerta despues de cinco segundos
    Dado que el usuario quiera ver la alerta despues de cinco segundos
    Cuando seleccione el boton "Click me" que corresponde a la alerta deseada
    Entonces se mostrara una ventana despues de cinco seg con el mensaje "This alert appeared after 5 seconds" y para continuar debera dar click en el boton "Aceptar"


    #On button click, confirm box will appear - select Acept
  Escenario: Confirmacion de alerta al aceptar
    Dado que el usuario quiera ver la Confirmacion al seleccionar el boton
    Cuando seleccione el boton "Click me" que corresponde a la alerta deseada
    Entonces se mostrara un cuadro donde debe seleccionar "Aceptar" para confirmar la accion y que esta se vea al lado del enunciado del boton


  #On button click, confirm box will appear - Select Cancel
  Escenario: Confirmacion de alerta al cancelar
    Dado que el usuario quiera ver la Confirmacion al seleccionar el boton
    Cuando seleccione el boton "Click me" que corresponde a la alerta deseada
    Entonces se mostrara un cuadro donde debe seleccionar cancelar para ver esta eleccion al lado del enunciado del boton


    #On button click, prompt box will appear
  Escenario: Confirmacion de aviso al aceptar
    Dado que el usuario quiera validar la aparicion de un cuadro de aviso
    Cuando seleccione el boton "Click me" que corresponde a la alerta deseada
    Entonces se mostrara un aviso donde puede ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar.

  Escenario: Confirmacion de aviso al cancelar
    Dado que el usuario quiera validar la aparicion de un cuadro de aviso
    Cuando seleccione el boton "Click me" que corresponde a la alerta deseada
    Entonces se mostrara un aviso donde puede ingresar su nombre el cual no se vera reflejado al lado del enunciado si selecciona el boton cancelar.


#Modal dialogs

  #Escenario: Como usuario en el modulo Alerts, frame & windows deseo comprobar la funcionalidad
  #de los botones Small modal y Large modal
   # Dado que como usuario del modulo Alerts, frame & windows
    #Cuando selecciono cada boton
    #Entonces verifico los mensajes en los alerts
