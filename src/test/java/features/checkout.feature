Feature: Place the order for Products

  @PlaceOrder
  Scenario Outline: : Seearch Exprience for the product search in both home and offes page
    Given User in GreenKart Landing page
    When User searched with Shortname <Name> and extracted actual name of product
    And Added items of Checkout and validate the items in checkout page
    Then User proceeds to Checkout the items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples: 
      | Name |
      | Tom  |
      | Beet |