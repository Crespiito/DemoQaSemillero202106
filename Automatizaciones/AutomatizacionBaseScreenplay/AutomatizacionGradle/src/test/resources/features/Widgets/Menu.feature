#language: es


Característica: Como usuario deseo verificar la funcionalidad "Menu" del modulo "Widgets"
  Escenario: Validar que funcione el evento "Menu"
    Dado Yo como usuario ubico la opcion "Main Item 1"
    Cuando Seleccione el item "Main Item 1"
    Entonces Visualice que el item seleccionado cambie de color

  Escenario: Validar que funcione el evento "Menu"
    Dado Yo como usuario ubico la opcion "Main Item 3"
    Cuando Seleccione el item "Main Item 3"
    Entonces Visualice que el item seleccionado cambie de color

  Escenario: Validar que funcione el evento "Menu"
    Dado Yo como usuario ubico la opcion "Main Item 2"
    Cuando Seleccione el item "Main Item 2" o uno de sus sub items
    Entonces Visualice que el item seleccionado cambie de color y me despliegue un listado bajo el

