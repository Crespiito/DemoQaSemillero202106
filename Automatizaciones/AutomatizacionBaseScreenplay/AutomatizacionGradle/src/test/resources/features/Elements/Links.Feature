#language: es

Característica: Como usuario deseo probar los links de el elemento "Links"
  @TestElements

  Escenario: Comprobar los links de el enunciado "Following links will open new tab"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Home"
    Entonces Me (lleva) direccionaria a la pagina inicial "demoqa.com"


  Escenario: Comprobar los links de el enunciado "Following links will open new tab"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "HomeFQTwx"
    Entonces Me (lleva) direccionaria a la pagina inicial "demoqa.com"

      #Items parte Titulo 2 links

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Created"
    Entonces Me deberia mostrar un mensaje que diga "Link has responded with staus 201 and status text Created"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "No Content"
    Entonces Me deberia mostrar un mensaje que diga "Link has responded with staus 204 and status text No Content"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Moved"
    Entonces Me deberia mostrar un mensaje que diga "Link has responded with staus 301 and status text Moved Permanently"

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Bad Request"
    Entonces Me deberia mostrar un mensaje que diga "Link has responded with staus 400 and status text Bad Request"

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Unauthorized"
    Entonces Me deberia mostrar un mensaje que diga "Link has responded with staus 401 and status text Unauthorized"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Forbidden"
    Entonces Me deberia mostrar un mensaje que diga "Link has responded with staus 403 and status text Forbidden"


  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina "Links"
    Cuando selecciono el link "Not Found"
    Entonces Me deberia mostrar un mensaje que diga "Link has responded with staus 404 and status text Not Found"