#language: es

  Característica: Yo como usuario deseo probar los servicios expuestos de mi aplicacion
    Escenario: Deseo probar el servicio de mi registro
      #3 etapas: construccion, consumo,
      Dado que quiero consumir el servicio del registro
      Cuando consumo el servicio
      Entonces valido que en la respuesta el usuario exista
