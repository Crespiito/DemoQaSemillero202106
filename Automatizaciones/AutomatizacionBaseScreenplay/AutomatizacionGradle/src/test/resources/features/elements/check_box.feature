#language: es
Característica: Como usuario deseo verificar del módulo
  "Elements" las funcionalidad "Check Box"
Escenario: Validar que en la lista Elements aparezca el item Check Box
  Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
    |La Tarjeta|Seleccionado|
    |Elements|Check Box|
Cuando Seleccione "Check Box"
Entonces Visualice Home

Escenario: validar que funcione el evento Toggle Home
  Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
    |La Tarjeta|Seleccionado|
    |Elements|Check Box|
Cuando Seleccione Toggle Home
Entonces Se desplegara las carpetas que contiene Home

Escenario: Validar que funciones el check box de Home
  Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
    |La Tarjeta|Seleccionado|
    |Elements|Check Box|
Cuando Seleccione el check box de Home
Entonces Visualice el siguiente mensaje "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile"

Escenario: validar que se deseleccionen las carpetas al interior de "Documents"
  Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
    |La Tarjeta|Seleccionado|
    |Elements|Check Box|
Y  desplegado el Toggle Home
Cuando Deselecciono Documents
Y Selecciono el Toggle de Documents
Entonces Documents y las carpetas en su interior se deseleccionan

Escenario: Validar que funcione el evento "Expand All"
  Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
    |La Tarjeta|Seleccionado|
    |Elements|Check Box|
Cuando selecciono el evento "Expand All"
Entonces Visualizare toda las carpetas que se encuentran al interior de "Home"

Escenario: Validar que funcione el evento "Collapse All"
  Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
    |La Tarjeta|Seleccionado|
    |Elements|Check Box|
Y se haya seleccionado el evento "Expand All"
Cuando Seleccione el evento "Collapse All"
Entonces Visualizare que todas las carpetas desaparecen excepto "Home"