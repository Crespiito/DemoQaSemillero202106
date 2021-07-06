#language: es

  Característica:Como usuario de demoQA deseo comprobar el funcionamiento
    de los elementos del modulo widgets

  Escenario: como usuario del elemento auto complete deseo verificar el
              funcionamiento de sus cajas de texto con datos validos

    Dado que como usuario del elemento auto complete
    Cuando ingreso varias iniciales de colores
    Entonces confirmo si reconoce las iniciales y auto completa el nombre

    Escenario: como usuario del elemento auto complete deseo verificar el
    funcionamiento de sus cajas de texto con datos invalidos

      Dado que como usuario del elemento auto complete
      Cuando ingreso numeros y caracteres especiales en la caja de texto
      Entonces confirmo si  autocompleta alguna palabra

