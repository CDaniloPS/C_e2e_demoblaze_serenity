Feature: Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página demoblaze

  Background:
   # Given what the user enter to page https://www.demoblaze.com/
   
    Scenario: Buy products in Store
    Given what Guest enter to the home page
    When he add two products to the cart
    And he view to the cart
    Then he complete the purchase form
    And he finish Checkout
