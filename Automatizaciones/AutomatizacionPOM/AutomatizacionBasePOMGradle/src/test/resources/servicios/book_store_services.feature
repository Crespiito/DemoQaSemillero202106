#language: es

  Característica: Yo como usuario deseo probar los servicios expuestos de mi aplicacion

    Esquema del escenario: Deseo probar el servicio de mi registro
      #3 etapas: construccion, consumo,

      Dado que quiero consumir el servicio del registro
      Cuando consumo el servicio
        |userName   | password |
        |<userName> |<password>|
      Entonces valido que en la respuesta el usuario exista
      Ejemplos:
      |userName   |password  |
      |UsuarioQa  |Demo123*  |
