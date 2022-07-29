Feature: Creating new vehicle contract functionality.

  User story : As a posmanager, I should be able to create a new Vehicle Contract.

  Background: For the scenarios in the feature file, user is expected to be on the login page
    Given user is on the upgenix login web page
    When User enters correct email "posmanager15@info.com" - password "posmanager" and hits enter
    Then User login and verify that the title contains "Odoo"

    Scenario: User can reach New Vehicle Contracts Form by clicking Vehicles --> Vehicles Contracts --> Create
      When user clicks on more module from the homepage
      And user clicks on fleet option
      And user clicks on vehicles contracts button from vehicle page
      And user clicks on create button
      Then user verifies that the title contains "Vehicles Contracts - Odoo"
  @ayse
      Scenario: User can create a new Contract (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
        When user chooses the option Audi/A1/1-AUD-001 from vehicle dropdown
        And user chooses Leasing option from the type dropdown
        And user can enter "129,90" as a valid amount in the Activation Cost case
        And user chooses the option Weekly from the Recurring Cost Amount dropdown and gives "9,90" as a valid recurring cost amount
        And user clicks on save button
        Then user verify that the title contains "Audi/A1/1-AUD-001 / Leasing / 2022-07-28 - Odoo"

        Scenario: User sees an error message "The following fields are invalid" if vehicle name field leaves blank
          When user clicks on more module from the homepage
          And user clicks on fleet option
          And user clicks on vehicles contracts button from vehicle page
          And user clicks on create button
          And user clicks on save button
          Then user sees : "The following fields are invalid" error message

          Scenario: User is able to see the vehicle name after creating a new vehicle contract
            When user chooses the option Audi/A1/1-AUD-001 from vehicle dropdown
            And user chooses Leasing option from the type dropdown
            And user can enter "129,90" as a valid amount in the Activation Cost case
            And user chooses the option Weekly from the Recurring Cost Amount dropdown and gives "9,90" as a valid recurring cost amount
            And user clicks on save button
            Then user verify that title contains "Audi/A1/1-AUD-001/Leasing/2022-07-25 - Odoo"

            Scenario: User is able to see created vehicle is listed after clicking the Vehicles Contracts module
              When user chooses the option Audi/A1/1-AUD-001 from vehicle dropdown
              And user chooses Leasing option from the type dropdown
              And user can enter "129,90" as a valid amount in the Activation Cost case
              And user chooses the option Weekly from the Recurring Cost Amount dropdown and gives "9,90" as a valid recurring cost amount
              And user clicks on save button
              And user clicks on vehicles contracts
              Then user verifies that vehicle name is listed in vehicle contracts module

