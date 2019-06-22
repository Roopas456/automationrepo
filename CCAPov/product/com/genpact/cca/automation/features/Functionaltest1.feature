@FunctionalTest
 Feature: Facebook Application
 
 @SmokeTest  @RegressionTest
 
 Scenario:Successfull Login
 Given  Open Chrome and start Application
 When Enter the Username and Password
 And Click on the Login button
 Then User should be able to login successfully
 
 
 @RegressionTest
 
 
 Scenario:Unsuccessfull Login
 
Given  Open Chrome and start Application
 When Enter the Incorrect Username and Password
 And Click on the Login button
 Then User should not be able to login successfully
 
 
 @SmokeTest
 Scenario: Add a product to bag
 Given This is a blank test
 
 