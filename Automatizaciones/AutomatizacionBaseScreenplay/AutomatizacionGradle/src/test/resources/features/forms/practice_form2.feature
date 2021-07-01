#language: es

Característica: Como usuario del sistema ToolsQa deseo verificar el elemento


  @test11
  Esquema del escenario: Escenario: Como usuario del modulo form deseo co0nfirmar
    Dado que el usuario ingresa a la opcion de <La Tarjeta> y el submenu <Seleccionado>
     # | La Tarjeta   | Seleccionado   |
     # | <La Tarjeta> | <Seleccionado> |
    Cuando Selecciono el boton subir
    Entonces Confirmo su se registro el formulario con campos vacios
    Ejemplos:
      | La Tarjeta | Seleccionado  |
      | Forms      | Practice Form |
     # | Elements   | Text Box      |
     # | Elements   | Check Box     |