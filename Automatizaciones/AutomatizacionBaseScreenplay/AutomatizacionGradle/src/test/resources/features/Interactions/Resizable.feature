#language: es

Característica:Como usuario deseo verificar la funcionalidad "Resizable" del modulo "Interactions"

  Escenario: Validar que en la lista Interactions aparezca el item Resizable
    Dado Yo como usuario ingrese al modulo "Interactions"
    Cuando Seleccione "Resizable"
    Entonces Visualice las opciones "Resizable box" y "Resizable"


  Escenario: Validar que funcione el evento "Resizable box"
    Dado Yo como usuario ingrese al modulo Resizable
    Cuando el usuario seleccione y mueva el item "Resizable box"
    Entonces Visualice que el item "Resizable box" se mueve y cambia su tamano segun el usuario desee dentro del recuadro marcado y predeterminado

  Escenario: Validar que funcione el evento "Resizable"
    Dado Yo como usuario ingrese al modulo Resizable
    Cuando el usuario seleccione y mueva el item "Resizable"
    Entonces Visualice que el item "Resizable" se mueve segun el usuario desee por toda la pantalla y cambie le tamano de este item