@regression
Feature: Sign-in functionality

  Scenario: TC-1 NHS Positive Login Test
    Given the user navigate to the NHS website
    And User validates the url of the page
    When the user enter the valid username and valid password
    And the user click the Sign in button
    Then the user validates title

  Scenario: TC-2 NHS Negative Login Test with invalid password
    Given the user navigate to the NHS website and try login
    And User validates the url of the main page
    When the user enter the valid username and invalid password
    Then the user press the Sign in button

  Scenario: TC-3 NHS Negative Login Test with empty password
    Given the user navigated to the NHS website
    And User validated the url of the main page
    When the user enter the valid username and empty password
    And the user clicked the Sign in button
#    Then the user validates the error message







