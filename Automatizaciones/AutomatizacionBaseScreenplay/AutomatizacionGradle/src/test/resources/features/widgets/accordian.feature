#language: es

  Característica: Como usuario de demoQA deseo comprobar el funcionamiento
                  de los elementos del modulo widgets


    Antecedentes:
      Dado que como usuario del elemento Accordian

    Escenario: Como usuario del modulo widgets deseo probar el primer elemento de la pestaña Accordian
      Cuando seleciono el elemento con nombre What is Lorem  Ipsum
      Entonces verifico que el texto que aparezca sea acorde a lo esperado del primero elemento

    Escenario: Como usuario del modulo widgets deseo probar el segundo elemento de la pestaña Accordian
      Cuando seleciono el elemento con nombre Where does it come frome
      Entonces verifico que el texto que aparece sea acorde a lo esperado del segundo elemento

    Escenario: Como usuario del modulo widgets deseo probar el tercer elemento de la pestaña Accordian
      Cuando seleciono el elemento con nombre Why do we use it
      Entonces verifico que el texto que aparezca sea acorde a lo esperado del ultimo elemento