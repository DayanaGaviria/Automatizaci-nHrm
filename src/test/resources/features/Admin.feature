Feature: yo como usuario uiero validar las diferentes opciones del modulo

  @Regresion
    @HU003
  Scenario Outline: Consulta de usuario
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And el usuario llego hasta admin
    When el usuario esta buscando users <typeRole>


    Examples:

      | userName |  | password |  |typeRole|
      | admin    |  | admin123 |  | ESS    |