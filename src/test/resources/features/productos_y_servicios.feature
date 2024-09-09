Feature: Validar documento PDF en cuenta de ahorro comercial

  Como usuario del sistema
  Quiero ingresar a Banistmo Web dirigirme a cuenta de ahorro comercial
  Para descargar el pdf y verificar la informacion contenida

  Background: Abrir Navegador
    Given que el usuario ingresa a Banistmo Web

    Scenario: Descargar PDF Cuenta de Ahorro Comercial
      When selecciono productos y servicios, luego depositos
      And elijo cuenta de ahorro comercial para descargar el pdf
      Then verifico la informacion contenida en el pdf