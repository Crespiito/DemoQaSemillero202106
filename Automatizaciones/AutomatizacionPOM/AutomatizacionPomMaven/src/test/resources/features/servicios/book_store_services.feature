#language: es

Característica: Yo como usuario deseo probar los servicios expuestos de mi aplicacion
  Esquema del escenario: Deseo probar el servicio de registro
    Dado que quiero consumir el servicio de registro
    Cuando consumo el servicio
      |filtro  |valor|
      |<filtro> |<valor>|
    Entonces valido que en la respuesta el usuario exista
      |filtro  |valor|
      |<filtro> |<valor>|
    Ejemplos:
      |filtro  |valor|
      |filtro |1|
      |filtro |2|
      |filtro |3|
      |filtro |4|
      |filtro |5|
