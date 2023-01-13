@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @QA-01
  Scenario: Verify title of the page
    When Verify title of page "QA Automation Tools Trainings and Tutorials | QA Tech Hub"
    When User opens url of Facebook "https://www.facebook.com"
    Then User verifies url of current page is "https://www.facebook.com/"
    And User navigates back to QA Tech Hub website
    Then User prints the URL of the current page
    And User navigates forward
    Then User reloads the page.

