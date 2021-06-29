#language: es


Característica: Como usuario deseo verificar la funcionalidad "SelectMenu" del modulo "Widgets"
  @TestWidgets

  Escenario: Validar que funcione el evento "Select Value"
    Dado Yo como usuario ubico la opcion "Select Value" y el recuadro "Select Option"
    Cuando Seleccione y mueva el item "Select Option", y selecciono uno de las opciones de la lista que se despliega
    Entonces Visualice que el item seleccionado aparece en el recuadro en lugar de "Select Option"

  Escenario: Validar que funcione el evento "Select One"
    Dado Yo como usuario ubico la opcion "Select One" y el recuadro "Select Title"
    Cuando Seleccione y mueva el item "Select Title", y selecciono uno de los items de la lista que se despliega
    Entonces Visualice que el item seleccionado aparece en el recuadro en lugar de "Select Title"

  Escenario: Validar que funcione el evento "Old Style Select Menu"
    Dado Yo como usuario ubico la opcion "Old Style Select Menu" y un recuadro con opcion para desplegar
    Cuando Seleccione y despliegue el recuadro, selecciono uno de los items de la lista que se despliega
    Entonces Visualice que el item seleccionado aparece en el recuadro

  Escenario: Validar que funcione el evento "Multiselect drop down"
    Dado Yo como usuario ubico la opcion "Multiselect drop down" y un recuadro "Select" con opcion para desplegar
    Cuando Seleccione y despliegue el recuadro "Select", selecciono uno o varios items de la lista que se despliega
    Entonces Visualice que el o los items seleccionado aparece en el recuadro en lugar de "Select"

  Escenario: Validar que funcione el evento "Standard multi select"
    Dado Yo como usuario ubico la opcion "Standard multi select" y un recuadro que me lista varias opciones
    Cuando Seleccione una de las opciones en el recuadro
    Entonces Visualice que el item seleccionado aparece en el recuadro sombreado de otro color