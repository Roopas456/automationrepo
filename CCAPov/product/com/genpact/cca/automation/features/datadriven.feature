Feature: Amazon order placing
 Scenario Outline: check user is able to place order successfully
 Given login to my application
 When User  search product "<Product>"
 And Add to cart
 And click on buy now
 And Click on place order
 Then user should be able to place order
 
 Examples:
 |Product|
 |tshirt|
 |jeans|