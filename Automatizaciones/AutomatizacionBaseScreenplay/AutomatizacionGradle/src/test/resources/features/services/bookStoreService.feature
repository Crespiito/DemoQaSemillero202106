#language: es

Característica: Yo como usuario deseo probar los servicios expuestos de mi aplicacion

  Escenario: Deseo probar el servicio de registro
    Dado que como ususario quiero consumir el servicio del registro
    Cuando Consumo el servicio
    Entonces valido que en la respuesta el ususario exista