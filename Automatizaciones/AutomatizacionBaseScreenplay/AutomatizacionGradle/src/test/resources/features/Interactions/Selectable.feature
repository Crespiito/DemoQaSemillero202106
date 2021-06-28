#language: es

Característica:Como usuario deseo verificar la funcionalidad "Selectable" del modulo "Interactions"

  Escenario: Validar que en la lista Interactions aparezca el item Selectable
    Dado Yo como usuario ingrese al modulo "Interactions"
    Cuando Seleccione "Selectable"
    Entonces Visualice las pestanas "List"  "Grid"

  Escenario: Validar que funcione el evento "List"
    Dado Yo como usuario ingrese al modulo "List"
    Cuando Seleccione uno o varios de los items listados al darle click una vez sobre ellos
    Entonces Visualice que los items que han sido clickeados una vez cambian de color al ser seleccionados

  Escenario: Validar que funcione el evento "Grid"
    Dado Yo como usuario ingrese al modulo "Grid"
    Cuando Seleccione uno o varios de los items en los recuadros delimitados, al darle click una vez sobre ellos
    Entonces Visualice que los items que han sido clickeados una vez cambian de color al ser seleccionados

