#language: es


Característica: Como usuario deseo verificar la funcionalidad "Slider" del modulo "Widgets"

  Escenario: Validar que funcione el evento "Slider"
    Dado Yo como usuario ingrese a la pestana "Slider"
    Cuando Seleccione y mueva el item "Slider" o circulo azul
    Entonces Visualice que el item "Slider" se mueve segun el usuario desee y se muestre la posicion en la que esta entre 0 y 100 bajo el circulo azul y en el recuadro
