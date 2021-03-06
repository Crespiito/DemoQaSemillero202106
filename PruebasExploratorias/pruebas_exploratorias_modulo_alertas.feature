#language: es
# encoding: iso-8859-1

Característica: Como usuario deseo verificar del módulo "Alerts, Frame & Windows" la
  funcionalidad "Browser Windows"

  Escenario: Validar que en la lista Alerts, Frame & Windows aparezca el item Browser Windows
    Dado Yo como usuario ingrese al modulo "Alerts, Frame & Windows"
    Cuando Seleccione "Browser Windows"
    Entonces Visualice "New Tab", "New Window" y "New Window Message"

    Escenario: Validar que funcione el evento "New Tab"
      Dado Yo como usuario este en Browser Windows
      Cuando selecciono New Tab
      Entonces Se despliega una nueva pestaña en el Navegador

  Escenario: Validar que funcione el evento "New Window"
    Dado Yo como usuario este en Browser Windows
    Cuando selecciono New Window
    Entonces Se despliega una nueva ventana en el Navegador

  Escenario: Validar que funcione el evento "New Tab"
    Dado Yo como usuario este en Browser Windows
    Cuando selecciono New Window Message
    Entonces Se despliega una nueva ventana con el mensaje "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization."

Característica: Como usuario deseo verificar la funcionalidad de los botones "Haz clic en mi" de acuerdo a su referencia
  Escenario: Visualización de alerta
    Dado que el usuario quiera ver la alerta
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará una ventana con un mensaje de la acción ejecutada y para continuar deberá dar click en el botón aceptar

  Escenario: Visualización de alerta después de 5 segundos
    Dado que el usuario quiera ver la alerta después de 5 segundos
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará una ventana después de 5s con un mensaje de la acción ejecutada y para continuar deberá dar click en el botón aceptar

  Escenario: Confirmación de alerta al aceptar
    Dado que el usuario quiera ver la confirmación al seleccionar el botón
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un cuadro donde debe seleccionar aceptar para confirmar la acción y que esta se vea al lado del enunciado del botón

  Escenario: Confirmación de alerta al cancelar
    Dado que el usuario quiera ver la confirmación al seleccionar el botón
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un cuadro donde debe seleccionar cancelar para ver esta elección al lado del enunciado del botón

  Escenario: Confirmación de aviso al aceptar
    Dado que el usuario quiera validar la aparición de un cuadro de aviso
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un aviso donde puede ingresar su nombre el cual se verá reflejado al lado del enunciado si selecciona el botón aceptar.

  Escenario: Confirmación de aviso al cancelar
    Dado que el usuario quiera validar la aparición de un cuadro de aviso
    Cuando seleccione el botón "Haz click en mi" que corresponde a la alerta deseada
    Entonces se mostrará un aviso donde puede ingresar su nombre el cual no se verá reflejado al lado del enunciado si selecciona el botón cancelar.

  Escenario: Como usuario en el modulo Alerts, frame & windows deseo comprobar la funcionalidad
  de los botones Small modal y Large modal
    Dado que como usuario del modulo Alerts, frame & windows
    Cuando selecciono cada boton
    Entonces verifico los mensajes en los alerts

Característica: Se describen los escenarios de prueba enfocados en el sub modulo Nested Frames de la seccion Alerts  de la pagina https://demoqa.com/


  Escenario: Yo como usuario deseo validar la existencia y apariencia de un marcos anidados
    Dado que el usuario ingresa al modulo Nested Frames y ubica un marco dentro de otro marco, delimitados.
    Entonces valido que existan 2 marcos, uno dentro de otro, y que cada uno este delimitado y separado entre si.

  Escenario: Yo como usuario deseo validar la existencia y apariencia de un  marco exterior "parent frame"
    Dado que el usuario ingresa al modulo Nested Frames y ubica el marco exterior " parent frame"
    Entonces valido que exista un marco  exterior "parent frame "

  Escenario: Yo como usuario deseo validar la existencia y apariencia de un  marcos interior "child frame"
    Dado que el usuario ingresa al modulo Nested Frames y ubica el marco interior " parent frame"
    Entonces valido que exista un marco interior "child frame "
