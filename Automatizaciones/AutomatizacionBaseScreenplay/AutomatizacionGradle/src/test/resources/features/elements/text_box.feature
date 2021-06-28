#language: es

Característica: Como usuario deseo verificar del modulo Elements las funcionalidad Text Box


  Escenario: Validar que en la lista Elements aparezca el item Text Box
    Dado Yo como usuario ingrese al modulo Elements
    Cuando Seleccione Text Box
    Entonces Despliegue el formulario

  @tet2
  Escenario: Diligenciar todos los campos del formulario Text Box
    Dado Yo como usuario este en el formulario desplegado de Text Box
    Cuando Diligencio el campo Full Name y Email y CurrentAddress y PermanentAddress
    Entonces Se visualizara el resumen de la informacion diligenciada


  Escenario: Diligenciar solo el campo Full Name del formulario
    Dado Yo como usuario este en el formulario desplegado de Text Box
    Cuando Diligencio solo el campo Full Name
    Entonces Se visualizara el resumen con el nombre

  Escenario: Diligenciar solo el campo E mail del formulario
    Dado Yo como usuario este en el formulario desplegado de Text Box
    Cuando Diligencio solo el campo E mail
    Entonces Se visualizara el resumen del E mail

  Escenario: Enviar el formulario sin diligenciar
    Dado Yo como usuario este en el formulario desplegado de Text Box
    Cuando Envio el formulario sin diligenciar
    Entonces No se visualizara ningun cambio


