Feature: yo quiero hacer las validaciones de la funcionalidad PIM

  @Regresion
  @HU002
  Scenario Outline: Add employee
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And el usuario llega hasta agregar empleado
    When el usuario ingresa first name <firstName> middle Name <middleName>  last name <lastName>


    Examples:

      | userName |  | password |  firstName | middleName  | lastName  |
      | admin    |  | admin123 |  Dallana   | Paola       | hernandez |
