#language: es


Característica: Como usuario deseo verificar la funcionalidad "Accordian" del modulo "Widgets"

  Escenario: Validar que funcione el evento "Accordian"
    Dado Yo como usuario ingreso a la pestana "Accordian"
    Cuando Selecciono una de los items listados
    Entonces Visualice que se despliegue el texto bajo el item seleccionado, y cualquier otro item se contraiga
