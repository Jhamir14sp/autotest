Feature: Login Store
@testStore
  Scenario: Login Satisfactorio

    Given estoy en la pagina de login de la tienda
    When ingreso el correo "jk.benites@gmail.com"
    And ingreso la clave "12345"
    And hago clic en Inicar Sesión
    Then valido la pagina principal "Bienenido Jean"