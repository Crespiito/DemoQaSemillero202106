#language: es


Característica: Como usuario deseo verificar la funcionalidad "Date Picker" del modulo "Widgets"

  Escenario: Validar que funcione el evento "Date Picker"
    Dado Yo como usuario ubico la opcion "Select Date" y el recuadro "Select Date"
    Cuando Seleccione el recuadro "Select Date", y selecciono una de las fechas de la lista que se despliega
    Entonces Visualice que la fecha seleccionada aparece en formato numerico en el recuadro en lugar de "Select Date"

  Escenario: Validar que funcione el evento "Date Picker"
    Dado Yo como usuario ubico la opcion "Date And Time" y el recuadro que debe mostrar la fecha y hora actual
    Cuando Seleccione el recuadro y escojo una de las fechas y horarios de las listas que se despliega
    Entonces Visualice que la fecha y hora seleccionada aparece en el recuadro
