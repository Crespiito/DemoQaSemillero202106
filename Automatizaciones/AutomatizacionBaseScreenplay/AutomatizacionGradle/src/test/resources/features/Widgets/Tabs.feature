#language: es


Característica: Como usuario deseo verificar la funcionalidad "Tabs" del modulo "Widgets"
  @TestWidgets

  Escenario: Validar que en la lista "Widgets" aparezca el item "Tabs"
    Dado Yo como usuario ingreso al modulo "Widgets"
    Cuando Selecciono "Tabs"
    Entonces Visualice las pestanas "What" "Origin" "Use" y "More"

  Escenario: Validar que funcione el evento "Tabs"
    Dado Yo como usuario ingreso a la pestana "Tabs"
    Cuando Selecciono la pestana "What"
    Entonces Visualice el texto en la pestana

  Escenario: Validar que funcione el evento "Tabs"
    Dado Yo como usuario ingreso a la pestana "Tabs"
    Cuando Selecciono la pestana "Origin"
    Entonces Visualice el texto en la pestana

  Escenario: Validar que funcione el evento "Tabs"
    Dado Yo como usuario ingreso a la pestana "Tabs"
    Cuando Selecciono la pestana "Use"
    Entonces Visualice el texto en la pestana


  Escenario: Validar que funcione el evento "Tabs"
    Dado Yo como usuario ingreso a la pestana "Tabs"
    Cuando Selecciono la pestana "More"
    Entonces No cambie de pestana o Visualice un texto diferente al previamente seleccionado