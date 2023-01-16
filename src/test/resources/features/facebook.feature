@facebookScenarios
Feature: Facebook Page Related Scenarios

  Background: Navigate to page
    Given I open url of Facebook "https://www.facebook.com"

@FB-01
  Scenario: Verify User can create account in Facebook
    Then User verify url of current page is "https://www.facebook.com/"
    Then Verify "Create new account" section on the page
    And Fill in the First Name, Last name, email address, new password
    Then Update the date of birth in the drop-down.
    And Select gender
    Then Click on Create an account Sign Up
    And Verify that the account is created successfully
