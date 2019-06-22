Feature: Login

  @PoC
  Scenario: Login to CCA
    Given login to the application
    When  Profile icon is visible
    Then  Verify the page title