#language: es


Característica: Como usuario del sistema ToolsQA deseo verificar el elemento
  "Text Box" del modulo Elements para confirmar su correcto funcionamiento

  @Test1
  Esquema del escenario: Validar que en la lista Elements aparezca el item Text Box
    Dado Yo como usuario este en el formulario desplegado de "Text Box"
     # |La Tarjeta|Seleccionado|
      #|<La Tarjeta>| <Seleccionado>|

    Cuando Diligencio cada uno de los campos
      #|fullName|email|currentAddress|permanentAddress|
     # |<fullName>|<email>|<currentAddress>|<permanentAddress>|
    Entonces Despliegue el formulario
    Ejemplos:
     # |La Tarjeta|Seleccionado|
      #|Elements     |Text Box|



  Escenario: Diligenciar todos los campos del formulario "Text Box"
    Dado Yo como usuario este en el formulario desplegado de "Text Box"

    Cuando Diligencio cada uno de los campos
    # |fullName|email|currentAddress|permanentAddress|
     #|<fullName>|<email>|<currentAddress>|<permanentAddress>|

    Entonces Se visualizara el resumen de la informacion diligenciada
    # |fullName|email|currentAddress|permanentAddress|
    # |<fullName>|<email>|<currentAddress>|<permanentAddress>|

  Escenario: Diligenciar solo el campo "Full Name" del formulario
    Dado Yo como usuario este en el formulario desplegado de <Seleccionado>

    Cuando Diligencio solo el campo <fullName>

    Entonces Se visualizara el resumen con el nombre

  Escenario: Diligenciar solo el campo "E mail" del formulario
    Dado Yo como usuario este en el formulario desplegado de <Seleccionado>
    Cuando Diligencio solo el campo <email>
    Entonces Se visualizara el resumen del <email>

  Escenario: Enviar el formulario sin diligenciar
    Dado Yo como usuario este en el formulario desplegado de <Seleccionado>
    Cuando Envio el formulario sin diligenciar
    Entonces No se visualizara ningun cambio


