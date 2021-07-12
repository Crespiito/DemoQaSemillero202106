#language: es

Característica: Como usuario deseo probar los links de el elemento "Links"
  @Test1
  Escenario: Comprobar los links de el enunciado "Following links will open new tab"
    Dado que como usuario me encuentro en la pagina <Seleccionado>
     # |Seleccionado|
     # |<Seleccionado>|
    Cuando selecciono el link <link>
      #|link|
      #|<link>|
    Entonces Me direcciona a la pagina inicial <pagina>
      #|pagina|
      #|<pagina>|
    Ejemplos:
      |Seleccionado|link|pagina|
      |Links|Home|demoqa.com|
      |Links|HomeFQTwx|demoqa.com|

  Escenario: Comprobar los links de el enunciado "Following links will open new tab"

    Dado que como usuario me encuentro en la pagina <Links>
    Cuando selecciono el link <HomeFQTwx>
    Entonces  Me direcciona a la pagina inicial <demoqa.com>

      #Items parte Titulo 2 links

  Escenario: Comprobar los links de el enunciado "Following links will send an api call"

    Dado que como usuario me encuentro en la pagina <Seleccionado>
      |Seleccionado|
      |<Seleccionado>|
    Cuando selecciono el link <link>
      |link|
      |<link>|
    Entonces Me deberia mostrar un mensaje que diga <mensaje>"
      |mensaje|
      |<mensaje>|
    Ejemplos:
      |Seleccionado|link|mensaje|
      |Links|Created|Link has responded with staus 201 and status text Created|
      |Links|No Content|Link has responded with staus 204 and status text No Content|
      |Links|Moved|Link has responded with staus 301 and status text Moved Permanently|
      |Links|Bad Request|Link has responded with staus 400 and status text Bad Request|
      |Links|Unauthorized|Link has responded with staus 401 and status text Unauthorized|
      |Links|Forbidden|Link has responded with staus 403 and status text Forbidden|
      |Links|Not Found|Link has responded with staus 404 and status text Not Found|



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