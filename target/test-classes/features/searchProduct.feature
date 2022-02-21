Feature: Search and Place the order for Products

  @Offer
  Scenario Outline: : Seearch Exprience for the product search in both home and offes page
    ## Scenario: Search Exprience for the product search in both home and offes page
    Given User in GreenKart Landing page
    When User searched with Shortname <Name> and extracted actual name of product
    ## When user searched with Shortname "Tom" and extracted actual name of product
    ## Then user serached for "Tom" same shortname in offers page to check if product exist with same name
    Then User serached for <Name> same shortname in offers page to check if product exist with same name
    And validate product name in offers page matches with Landing Page

    Examples: 
      | Name |
      | Tom  |
      | Beet |
