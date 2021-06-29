#language: es

Característica:Como usuario deseo verificar la funcionalidad "Sortable" del modulo "Interactions"
  @TestInteraction

  Escenario: Validar que en la lista Interactions aparezca el item Selectable
    Dado Yo como usuario ingrese al modulo "Interactions"
    Cuando Seleccione "Sortable"
    Entonces Visualice las pestanas "List"  "Grid"

  Escenario: Validar que funcione el evento "List"
    Dado Yo como usuario ingrese al modulo "List"
    Cuando Seleccione un item listado y lo arrastre a otra posicion
    Entonces Visualice que el item arrastrado se movio a donde el usuario deseaba, y los demas items del listado subieron y cambiaron de orden

  Escenario: Validar que funcione el evento "Grid"
    Dado Yo como usuario ingrese al modulo "Grid"
    Cuando Seleccione un item en los recuadros delimitados y lo arrastre a otra posicion
    Entonces Visualice que el item arrastrado se movio a donde el usuario deseaba y cambio de posicion con el recuadro a donde lo movio

