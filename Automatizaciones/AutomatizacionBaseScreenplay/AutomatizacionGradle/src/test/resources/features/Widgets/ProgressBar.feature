#language: es


Característica: Como usuario deseo verificar la funcionalidad "ProgressBar" del modulo "Widgets"

  Escenario: Validar que funcione el evento "ProgressBar"
    Dado Yo como usuario ingrese a la pestana "ProgressBar"
    Cuando Seleccione el boton Start
    Entonces Visualice que el boton "Start" cambia a "Stop" y una barra que se empieza a colorear verticalmente de azul y marcar de 0% a 100%, al llegar a 100% cambia toda la barra a color verde y el boton "Stop" cambia a "Reset"
