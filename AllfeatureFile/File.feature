Feature: Test the grur99 Application

  Scenario: Test the register page
    Given: User is on registerpage
    When: User enters firstname,lastname,phone,email
    When: User enters adress,city,state,postal and country
    When: User enters username,password and confirm password
    And: Clicks on submit button
