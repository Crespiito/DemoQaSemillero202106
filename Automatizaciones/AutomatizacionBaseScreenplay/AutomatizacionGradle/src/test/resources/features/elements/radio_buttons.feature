#language: es


Característica: Como usuario deseo verificar la funcionalidad del ítem Radio Button del módulo Elements
  Escenario: Validar que en la lista de Elements aparezca  el ítem Radio Button
    Dado que el usuario acceda al modulo Elements
    Cuando despliegue la lista de Elements
    Entonces valido que este presente el item Radio Button

  Escenario: Ingreso al ítem Radio Button
    Dado que el usuario ubique el item Radio Button en la lista de Elements
    Cuando seleccione el item Radio Button
    Entonces se le mostrara el contenido de esa seccion

  Escenario: Elija que si le gusto el sitio
    Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta
    Cuando marque la opcion "Si"
    Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera "Has seleccionado Si"

  Escenario: Elija que le impresiona el sitio
    Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta
    Cuando marque la opcion "Impresionante"
    Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera "Has seleccionado Impresionante"

  Escenario: Quiera marcar que no le gusto el sitio
    Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta
    Cuando se ubique en la opcion No
    Entonces podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion