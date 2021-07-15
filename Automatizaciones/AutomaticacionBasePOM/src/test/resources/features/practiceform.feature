#language: es

Característica:  Como usuario del sistema ToolsQA deseo verificar el elemento
  practice form del modulo Forms para confirmar su correco funcionamiento


  Esquema del escenario: Como usuario del modulo forms deseo confirmar el envio del formulario con los campos vacios

    Dado que el usuario ingresa al modulo de La Tarjeta y al submenu Seleccionando
      |La Tarjeta|Seleccionado|
      |<La Tarjeta>| <Seleccionado>|

    Cuando lleno el formulario

      | nombre   | apellido   | correo   |telefono| genero   |
      | <nombre> | <apellido> | <correo> |<telefono>|<genero> |


    Entonces confirmo si se registra el formulario
      | nombre   | apellido   | correo   |telefono |genero   |
      | <nombre> | <apellido> | <correo> |<telefono>| <genero> |

    Ejemplos:
      | La Tarjeta | Seleccionado  | nombre | apellido  | correo|telefono| genero |
      |Forms|Practice Form | juan   | bautista  | correo@correo.com |123456789| Female |
      | Elements   | Text Box      | juan   | bautista2 | correo@gmail.com   |123454367| Male   |

