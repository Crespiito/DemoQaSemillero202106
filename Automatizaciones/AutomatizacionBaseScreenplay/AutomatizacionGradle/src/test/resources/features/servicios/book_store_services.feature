#language: es
  Característica: Yo como usuario deseo probar los servicios expuestos de mi aplicacion

    @servicio
    Escenario: Deseo Probar el servicio de registro
      Dado que quiero consumir el servicio de registro
      Cuando consumo el servicio
      Entonces Valido que en la respuesta el usuario exista