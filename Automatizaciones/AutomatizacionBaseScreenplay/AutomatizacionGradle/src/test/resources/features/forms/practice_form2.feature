#language: es

Característica: Como usuario del sistema ToolsQa deseo verificar el elemento


  @test11
  Esquema del escenario: Escenario: Como usuario del modulo form deseo co0nfirmar
    Dado que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado
      | La Tarjeta   | Seleccionado   |
      | <La Tarjeta> | <Seleccionado> |
    Cuando Selecciono el boton subir
      | Nombre   | Apellido   | Genero   | Mobile   | Email   | Subject   | CurrentAddres   |
      | <Nombre> | <Apellido> | <Genero> | <Mobile> | <Email> | <Subject> | <CurrentAddres> |
    Entonces Confirmo su se registro el formulario con campos vacios
      | Nombre   | Apellido   | Genero   | Mobile   | Email   | Subject   | CurrentAddres   |
      | <Nombre> | <Apellido> | <Genero> | <Mobile> | <Email> | <Subject> | <CurrentAddres> |
    Ejemplos:
      | La Tarjeta | Seleccionado  | Nombre | Apellido  | Genero | Mobile     | Email         | Subject | CurrentAddres  |
      | Forms      | Practice Form | Juan   | Hernandez | Male   | 1111111111 | juan@mail.com | English | Calle 1 #12-12 |

     # | Elements   | Text Box      |
     # | Elements   | Check Box     |


    # Funciona pero no usa model
    # Esquema del escenario: Escenario: Como usuario del modulo form deseo co0nfirmar
    # Dado que el usuario ingresa a la opcion de <La Tarjeta> y el submenu <Seleccionado>
    # | La Tarjeta   | Seleccionado   |
    # | <La Tarjeta> | <Seleccionado> |
    # Cuando Selecciono el boton subir
    # Entonces Confirmo su se registro el formulario con campos vacios
    # Ejemplos:
    # | La Tarjeta | Seleccionado  |
    #| Forms      | Practice Form |
    # | Elements   | Text Box      |
    # | Elements   | Check Box     |