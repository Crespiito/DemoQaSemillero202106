#language: es

Característica: Como usuario deseo verificar la funcionalidad del item Radio Button del modulo Elements

  @Test1
  Escenario: Validar que en la lista de Elements aparezca  el item Radio Button
    Dado que el usuario acceda al modulo Elements
     # |La Tarjeta|Seleccionado|
     # |<La Tarjeta>| <Seleccionado>|
    Cuando seleccione el item Radio Button
   Entonces se le mostrara el contenido de esa seccion
    #Ejemplos:
      #|La Tarjeta|Seleccionado|
     # |Elements  |Radio Button|



  #Escenario: Elija que si le gusto el sitio
   # Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta

    #Cuando marque la opcion Si
    #Cuando marque la opcion <Opcion>

   #Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera Has seleccionado si
    #Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera <Mensaje>
   # Entonces podra ver un mensaje con la opcion Yes seleccionada
    #Ejemplos:
     # |Opcion|Mensaje|
      #|Si  |Has seleccionado si|


  #Escenario: Elija que le impresiona el sitio
   # Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta

    #Cuando marque la opcion "Impresionante"
    #Cuando marque la opcion <Opcion>

    #Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera "Has seleccionado Impresionante"
    #Entonces podra ver un mensaje con la opcion seleccionada de la siguiente manera <Mensaje>
   # Entonces podra ver un mensaje con la opcion Impressive seleccionada
   #Ejemplos:
    # |Opcion|Mensaje|
     #|Impresionante|Has seleccionado Impresionante|


  #Escenario: Quiera marcar que no le gustó el sitio
    #Dado que el usuario haya leido la pregunta ¿Te gusta el sitio? y decida entre las opciones de respuesta

   # Cuando se ubique en la opcion "No"
   # Cuando marque la opcion <Opcion>

    #Entonces podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion
