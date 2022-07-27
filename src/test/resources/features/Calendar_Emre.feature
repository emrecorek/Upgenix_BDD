@UPGNX-461
Feature: As a Posmanager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module


  Background: Login successfully
    When user goes to the login page
    And user enters correct credentials and login successfully
      | username | posmanager15@info.com |
      | password | posmanager            |


  @UPGNX-456
  Scenario: User first lands on weekly display
    When user clicks calendar
    Then user verify weekly display

  @UPGNX-457
  Scenario: User can change display between Day-Week-Month
    Given user clicks calendar
    When user clicks on the day section
    And user sees daily display
    And user clicks on the month section
    And user sees monthly display
    And user clicks on the week section
    Then user sees weekly display

  @UPGNX-458
  Scenario: User can create event by clicking on time box on daily display
    Given user clicks calendar
    When user clicks on the day section
    And user click on any time box
    And user sees little create box
    And user writes the summary of the event in the inbox
    Then user clicks on the create button and sees event

  @UPGNX-459
  Scenario: User can edit a created event
    Given user clicks calendar
    When user clicks on the day section
    When user clicks on the created event
    And user sees event in the opening box
    And user clicks the edit button
    And user sees edit box
    And user writes new summary in the meeting subject inbox "Business Meeting"
    And user clicks the save button
    Then user sees the edited event name "Business Meeting"

  @UPGNX-460
  Scenario: User can delete a created event
    Given user clicks calendar
    When user clicks on the day section
    When user clicks on the created event
    And user clicks the delete button and verify event is deleted




