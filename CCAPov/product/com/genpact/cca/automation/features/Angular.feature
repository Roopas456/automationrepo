Feature: Angular test

  @PoC
  Scenario Outline: Angular paths test
    Given open to the application
    When  page is opened 
    Then  Verify title
    Then enter value in "<textName>"
    
    Examples:
    |textName|
    |dell|
    |text|
    
