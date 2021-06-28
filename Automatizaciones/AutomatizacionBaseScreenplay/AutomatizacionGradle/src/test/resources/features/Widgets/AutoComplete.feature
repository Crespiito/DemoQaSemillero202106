#language: es


Característica: Como usuario deseo verificar la funcionalidad "AutoComplete" del modulo "Widgets"

  Escenario: Validar que funcione el evento "AutoComplete"
    Dado Yo como usuario ubico la opcion "Type multiple color names" y un recuadro bajo el
    Cuando Seleccione el recuadro escibo algo en el y completo con las opciones que se despliegan, selecciono uno o varios items de la lista que se despliega o repito el proceso
    Entonces Visualice que el o los items seleccionado aparece en el recuadro

  Escenario: Validar que funcione el evento "AutoComplete"
    Dado Yo como usuario ubico la opcion "Type single color name" y un recuadro bajo el
    Cuando Seleccione el recuadro escibo algo en el y completo con una de las opciones que se despliegan, selecciono uno de los items de la lista que se despliega
    Entonces Visualice que el item seleccionado aparece en el recuadro