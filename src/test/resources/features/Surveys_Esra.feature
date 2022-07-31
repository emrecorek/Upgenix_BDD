@UPGNX-468
Feature: Upgnx Surveys Functionality feature

  User Story:
  As a Posmanager, I should be able to create and design a new survey from "Surveys" module
   #@UPGNX-469
  Background: for the scenarios in the feature file, user is expected to be on upgenix homepage
    Given User is on the login page
    When User enters the valid credentials
    Then User is on homepage and verifies that title contains "Odoo"
  @UPGNX-464
  Scenario: User can reach New Survey Form by clicking Surveys module and then Create button
    When User clicks on the Surveys module and verifies the title is "Surveys - Odoo"
    And User clicks on the Create button on the Surveys page
    Then User verifies that the Title Form sheet is visible
  @UPGNX-465
  Scenario: Verifying that the error message "The following fields are invalid:" is appeared when Survey Title field is left blank
    When User clicks on the Surveys module and verifies the title is "Surveys - Odoo"
    And User clicks on the Create button on the Surveys page
    And User clicks on the Save button by leaving blank the Survey Title input
    Then User should see the error message "The following fields are invalid:"
  @UPGNX-466
  Scenario: Verifying that the "Survey created" message appears under the survey form sheet
    When User clicks on the Surveys module and verifies the title is "Surveys - Odoo"
    And User clicks on the Create button on the Surveys page
    And User fills in the Survey Title input and clicks on the Save button
    Then User verifies the "Survey created" message under the survey form sheet
  @UPGNX-467
  Scenario: Verifying that the created survey is listed after clicking the Surveys module.
    When User clicks on the Surveys module
    And User clicks on the Create button on the Surveys page
    And User fills in the Survey Title input and clicks on the Save button
    Then User verifies that the created survey is listed on the Surveys page
