#language: es


Característica: Como usuario deseo probar los links de el elemento Links

  Escenario: Comprobar los links de el enunciado Following links will open new tab

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link Home
    Entonces : Me direcciona a la pagina inicial demoqa.com


  Escenario: Comprobar los links de el enunciado Following links will open new tab

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link HomeFQTwx
    Entonces : Me direcciona a la pagina inicial demoqa.com



  Escenario: Comprobar los links de el enunciado Following links will send an api call

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link Created
    Entonces : Me debe mostrar un mensaje que diga Link has responded with staus 201 and status text Created


  Escenario: Comprobar los links de el enunciado Following links will send an api call

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link No Content
    Entonces : Me debe mostrar un mensaje que diga Link has responded with staus 204 and status text No Content


  Escenario: Comprobar los links de el enunciado Following links will send an api call

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link Moved
    Entonces : Me deba mostrar un mensaje que diga Link has responded with staus 301 and status text Moved Permanently

  Escenario: Comprobar los links de el enunciado Following links will send an api call

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link Bad Request
    Entonces : Me debe mostrar un mensaje  que diga Link has responded with staus 400 and status text Bad Request

  Escenario: Comprobar los links de el enunciado Following links will send an api call

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link Unauthorized
    Entonces : Me debe mostrar un mensaje que diga Link has responded with staus 401 and status text Unauthorized


  Escenario: Comprobar los links de el enunciado Following links will send an api call

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link Forbidden
    Entonces : Me debe mostrar un mensaje que diga Link has responded with staus 403 and status text Forbidden


  Escenario: Comprobar los links de el enunciado Following links will send an api call

    Dado : que como usuario me encuentro en la pagina Links
    Cuando : selecciono el link Not Found
    Entonces : Me debe mostrar un mensaje que diga Link has responded with staus 404 and status text Not Found