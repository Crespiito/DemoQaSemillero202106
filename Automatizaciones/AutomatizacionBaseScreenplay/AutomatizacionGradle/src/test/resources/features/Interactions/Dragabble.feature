#language: es


Característica: Como usuario deseo verificar la funcionalidad "Dragabble" del modulo "Interactions"
  @TestInteraction

  Escenario: Validar que en la lista Interactions aparezca el item Dragabble
    Dado Yo como usuario ingrese al modulo "Interactions"
    Cuando Seleccione "Dragabble"
    Entonces Visualice las pestanas "Simple"  "Axis Restricted"  "Container Restricted" y "Cursor Style"

  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Simple"
    Cuando Seleccione y mueva el item "Drag me"
    Entonces Visualice que el item " Drag me" se mueve segun el usuario desee


  Escenario: Validar que funcione el evento "Only X" correctamente
    Dado Yo como usuario ingrese a la pestana "Axis Restricted"
    Cuando Seleccione y mueva el item "Only X"
    Entonces Visualice que el item "Only X" se mueve solamente horizontalmente dentro de la pantalla

  Escenario: Validar que funcione el evento "Only Y" correctamente
    Dado Yo como usuario ingrese a la pestana "Axis Restricted"
    Cuando Seleccione y mueva el item "Only Y"
    Entonces Visualice que el item "Only Y" se mueve solamente verticalmente dentro de la pantalla

  Escenario: Validar que funcione el evento "Container Restricted" correctamente dentro de un recuadro
    Dado Yo como usuario ingrese a la pestana "Container Restricted"
    Cuando Seleccione y mueva el item "I'm contained within the box"
    Entonces Visualice que el item "I'm contained within the box" se mueve solamente dentro del recuadro definido y que le texto es estatico

  Escenario: Validar que funcione el evento "Container Restricted" correctamente al tener un texto dentro de un recuadro
    Dado Yo como usuario ingrese a la pestana "Container Restricted"
    Cuando Seleccione y mueva el item "I'm contained within my parent"
    Entonces Visualice que el texto "I'm contained within my parent" se mueve dentro del recuadro definido y que le recuadro en el que esta contenido es estatico


  Escenario: Validar que funcione el evento "Cursor Style" correctamente con el cursor en el centro
    Dado Yo como usuario ingrese a la pestana "Cursor Style"
    Cuando Seleccione y mueva el item "I will always stick to the center"
    Entonces Visualice que el item "I will always stick to the center" se mueve correctamente y que el cursor se visualiza en el centro del recuadro

  Escenario: Validar que funcione el evento "Cursor Style" correctamente con el cursor en la esquina superior izquierda del recuadro
    Dado Yo como usuario ingrese a la pestana "Cursor Style"
    Cuando Seleccione y mueva el item "My cursor is at top left"
    Entonces Visualice que el item "My cursor is at top left" se mueve correctamente y que el cursor se visualiza en la esquina superior izquierda del recuadro


  Escenario: Validar que funcione el evento "Cursor Style" correctamente con el cursor en la base inferior del recuadro
    Dado Yo como usuario ingrese a la pestana "Cursor Style"
    Cuando Seleccione y mueva el item "My cursor is at bottom"
    Entonces Visualice que el item "My cursor is at bottom" se mueve correctamente y que el cursor se visualiza en la base inferior del recuadro
