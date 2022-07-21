
Feature: Upgenix sales functionality feature
  User Story:

  As a User, I should be able to create and edit a new customers from "Sales" module

  Background:For the scenarios in the feature file, user is expected to be logged in as a salesmanager

    Given User is on the upgenix login page
    When User enters valid email "salesmanager15@info.com" - password "salesmanager" and hits enter
    Then User login successfully verify that title contains "Odoo"
  @wip
  Scenario: User can reach New Customer Form by clicking Sales-Customers-Create
    When User clicks on Sales button
    And User clicks on Customers button
    And User clicks on Create button
    Then User successfully verifies that title contains "New "
