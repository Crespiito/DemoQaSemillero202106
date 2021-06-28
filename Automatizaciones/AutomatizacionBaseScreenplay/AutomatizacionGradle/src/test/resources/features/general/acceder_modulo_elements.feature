#language: es

Característica: Como usuario deseo acceder al modulo y verificar los elementos del submenu

  @tet
  Esquema del escenario: Como usuario deseo ingresar al submenu del modulo Elements
    Dado Yo como usuario ingrese a la Tarjeta y el submenu Seleccionado
      | Tarjeta   | Seleccionado   |
      | <Tarjeta> | <Seleccionado> |
    Cuando Selecciono el submenu Text_Box
    Entonces Se visualizara su contenido
    Ejemplos:
      | Tarjeta  | Seleccionado  |
      | Elements | Text Box      |
      | Elements | Check Box     |
      | Forms    | Practice Form |


