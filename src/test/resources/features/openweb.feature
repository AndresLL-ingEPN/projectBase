@flujoCompleto
Feature: Flujo completo de usuario

  Background:
    Given que el "cliente" abre el sitio web de pruebas

  Scenario: Registro, login y transferencia de dinero
    When el usuario se registra con los datos
    Then deberia ver un mensaje de bienvenida
    And el cliente inicia sesion con credenciales validas
    Then deberia ver su dashboard personal
    When el cliente abre una nueva cuenta
    Then deberia ver la cuenta creada exitosamente
    When transfiere 10 dolares entre dos cuentas
    Then deberia ver confirmacion de transferencia exitosa