@UPGNX-454
Feature: US-003 Inventory Functionality AUTOMATION

  Background: Login as SalesManager / For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page
    When user enters SalesManager username
    And user enters SalesManager password
    And user click login button
    Then user should see the dashboard

   #AC1
  @UPGNX-450
  Scenario: Verify that User can reach New Products Form by clicking Inventory --> Products --> Create
    When user click inventory button
    And user click product button
    Then User click create button
    Then User success verify that title contains "New - Odoo"
   #AC2
  @UPGNX-451

  Scenario: Verify that if Product name field leaves blank, an error message
  "The following fields are invalid:" is appeared.
    When user click inventory button
    And user click product button
    Then User click create button
    When user leaves blank product name
    And user click save button
    Then user see error message "The following fields are invalid:"
