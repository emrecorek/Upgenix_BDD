@UPGNX-442
Feature: US-003 Inventory Functionality AUTOMATION
@salesmanager @UPGNX-449
Scenario: Login as SalesManager / For the scenarios in the feature file, user is expected to be on login page
Given user is on the login page
When user enters SalesManager username
And user enters SalesManager password
And user click login button
Then user should see the dashboard

   #AC1
  @ac1 @UPGNX-450
  Scenario: Verify that User can reach New Products Form by clicking Inventory --> Products --> Create
    When user click inventory button
    And user click product button
    Then User click create button
    Then User success verifies that title contains "New - Odoo"

