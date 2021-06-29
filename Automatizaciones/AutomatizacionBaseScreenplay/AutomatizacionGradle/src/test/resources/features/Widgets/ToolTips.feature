#language: es


Característica: Como usuario deseo verificar la funcionalidad "ToolTips" del modulo "Widgets"
  @TestWidgets

  Escenario: Validar que funcione el evento "Hover me to see" en un boyon
    Dado Yo como usuario ingrese a la pestana "ToolTips"
    Cuando Ubico el boton "Hover me to see" y pasa el cursor sobre el o lo clickea
    Entonces Visualice el mensaje "You hovered over the Button"

  Escenario: Validar que funcione el evento "Hover me to see" en un campo
    Dado Yo como usuario ingrese a la pestana "ToolTips"
    Cuando Ubico el campo "Hover me to see" y pasa el cursor sobre el, lo clickea, o escribe en el
    Entonces Visualice el mensaje "You hovered over the text field"

  Escenario: Validar que funcione el evento "Hover me to see" en un texto
    Dado Yo como usuario ingrese a la pestana "ToolTips"
    Cuando Ubico el campo o texto en color azul y pasa el cursor sobre el, lo clickea y se subraya
    Entonces Visualice el mensaje "You hovered over the" campo o texto