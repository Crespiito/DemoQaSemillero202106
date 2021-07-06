#language: es


Característica:Como usuario deseo verificar la funcionalidad "Droppable" del modulo "Interactions"
  @TestInteraction

  Escenario: Validar que en la lista Interactions aparezca el item Droppable
    Dado Yo como usuario ingrese al modulo "Interactions"
    Cuando Seleccione "Dragabble"
    Entonces Visualice las pestanas "Simple"  "Accept"  "Prevent Propogation" y "Revert Draggable"


  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Simple"
    Cuando Seleccione y mueva el item "Drag me"
    Entonces Visualice que el item " Drag me" se mueve segun el usuario desee dentro de toda la pantalla

  Escenario: Validar que funcione el evento "Drop here"
    Dado Yo como usuario ingrese a la pestana "Simple"
    Cuando Seleccione y mueva el item "Drag me" y lo suelte en el recuadro "Drop here"
    Entonces Visualice que el item " Drag me" se mueve segun el usuario desee y al soltarlo en el recuadro "Drop here" este cambie de color y se visualice el mensaje "Dropped!"

  Escenario: Validar que funcione el evento "Acceptable"
    Dado Yo como usuario ingrese a la pestana "Accept"
    Cuando Seleccione y mueva el item "Acceptable"
    Entonces Visualice que el item "Acceptable" se mueve segun el usuario desee dentro de toda la pantalla y al soltarlo en el recuadro "Drop here" este cambie de color y se visualice el mensaje "Dropped!"

  Escenario: Validar que funcione el evento "Not Acceptable"
    Dado Yo como usuario ingrese a la pestana "Accept"
    Cuando Seleccione y mueva el item "Not Acceptable"
    Entonces Visualice que el item "Not Acceptable" se mueve segun el usuario desee dentro de toda la pantalla y al soltarlo en el recuadro "Drop here" este no cambie de color ni cambie el mensaje " Drop Here"


  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Prevent Propogation"
    Cuando Seleccione y mueva el item "Drag me"
    Entonces Visualice que el item "Drag me" se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros "Outer droppable" cambian de color a verde oscuro,al pasarlo sobre los recuadros se pone verde claro y al soltarlo en el recuadro "Outer droppable" superior este y el cuadro interior "Inner droppable (greedy)"  cambie de color a azul y se visualice el mensaje "Dropped!" en el recuadro exterior


  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Prevent Propogation"
    Cuando Seleccione y mueva el item "Drag me"
    Entonces Visualice que el item "Drag me" se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros "Outer droppable" cambian de color a verde oscuro, al pasarlo sobre los recuadros se pone verde claro  y al soltarlo en el recuadro "Inner droppable (greedy)" superior, este y el recuadro exterior cambie de color a azul y se visualice el mensaje "Dropped!" en el recuadro interior



  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Prevent Propogation"
    Cuando Seleccione y mueva el item "Drag me"
    Entonces Visualice que el item "Drag me" se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros "Outer droppable" cambian de color a verde oscuro,al pasarlo sobre el recuadro "Outer droppable" inferior se pone verde claro al soltarlo en el mismo cambie de color a azul y se visualice el mensaje "Dropped!" en el recuadro exterior


  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Prevent Propogation"
    Cuando Seleccione y mueva el item "Drag me"
    Entonces Visualice que el item "Drag me" se mueve segun el usuario desee en toda la pantalla, al arrastrarlo los cuadros "Outer droppable" cambian de color a verde oscuro,al pasarlo sobre el recuadro "Inner droppable (greedy)" inferior se pone verde claro al soltarlo en el mismo cambie de color a azul y se visualice el mensaje "Dropped!" en el recuadro interior



  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Revert Draggable"
    Cuando Seleccione y mueva el item "Will Revert"
    Entonces Visualice que el item "Will Revert" se mueve segun el usuario desee en toda la pantalla, al arrastrarlo el cuadro "Drop here" cambian de color a verde oscuro,al pasarlo sobre el recuadro "Drop here" se pone verde claro y al soltarlo en el mismo, cambia de color a azul y se visualice el mensaje "Dropped!" y el cuadro "Will Revert" regresara a su posicion inicial

  Escenario: Validar que funcione el evento "Drag me"
    Dado Yo como usuario ingrese a la pestana "Revert Draggable"
    Cuando Seleccione y mueva el item "Not Revert"
    Entonces Visualice que el item "Not Revert" se mueve segun el usuario desee en toda la pantalla, al arrastrarlo el cuadro "Drop here" cambian de color a verde oscuro,al pasarlo sobre el recuadro "Drop here" se pone verde claro y al soltarlo en el mismo, cambia de color a azul y se visualice el mensaje "Dropped!" y el cuadro "Not Revert" se queda dentro del cuadro "Drop Here"