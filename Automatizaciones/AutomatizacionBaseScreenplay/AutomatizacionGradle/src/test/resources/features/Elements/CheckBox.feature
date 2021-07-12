#language: es

Característica: Como usuario deseo verificar del módulo
  "Elements" las funcionalidad "Check Box"

  @Test1
Escenario: Validar que en la lista Elements aparezca el item Check Box

  Dado Yo como usuario ingrese al modulo <La Tarjeta>
  Cuando Seleccione <Seleccionado>
  Entonces Visualice <Carpeta>
    Ejemplos:
    |La Tarjeta|Seleccionado|Carpeta|
    |Elements  |Check Box|Home|


Escenario: validar que funcione el evento Toggle "Home"
  Dado Yo como usuario este en la funcionalidad <Seleccionado>
  Cuando Seleccione el Toggle o listar de <Carpeta>
  Entonces Se desplegara las carpetas que contiene <Carpeta>
  Ejemplos:
   |Seleccionado|Carpeta|
   |Check Box|Home|


Escenario: Validar que funcione el check box de "Home"
  Dado Yo como usuario este en la funcionalidad <Seleccionado>
  Cuando Seleccione el check box o desplegar de <Carpeta>
  Entonces Visualice el siguiente mensaje <Mensaje>
  Ejemplos:
    |Seleccionado|Carpeta|Mensaje|
    |Check Box|Home|You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile|


Escenario: validar que se deseleccionen las carpetas al interior de la subcarpeta "Documents"
  Dado Yo como usuario tenga seleccionado el check box de <Carpeta>
  Y  desplegado el Toggle <Carpeta>
  Cuando Deselecciono <Subcarpeta>
  Y Selecciono el Toggle de <Subcarpeta>
  Entonces <Subcarpeta> y las carpetas en su interior se deseleccionan
  Ejemplos:
   |Carpeta|Subcarpeta|
   |Home|Documents|


#Expandir y contraer todas las carpetas

Escenario: Validar que funcione el evento "Expand All"
  Dado Yo como usuario este en la funcionalidad <Seleccionado>
  Cuando Seleccione el evento "Expand All"
  Entonces Visualizare toda las carpetas que se encuentran al interior de <Carpeta>

Escenario: Validar que funcione el evento "Collapse All"
  Dado Yo como usuario este en la funcionalidad <Seleccionado>
  Y se haya seleccionado el evento "Expand All"
  Cuando Seleccione el evento "Collapse All"
  Entonces Visualizare que todas las carpetas desaparecen excepto <Carpeta>